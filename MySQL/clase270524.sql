## CLASE 24/05/2024 

CREATE DATABASE testProcedures; # Crear la base de datos

USE testProcedures;	## Se escoge la base de datos a utilizar 

# Tabla de productos para los ejercicios 
CREATE TABLE producto (
	id int primary key auto_increment,
    nombre varchar(50),
    gama varchar(50),
    precio_venta decimal(10,2)
);

# Datos de pruebas para que devuelva resultados 
INSERT INTO producto (nombre, gama, precio_venta) VALUES
('martillo','Herramientas', 15.30),
('espátula','Herramientas', 10.50),
('estor','Vivienda', 5.20),
('taladro','Herramientas', 30.80);

SELECT * FROM producto; # Selecciona todas las columnas de la tabla producto

/*
Las sentencias en SQL terminan en ; 
DELIMITER $$ cambia ese ; por $$ hasta que se vuelva a definir al final 
DELIMITER ; de nuevo
*/
/*
Se define una funcion llamada calcular_max_min_media
CREATE PROCEDURE calcular_max_min_media

Se la pasan parametros 
(
IN gama VARCHAR(50), # IN de entrada, se lo vas a pasar
OUT maximo DECIMAL(15, 2),  # OUT de salida, lo va a devolver
OUT minimo DECIMAL(15, 2),
OUT media DECIMAL(15, 2)
)
BEGIN 
	AQUI SE ESCRIBE LA SENTENCIAS QUE QUIERAS (SELECT, UPDATE...) 
    Puedes utilizar los parametros IN para obtener valores o asi
    y devuelves los resultados en las variables OUT pues con 
    
    SET variable = lo que sea;
    
    o con SELECT Lo que sea INTO variable
END 
*/
#Cambia el ; por $$
DELIMITER $$ 
# Elimina el procedure si existe, termina la sentencia en $$ porque se cambio 
DROP PROCEDURE IF EXISTS calcular_max_min_media$$ 
CREATE PROCEDURE calcular_max_min_media(
	IN gama VARCHAR(50),
	OUT maximo DECIMAL(15, 2),
	OUT minimo DECIMAL(15, 2),
	OUT media DECIMAL(15, 2)
)
BEGIN
	SET maximo = ( SELECT MAX(precio_venta) FROM producto WHERE producto.gama = gama);
	SET minimo = ( SELECT MIN(precio_venta) FROM producto WHERE producto.gama = gama);
	SET media = ( SELECT AVG(precio_venta)  FROM producto WHERE producto.gama = gama);
END $$
DELIMITER ; # SE vuelve a poner ; como delimiter

/** Se llama al procedimiento que acabamos de crear y se le pasan las variables @maximo, @minimo, @media
para que guarden los resultados*/
CALL calcular_max_min_media('Herramientas', @maximo, @minimo, @media);

SELECT @maximo, @minimo, @media;	# Se muestran las variables

-- Solucioń 2. Utilizando SELECT ... INTO
DELIMITER $$
DROP PROCEDURE IF EXISTS calcular_max_min_media$$
CREATE PROCEDURE calcular_max_min_media(
	IN gama VARCHAR(50),
	OUT maximo DECIMAL(15, 2),
	OUT minimo DECIMAL(15, 2),
	OUT media DECIMAL(15, 2)
)
BEGIN
	SELECT
		MAX(precio_venta),
		MIN(precio_venta),
		AVG(precio_venta)
	FROM producto
	WHERE producto.gama = gama
	INTO maximo, minimo, media;
END $$
DELIMITER ;
CALL calcular_max_min_media('Herramientas', @maximo, @minimo, @media);
SELECT @maximo, @minimo, @media;