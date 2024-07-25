# TRIGGERS
# >=versión 5.0.2 de mysql
# Es algo que se dispara cuando hay un evento en un cierto momento(BEFORE, AFTER).
# Se usan para INSERTAR, ACTUALIZAR y BORRAR registros de otras tablas
# Utilidades: Por ejemplo, generar registros de logs

CREATE DATABASE escuela;

USE escuela;

CREATE TABLE acciones (
	id int not null auto_increment primary key,
    accion varchar(200) null,
    fecha datetime null default current_timestamp
);

INSERT INTO acciones (id, accion, fecha) VALUES
(1,'Corregir examentes',current_timestamp()),
(2,'Limpiar aulas',current_timestamp()),
(3,'Preparar clases',current_timestamp()),
(4,'Repasar asistencias',current_timestamp());

CREATE TABLE alumnos (
	id_alumno int primary key auto_increment, 
	nombre varchar(20), 
	apellidos varchar(20), 
	curso varchar(20)
);

INSERT INTO alumnos (nombre, apellidos, curso) VALUES
('Pablo','Maquieira','programacion'),
('Carla','Lopez','diseño'),
('Ŕober','Zemeckis','diseño');

SELECT * FROM acciones;
TRUNCATE acciones;

# TRIGGER 
DELIMITER $$
CREATE TRIGGER log_info AFTER INSERT ON alumnos
FOR EACH ROW 
BEGIN
		INSERT INTO acciones (accion) VALUES ('Se ha registrado un alumno');
END $$
DELIMITER ;

INSERT INTO alumnos (nombre, apellidos, curso) VALUES
('Car','Perex','programacion'),
('Lucas','Pato','diseño'),
('Snoopy','Perro','diseño');

SELECT * FROM acciones;

# TRIGGER 
DELIMITER $$
CREATE TRIGGER log_info_2 AFTER INSERT ON alumnos
FOR EACH ROW 
BEGIN
		INSERT INTO acciones (accion) VALUES (concat('Se ha registrado el alumno ',NEW.nombre ) );
END $$
DELIMITER ;

/** Borra los triggers anteriores si tienes algunos e inserta en la tabla acciones " Se ha modificado 
el alumno x con apellidos y" cada vez que hasgas unsa modificacion en alguna tupl
*/ 
DROP TRIGGER log_info;
DROP TRIGGER log_info_2;

DELIMITER $$
CREATE TRIGGER log_info AFTER INSERT ON alumnos
FOR EACH ROW 
BEGIN
		INSERT INTO acciones (accion) VALUES (concat('Se ha registrado el alumno ',NEW.nombre , ' con apellidos ', NEW.apellidos) );
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER log_info_update AFTER UPDATE ON alumnos
FOR EACH ROW 
BEGIN
		INSERT INTO acciones (accion) VALUES (concat('Se ha modificado el alumno ',OLD.nombre ,' ', OLD.apellidos , ' con datos ', NEW.nombre,' ' ,NEW.apellidos) );
END $$
DELIMITER ;

UPDATE alumnos 
SET apellidos = "Perez" 
WHERE  id_alumno = 2;

SELECT * FROM acciones;

DROP TRIGGER log_info_update;

#Borra los triggers anteriores
#Crea un trigger que inserte en acciones "Se ha borrado con éxito el alumno de nombre x y apellidos y" cuando se elimine una tupla en la tabla alumno.
DROP TRIGGER log_info;
DROP TRIGGER log_info_update;

DELIMITER $$
CREATE TRIGGER log_info_delete AFTER DELETE ON alumnos
FOR EACH ROW 
BEGIN
		INSERT INTO acciones (accion) VALUES (concat('Se ha eliminado el alumno ',OLD.nombre , ' ', OLD.apellidos) );
END $$
DELIMITER ;

DELETE FROM alumnos WHERE  id_alumno = 1;

SELECT * FROM acciones;