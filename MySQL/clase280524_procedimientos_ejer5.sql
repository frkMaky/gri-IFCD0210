/** 
Trabajo de clase > Bases de Datos >  Procedimientos2 > procedimientos_ejer5
https://drive.google.com/file/d/1xX_3KltGmGB762-_6LhTzq01Ly09fEDp/view
**/
USE sample_db;

CREATE TABLE studentMarks (
	stud_id SMALLINT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    total_marks INT, 
    grade VARCHAR(5)
);

INSERT INTO studentMarks(total_marks, grade) VALUES
(450, 'A'), 
(480,'A+'), 
(490, 'A++'), 
(440, 'B+'),
(400, 'C+'),
(380,'C'),
(250, 'D'),
(200,'E'),	     
(100,'F'),
(150,'F'),
(220, 'E');

/** Crea un procedimiento almacenado que muestre los datos de la tabla studentMarks */
DELIMITER $$
CREATE PROCEDURE getStudents()
BEGIN 
	SELECT * FROM studentMarks;
END $$
DELIMITER ;

CALL getStudents();

/** Para ampliar el ejemplo anterior para recuperar datos de estudiantes, creemos un procedimiento para 
recuperar los detalles de los estudiantes con el ID de estudiante pasado como parametro de entrada */
DELIMITER $$
CREATE PROCEDURE getStudentsById(IN ID INT)
BEGIN 
	SELECT * FROM studentMarks WHERE ID = stud_id;
END $$
DELIMITER ;

CALL getStudentsById(1);

/** Por ejemplo: supongamos que queremos calcular las calificaciones promedio de todos los estudiantes de 
	la tabla studentMarks y cevolver el promedio con un campo OUT
 */
DELIMITER $$
CREATE PROCEDURE getAvgQualification(OUT promedio DOUBLE)
BEGIN 
	SET promedio = (SELECT avg(total_marks) FROM studentMarks);
END $$
DELIMITER ;

CALL getAvgQualification(@media);
SELECT @media as 'Media Notas';
 
/** Supongamos que necesitamos tener un procedimiento que tome un valor inicial del contador y lo incremente 
	con un numero determinado
*/ 
DELIMITER $$
CREATE PROCEDURE setIncremento(IN incremento INT, INOUT contador INT)
BEGIN 
	SET contador = contador + incremento;
END $$
DELIMITER ;

SET @contador = 3; 				 # valor inicial del contador = 3
CALL setIncremento(5,@contador); # se ejecuta incremento + 5
SELECT @contador;				 # valor final contador = 8

/** encontrar el recuento de estudiantes que obtienen
calificaciones por debajo del promedio de todos los estudiantes. */ 
DELIMITER $$
CREATE PROCEDURE getDebajoMedia(OUT contador INT)
BEGIN
	SET contador  = (SELECT count(*) FROM studentMarks WHERE total_marks < (SELECT avg(total_marks) FROM studentMarks ) );
END $$
DELIMITER ;

CALL getDebajoMedia(@contador);
SELECT @contador as 'Nº por debajo de la media';

/** Muestra los procemientos que esten en la base de dados sample_db */
SHOW PROCEDURE STATUS WHERE Db LIKE 'sample_db'; 

/**  .
#1) Primero, se llama spGetIsAboveAverage y devolvería un valor booleano si las calificaciones de los estudiantes están por encima del promedio o no.
	Calcule el PROMEDIO usando la función AVG y almacene los resultados en una variable local.
    Obtenga marcas para la identificación del estudiante aprobada en la llamada a la función.
    Compare las calificaciones de los estudiantes con las calificaciones promedio y devuelva el resultado como 0 o 1.
    
*/
DELIMITER $$
CREATE PROCEDURE spGetIsAboveAverage(IN studId INT, OUT porEncima BOOL)
BEGIN 
	DECLARE media INT;
    DECLARE nota INT;
    SET media = (SELECT avg(total_marks) FROM studentMarks);
    SET nota = (SELECT total_marks FROM studentMarks WHERE stud_id = studId) ;
    IF media < nota THEN
		SET porEncima = true;
	ELSE 
		SET porEncima = false;
	END IF;
END $$
DELIMITER ;

CALL spGetIsAboveAverage(3,@porEncima);
SELECT @porEncima;
/**
#2) El segundo se llama spGetStudentResult : pasará StudentId como entrada (IN) y esperará el resultado como parámetro de salida (OUT).
	Llama al primer procedimiento spGetIsAboveAverage
	Utilice el resultado obtenido en el paso 1) y establezca el resultado en PASA o FALLA dependiendo de que el valor del paso 1) sea 1 o 0 respectivamente.
*/
DELIMITER $$
CREATE PROCEDURE spGetStudentResult(IN StudentId INT, OUT resultado VARCHAR(10))
BEGIN 
	DECLARE pasa INT;
    CALL spGetIsAboveAverage(StudentId, pasa);
    IF pasa = 1 THEN
		SET resultado = 'PASA';
	ELSE
		SET resultado = 'FALLA';
	END IF;
