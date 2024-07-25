USE test;

#1.  Crea un procedimiento que no tenga ningun parametro de entrada ni de salida y quye muestre ¡Hola Mundo!
DELIMITER $$
CREATE PROCEDURE holaMundo()
BEGIN 
	SELECT "¡Hola Mundo!";
END $$
DELIMITER ;

CALL holaMundo();

#2. Escribe un procedimiento que reciba un número real de entrada y muestre un mensaje indicando si el
# el numero es positivo , negativo o 0
DELIMITER $$
CREATE PROCEDURE comprobarNumero ( IN numero INT)
BEGIN 
	IF numero < 0 THEN 
		SELECT 'Negativo' as Resultado;
	ELSEIF numero > 0 THEN
		SELECT 'Positivo' as Resultado;
	ELSE
		SELECT 'Es 0' as Resultado;
	END IF;
END $$
DELIMITER ;

CALL comprobarNumero(-1);
CALL comprobarNumero(0);
CALL comprobarNumero(1);

#3. Modifica el procedimiento del ejercicio anterior para que tenga un parametro de entrada
# con el numero real y un parametro de salida que sera una cadena de caracteres indicando si es positivo, negativo o cero
DELIMITER $$
CREATE PROCEDURE comprobarNumero2 ( IN numero INT , OUT resultado varchar(30) )
BEGIN 
	IF numero < 0 THEN 
		SET resultado =  'Negativo' ;
	ELSEIF numero > 0 THEN
		SET resultado = 'Positivo' ;
	ELSE
		SET resultado = 'Es 0' ;
	END IF;
END $$
DELIMITER ;

CALL comprobarNumero2(-1, @resultado); SELECT @resultado;
CALL comprobarNumero2(0, @resultado); SELECT @resultado;
CALL comprobarNumero2(1, @resultado); SELECT @resultado;

/*4. Escribe un procedimiento que reciba un número real de entrada, que representa el valor de la nota de un alumno, 
y muestre un mensaje indicando qué nota ha obtenido teniendo en cuenta las siguientes condiciones
[0,5 ) insuficiente
[5,6 ) bien
[6,9 ) notable
[9,10] sobresaliente
En cualquier otro caso la nota no es válida */
DELIMITER $$
CREATE PROCEDURE calificacion(
	IN nota decimal(4,2)
)
BEGIN 
	DECLARE resultado varchar(30);
	IF nota < 0 THEN 
		SET resultado = concat(nota, " Nota no válida");
	ELSEIF NOTA < 5 THEN 
		SET resultado = concat(nota, " Insuficiente");
	ELSEIF NOTA < 6 THEN 
		SET resultado = concat(nota, " aprobado");
	ELSEIF NOTA < 7 THEN 
		SET resultado = concat(nota, " bien");
	ELSEIF NOTA < 9 THEN 
		SET resultado = concat(nota, " Notable");
    ELSEIF NOTA <= 10 THEN 
		SET resultado = concat(nota, " Sobresaliente");
	ELSE
		SET resultado = concat(nota, " Nota no válida");
	END IF;
    SELECT resultado as Resultado;
END $$
DELIMITER ;

CALL calificacion(-0.1); #
CALL calificacion(0);
CALL calificacion(4.9);
CALL calificacion(5);
CALL calificacion(5.9);
CALL calificacion(6);
CALL calificacion(6.9);
CALL calificacion(7);
CALL calificacion(8.9);
CALL calificacion(9);
CALL calificacion(10);
CALL calificacion(10.1);

#5. Modifica el procedimiento anterior para que tenga un parametro de entrada 
# con el valor de la nota en formato numerico y un parametro de salida con una cadena de texto 
# indicando la nota correspondiente
DELIMITER $$
CREATE PROCEDURE calificacion2(
	IN nota decimal(4,2),
    OUT resultado varchar(30)
)
BEGIN 
	IF nota < 0 THEN 
		SET resultado = concat(nota, " Nota no válida");
	ELSEIF NOTA < 5 THEN 
		SET resultado = concat(nota, " Insuficiente");
	ELSEIF NOTA < 6 THEN 
		SET resultado = concat(nota, " aprobado");
	ELSEIF NOTA < 7 THEN 
		SET resultado = concat(nota, " bien");
	ELSEIF NOTA < 9 THEN 
		SET resultado = concat(nota, " Notable");
    ELSEIF NOTA <= 10 THEN 
		SET resultado = concat(nota, " Sobresaliente");
	ELSE
		SET resultado = concat(nota, " Nota no válida");
	END IF;
END $$
DELIMITER ;

CALL calificacion2(5, @resultado); 
SELECT @resultado;

CALL calificacion2(10, @resultado); 
SELECT @resultado;

#6. EScribe un procedimiento que reciba el nombre de un pais como entrada y 
# realice una consulta sobre la tabla cliente para obtener todos los clientes
# que existen en la tabla de ese pais
DELIMITER $$
CREATE PROCEDURE clientesPais(IN nombrePais varchar(100) )
BEGIN 
	SELECT * FROM cliente WHERE pais = nombrePais;
END $$
DELIMITER ;

