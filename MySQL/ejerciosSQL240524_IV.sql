/** Trabajo de clase > Bases de datos > Procedimientos 
https://drive.google.com/file/d/1QpxqrP_jNPhu-kwfo7FW_fqFpX8l3xlH/view 
*/

/** PROCEDIMiENTEOS ALMACENADOS 
Crean bloques de codigo que se repiten; parecido a funciones, pudiendo pasar parametros
*/

CREATE DATABASE base_ejemplo;

USE base_ejemplo;

CREATE TABLE productos (
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(20) NOT NULL,
	estado VARCHAR(20) NOT NULL DEFAULT 'disponible',
	precio FLOAT NOT NULL DEFAULT 0.0,
	PRIMARY KEY(id)
);
INSERT INTO productos (nombre, estado, precio) VALUES
('Producto A','disponible', 8), 
('Producto B','disponible', 1.5),
('Producto C', 'agotado', 80);

SELECT * FROM productos;

## CREAR UN PROCEDIMIENTO ALMACENADO // IN no modica el valor de los campos
DELIMITER $$
CREATE PROCEDURE obtenerProductosPorEstado(IN nombre_estado VARCHAR(255))
BEGIN
	SELECT *
	FROM productos
	WHERE estado = nombre_estado;
END$$
DELIMITER ;

# LLamar a un procedmiento almacenado  
CALL obtenerProductosPorEstado('disponible');
CALL obtenerProductosPorEstado('agotado');

## CREAR UN PROCEDIMIENTO ALMACENADO // OUT modica el valor de los campos devolviendo la variable 
DELIMITER $$
CREATE PROCEDURE contarProductosPorEstado( 
		IN nombre_estado VARCHAR(25), # parametro IN no se modifica	 
		OUT numero INT	# Se le pasa la variable numero como OUT de tipo INT (numero) donde se guadará el resultado 
    )
BEGIN
	SELECT count(id) INTO numero # guarda el valor de count(id) en la variable numero que se devuelve con el procedmiento
	FROM productos
	WHERE estado = nombre_estado;
END$$
DELIMITER ;

# LLamar al procedimiento  ( la variable de salida va con una @) 
CALL contarProductosPorEstado('disponible', @numero); # se guarda el resultado en la variable @numero
SELECT @numero AS disponibles; # Se muestra el @numero con el alias disponibles;

## CREAR UN PROCEDIMIENTO ALMACENADO // INOUT
DELIMITER $$
CREATE PROCEDURE venderProducto(
		INOUT beneficio INT(255), # INOUT muestra y devuelve el resultado 
		IN id_producto INT 
    )
BEGIN
	SELECT @incremento_precio = precio
	FROM productos
	WHERE id = id_producto;
	SET beneficio = beneficio + @incremento_precio;
END$$
DELIMITER ;

# SE crea la variable @beneficio y se pone a 0 
SET @beneficio = 0;
CALL venderProducto(@beneficio, 1);	# se guarda el beneficio del producto con id 1
CALL venderProducto(@beneficio, 2); # se guarda el beneficio del producto con id 2
CALL venderProducto(@beneficio, 2); # se guarda el beneficio del producto con id 2

SELECT @beneficio as beneficio;

# Eliminar un procedimiento
DROP PROCEDURE venderProducto; 


## EJERCICIO: Crea un proocedemiento almacenado que muestre todos los emails que terminen en r
## Tendra un parametro de entrada que sera el caracter que meteremos en el call 
## El nombre del procedimiento sera emails_fin_r
/** Base de datos ed **/ 
USE ed;

DELIMITER $$
CREATE PROCEDURE emails_fin_r( 
	IN caracter char
)
BEGIN 
	SELECT email 
    FROM Empleados 
    WHERE email LIKE concat('%', caracter) ;
END $$ 
DELIMITER ;

## LLamadas al procedimiento
CALL emails_fin_r('R'); # Muestra emails acabados en R
CALL emails_fin_r('A'); # Muestra emails acabados en A
CALL emails_fin_r('S'); # Muestra emails acabados en S

## EJERCICIO: Crea un procedimiento llamado emails_fin que cuente todos los emails que teminen en a, e, i o , y
## Tendra un parametro de entrada el caracter de finalizacion y como parametro de salida la cantidad de emails para cada vocal
DELIMITER $$
CREATE PROCEDURE emails_fin (
		IN caracter char,
        OUT contador int # OUT el resultado se guarda en esta variable
)
BEGIN 
	SELECT count(email) INTO contador 
    FROM Empleados 
    WHERE email like concat('%', caracter);
END $$
DELIMITER ;

# Se guarda el resultado en las variables @contadorA, @contadorE ...
CALL emails_fin('A', @contadorA); 
CALL emails_fin('E', @contadorE); 
CALL emails_fin('I', @contadorI); 
CALL emails_fin('O', @contadorO); 
CALL emails_fin('U', @contadorU); 
SELECT @contadorA, @contadorE, @contadorI, @contadorO, @contadorU; # Se muestran los resultados a la vez

# INOUT parametro que se pasa tanto para ver como modificar
DELIMITER $$
CREATE PROCEDURE pa_incrementar (INOUT contador INT) 
BEGIN 
	SET contador = contador +1;
END $$
DELIMITER ;

SET @contador = 0;
SELECT @contador;	# 0 
CALL pa_incrementar(@contador); # aumenta el contador + 1
SELECT @contador; 	# 1 
CALL pa_incrementar(@contador); # aumenta el contador + 1
SELECT @contador;   # 2 