END $$
DELIMITER ;

CALL spGetStudentResult(7, @resultado);
SELECT @resultado; 

/** Crea una funcion que muestre el nº de tuplas cuya calificaciones superen los 400 puntos */
DELIMITER $$
CREATE FUNCTION getOver400() 
RETURNS INT 
READS SQL DATA
BEGIN 
	DECLARE resultado INT;
	SET RESULTADO = (SELECT count(*) FROM studentMarks WHERE total_marks > 400);
	RETURN resultado; 
END $$
DELIMITER ;
 
SELECT getOver400();

/* 	Usando el condicional id crea una funcion que tenga un parametro de entrada que sea 
	un numero entre 0 y 10 y si es menos que 5 muestra "menor que 5" y si no muestra "mayor o igual a 5" */
    
DELIMITER $$
CREATE FUNCTION comparadorCinco(numero int) RETURNS VARCHAR(20) NO SQL
BEGIN 
	DECLARE resultado VARCHAR(20);
	IF numero < 5 THEN
		SET resultado = "Menor que 5";
	ELSE 
		SET resultado = "Mayor o Igual a 5";
	END IF;
    RETURN resultado;
END $$
DELIMITER ;

SELECT comparadorCinco(3);
SELECT comparadorCinco(5);
SELECT comparadorCinco(8);

/* Usando el condicional if crea una funcion que tenga dos parametros de entrada que seana numeros comprendidos 0 y 10 y 
si el resultado está entra 0 y 9 decimos que es "ES MENOR A 10", si esta entre 10 y 14 decimos "ES MENOR a 15"
y si es mayor o igual a 15 es "ES MAYOR O IGUAL A 15"
*/

DELIMITER $$
CREATE FUNCTION estupidezDeHoy(numero int) returns varchar(50) NO SQL
BEGIN
	DECLARE resultado varchar(50);
    IF (numero < 10) THEN
		SET resultado = "ES MENOR A 10";
	ELSEIF numero < 15 THEN
		SET resultado = "ES MENOR a 15";
	ELSEIF numero >= 15 THEN
		SET resultado = 'ES MAYOR O IGUAL A 15';
	END IF;
	return resultado;
END $$
DELIMITER ;

SELECT estupidezDeHoy (0);
SELECT estupidezDeHoy (9);
SELECT estupidezDeHoy (14);
SELECT estupidezDeHoy (15);
SELECT estupidezDeHoy (16);

/* Modifica la funcion anterior para que retorne la " La suma de x e y es " menos a 10,/ menor a 15 /es mayor o igual a 15
utiliza la funcion concat()
*/ 
DELIMITER $$
CREATE FUNCTION estupidezDeHoy (x int, y int) returns varchar(50) NO SQL
BEGIN
	DECLARE resultado int;
    DECLARE sentencia varchar(50);
    
    SET sentencia =  concat("La suma de ", x, " + ", y, " = ");
    SET resultado = x + y;
    
    IF resultado < 10 THEN 
		SET sentencia = concat ( sentencia, " menos de 10") ;  
    ELSEIF resultado < 15 THEN
		SET sentencia = concat ( sentencia, " menos de 15") ;
    ELSEIF resultado >= 15 THEN
		SET sentencia = concat ( sentencia, " mayor o igual a 15") ;
    END IF; 
    
    return sentencia;
END $$
DELIMITER ;

SELECT estupidezDeHoy (0,2);
SELECT estupidezDeHoy (5,4);
SELECT estupidezDeHoy (10,4);
SELECT estupidezDeHoy (10,5);
SELECT estupidezDeHoy (11,5);

/* Utilizando el case crea un procedimiento que tenga un parametro de entrada que sea un numero
 si ese numero es 2 muestra "ES DOS" y si es 3 muestra "ES TRES" y en el resto de casos "NO SE SABE"
*/
DELIMITER $$
CREATE PROCEDURE compruebaNumero(IN numero INT)
BEGIN 
	DECLARE resultado varchar(50);
	CASE numero
		WHEN 2 THEN SET resultado = "ES DOS";
		WHEN 3 THEN SET resultado = "ES TRES";
        ELSE SET resultado = "NO SE SABE";
    END CASE;
    SELECT resultado;
END $$
DELIMITER ;

CALL compruebaNumero(2);
CALL compruebaNumero(3);
CALL compruebaNumero(4);

