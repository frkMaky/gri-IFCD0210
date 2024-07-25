# Ejercicio Triggers: https://drive.google.com/file/d/1CP4ZSpcJJyv-0F8IFVjnG0BHPou5rrum/view

CREATE DATABASE test;

USE test;

CREATE TABLE alumnos (
	id int primary key,
	nombre varchar(50),
	apellido1 varchar(50),
	apellido2 varchar(50),
	nota decimal(4,2)
);

/** Trigger 1: trigger_nota_before_insert
Si el valor de la nota es negativo guarda 0
Si es mayor que 10  se guarda como 10 */
DELIMITER $$
CREATE TRIGGER trigger_nota_before_insert BEFORE INSERT ON alumnos
FOR EACH ROW
BEGIN 
	IF NEW.nota < 0 THEN SET NEW.nota = 0; 
    END IF;
    IF NEW.nota > 10 THEN SET NEW.nota = 10; 
    END IF;
END $$
DELIMITER ;
/** Trigger 2: trigger_nota_before_update
Si el valor de la nota es negativo guarda 0
Si es mayor que 10  se guarda como 10 */
DELIMITER $$
CREATE TRIGGER trigger_nota_before_update BEFORE UPDATE ON alumnos
FOR EACH ROW
BEGIN 
	IF NEW.nota < 0 THEN SET NEW.nota = 0; 
    END IF;
    IF NEW.nota > 10 THEN SET NEW.nota = 10; 
    END IF;
END $$
DELIMITER ;


INSERT INTO alumnos (id, nombre, apellido1, apellido2, nota) VALUES
(1, 'Pablo', 'Maquieira', 'Varela', 11),	/* nota = 10 */ 
(2, 'Paco', 'Gonzalez', 'Perez', 10), 		/* nota = 10 */ 
(3, 'Pepe', 'Perez', 'Gonzalez', 9), 		/* nota = 9 */ 
(4, 'Paolo', 'Gonzalez', 'Perez', -1), 		/* nota = 0 */ 
(5, 'Poochie', 'Perez', 'Gonzalez', 0), 	/* nota = 0 */ 
(6, 'POlo', 'Gonzalez', 'Perez', 1); 		/* nota = 1 */ 

UPDATE alumnos SET nota=-1 WHERE id = 1; 	/* nota = 0 */ 
UPDATE alumnos SET nota=0 WHERE id = 2; 	/* nota = 0 */ 
UPDATE alumnos SET nota=1 WHERE id = 3; 	/* nota = 1 */ 
UPDATE alumnos SET nota=9 WHERE id = 4; 	/* nota = 9 */ 
UPDATE alumnos SET nota=10 WHERE id = 5; 	/* nota = 10 */ 
UPDATE alumnos SET nota=11 WHERE id = 6; 	/* nota = 10 */ 


## ADD campo email
ALTER TABLE alumnos ADD email varchar(50);

/* Escribe un procedimiento llamado crear_email que dados los parametros de entrada, nombre, apellio1, apellido2 y dominio 
cree una direccion de email y la devuelva como salida
primer caracter del nombre, 3 caracteres del apeelido1, 3 caracterres del apellido2, el caracter @, el dominio pasado como parametro
*/
DELIMITER $$
CREATE PROCEDURE crear_email (
	IN nombre varchar(50),
    IN apellido1 varchar(50),
    IN apellido2 varchar(50),
    IN dominio varchar(50),
    OUT email varchar(50)
)
BEGIN 
    SET email = concat (LOWER (SUBSTRING(nombre, 1, 1)), LOWER(SUBSTRING(apellido1, 1, 3)), LOWER(SUBSTRING(apellido2, 1, 3)), '@', dominio );
END $$
DELIMITER ;

CALL crear_email('Pablo','Maquieira','Varela','gri.es',@email);
SELECT @email;

/* Trigger: trigger_crear_email_before_insert 
si el email es NULL, se llama a crear_mail, sino se pasa el que se introduzca
*/ 
DELIMITER $$
CREATE TRIGGER trigger_crear_email_before_insert BEFORE INSERT ON alumnos 
FOR EACH ROW
BEGIN 
	declare correo varchar(50);
	IF NEW.email IS null THEN 
		CALL crear_email(NEW.nombre, NEW.apellido1, NEW.apellido2, 'gri.es',correo);
        SET NEW.email = correo;
	END IF;
END $$
DELIMITER ;

INSERT INTO alumnos (id, nombre, apellido1, apellido2, nota, email) VALUES
(7, 'Pablo', 'Maquieira', 'Varela', 11, null),	
(8, 'Pablo', 'Maquieira', 'Varela', 11 , 'pmaquie@gmail.com');	


/** Trigger: trigger_guardar_email_after_update*/
CREATE TABLE log_cambios_email(
	id int primary key auto_increment,
    id_alumno int,
    fecha_hora datetime default current_timestamp(),
    old_email varchar(50)
);

DELIMITER $$
CREATE TRIGGER trigger_guardar_email_after_update AFTER update ON alumnos
FOR EACH ROW 
BEGIN 
	INSERT INTO log_cambios_email (id_alumno, fecha_hora, old_email) VALUES
    (NEW.id, current_timestamp(), OLD.email);
END $$
DELIMITER ;

UPDATE alumnos SET apellido1='Maky', email='pmaquievar@gmail.com' WHERE id = 8; 

/** Trigger: trigger_guardar_alumnos_eliminados */
CREATE TABLE log_alumnos_eliminados(
	id int primary key auto_increment,
	id_alumno int,
    fecha_hora datetime default current_timestamp(),
    nombre varchar(50),
    apellido1 varchar(50),
    apellido2 varchar(50),
    email varchar(50)
);

DROP TRIGGER trigger_guardar_alumnos_eliminados;
DELIMITER $$
CREATE TRIGGER trigger_guardar_alumnos_eliminados BEFORE DELETE ON alumnos
FOR EACH ROW 
BEGIN 
	INSERT INTO log_alumnos_eliminados (id_alumno, nombre, apellido1, apellido2, email) VALUES
    (OLD.id, OLD.nombre, OLD.apellido1,OLD.apellido2,OLD.email);
END $$
DELIMITER ;

DELETE FROM alumnos WHERE id = 7;