/* Crea una funcion con 1 parametro de entrada que es un numero 
Comprueba si ese numero es par. Si es par muestra "ES PAR" en caso 
contrario muestra "ES IMPAR". Luego si es 5 muestra "ES MULTIPLO DE 5"
si es 7 muestra "es multiplo de 7" . El resto de casos "No se sabe de quien es multiplo" */
DELIMITER $$
CREATE FUNCTION esParMultiplo(numero int) returns varchar(100) no sql
BEGIN
	DECLARE resultado varchar(100);
    if numero%2 = 0 then
		set resultado = "ES PAR ";
	else 
		set resultado = "ES IMPAR ";
	end if;
    
    case 
		when (numero%5=0) then set resultado = concat(resultado," ES MULTIPLO DE 5");
		when (numero%7=0) then set resultado = concat(resultado," ES MULTIPLO DE 7");
		else set resultado = concat(resultado," No se sabe de quien es multiplo");
    end case;
    
    return resultado;
END $$
DELIMITER ;

SELECT esParMultiplo(5);
SELECT esParMultiplo(7);
SELECT esParMultiplo(2);

/* loop */
DELIMITER $$
CREATE PROCEDURE doiterate(p1 INT)
BEGIN
	label1: LOOP
	SET p1 = p1 + 1;
	IF p1 < 10 THEN
		ITERATE label1;
	END IF;
		LEAVE label1;
	END LOOP label1;
	SET @x = p1;
END $$
DELIMITER ;

call doiterate(5);
selecT @X;

/** repeat */

DELIMITER $$
DROP PROCEDURE IF EXISTS ejemplo_bucle_repeat$$
CREATE PROCEDURE ejemplo_bucle_repeat(IN tope INT, OUT suma INT)
BEGIN
	DECLARE contador INT;
	SET contador = 1;
	SET suma = 0;
	REPEAT
		SET suma = suma + contador;
		SET contador = contador + 1;
		UNTIL contador > tope
	END REPEAT;
END
$$
DELIMITER ;


/* Realiza una funcion con un parametro de entrada que es un numero y te piden que escribas el numero repetido 3 veces*/
DELIMITER $$
CREATE FUNCTION repetirNumero (numero int) returns varchar(10) no sql
BEGIN 
	declare resultado varchar(10);
	declare contador int;
    set contador = 3;
    set resultado = '';
    REPEAT
		SET resultado = concat(resultado,numero);
        SET contador = contador - 1;
	UNTIL (contador = 0)
    END REPEAT;
    return resultado;
END $$
DELIMITER ;

SELECT repetirNumero(3);
SELECT repetirNumero(4);

/* while */
DELIMITER $$
DROP PROCEDURE IF EXISTS ejemplo_bucle_while$$
CREATE PROCEDURE ejemplo_bucle_while(IN tope INT, OUT suma INT)
BEGIN
	DECLARE contador INT;
	SET contador = 1;
	SET suma = 0;
	WHILE contador <= tope DO
		SET suma = suma + contador;
		SET contador = contador + 1;
	END WHILE;
END
$$
DELIMITER ;
CALL ejemplo_bucle_while(10, @resultado);
SELECT @resultado;

/* Crea un procedimiento con parametro e entrada un numero y que devuelva 
el numero anterior, el anterior al anterior, y el anterior al anterior */
DELIMITER $$
CREATE PROCEDURE haciaAtras(IN numero INT)
BEGIN 
	declare resultado varchar(100);
    declare contador int;
    set contador = 0;
    set resultado = '';
    WHILE contador <= 2 DO 
		set resultado = concat(resultado, numero+contador, ' ');
        set contador = contador + 1;
	END WHILE;
    SELECT resultado;
END $$
DELIMITER ;

call haciaAtras(3);


/** Control de errores */
DELIMITER $$
CREATE PROCEDURE spInsertStudentData(
	IN studentId INT,
	IN total_marks INT,
	IN grade VARCHAR(20),
	OUT rowCount INT)
BEGIN

	#-- error Handler declaration for duplicate key
    DECLARE EXIT HANDLER FOR 1062
    BEGIN
			SELECT 'DUPLICATE KEY ERROR' AS errorMessage;
	END;
    #-- main procedure statements
    INSERT INTO studentMarks(stud_id, total_marks, grade) VALUES(studentId,total_marks,grade);
    SELECT COUNT(*) FROM studentMarks INTO rowCount;
END$$
DELIMITER ;

CALL spInsertStudentData(1,450,'A+',@rowCount);

# Mostrar todas la funciones qu e empiecen por fc
SHOW FUNCTION STATUS WHERE name LIKE 'fc%';

# Muestra todas las functiones creadas el 29/05
SHOW FUNCTION STATUS WHERE created LIKE '%05-28%';

# Muestra todas las functiones cuyo usuario es root
SHOW FUNCTION STATUS WHERE definer like '%root%';

# Muestra todas las funciones cuyo servidor sea localhost
SHOW FUNCTION STATUS WHERE definer like '%localhost';
