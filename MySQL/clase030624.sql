USE jardineria; # Te adjunte la base de datos

/**
#2 Escriba un procedimiento que reciba como parámetro de entrada una forma de pago, 
que será una cadena de caracteres (Ejemplo: PayPal, Transferencia, etc). 
Y devuelva como salida el pago de máximo valor realizado para esa forma de pago. 
Deberá hacer uso de la tabla pago.La tabla pago tiene un campo que es forma_pago y otro llamado total
*/
DELIMITER $$
CREATE PROCEDURE metodoPago (
	IN formaPago VARCHAR(40),		# Cadena que indica el metodo de pago (PayPal, Transferencia...) --> IN
    OUT maximoValor DECIMAL(15,2)	# Variable que guarda el resultado  --> OUT 
	)
BEGIN 
	SELECT MAX(total) INTO maximoValor 		   # INTO maximoValor parametro OUT >> en el CALL se corresponde con la variable @maximoValor
    FROM pago WHERE forma_pago LIKE formaPago; # LIKE porque son CADENAS forma_pago (tabla) formaPago (parametro IN del procedure)
END $$    
DELIMITER ;

CALL metodoPago('PayPal',@maximoValor); # Se indica el metodo y pasa una variable que guarde el resultado
SELECT @maximoValor;					# Se muestra la variable

/*
#3 Escriba una funcion que reciba un numero entero de entrada y devuelva true si es el numero es par o false en caso contrario
*/
DELIMITER $$
CREATE FUNCTION comprobarPar(numero int) RETURNS BOOLEAN NO SQL
# Al ser una FUNCTION y no un PROCEDURE no se indica IN, OUT, INOUT
# RETURNS BOOLEAN - La funcion devolvera un boolean (true o false, que se corresponden con 1 y 0 en numeros) 
# NO SQL - La función no hace ninguna consulta a ninguna tabla, solo hace un calculo y devuelve un resultado 
BEGIN
	IF ( numero%2=0 ) THEN 	# Si es par , al dividirlo por 2 el resto sera 0
		return TRUE;		# devuelve 1 (true)
    ELSE 					# Si no (hay resto, es impar)
		return FALSE;		# devuelve 0 (false)
    END IF;
END $$
DELIMITER ;

/** EN  SQL los BOOLEAN TRUE y FALSE se corresponde con los numeros 1 (true) y 0 (false),
 por eso en la llamadas devuelve 0 false impar, 1 true par*/
SELECT comprobarPar(9);
SELECT comprobarPar(10); 

/** TEORIA ** INDICES **

https://drive.google.com/file/d/1N6-STIDAKpg5hPbipJUZNg6H_aRvtc-T/view

Trabajo de Clase > Bases de Datos > Indices > 8indices.odt

# CREAR UN INDICE
CREATE INDEX nombreIndice ON nombreTabla (nombreColumna)

Los indices hacen mas eficientes las consultas (SELECT) 
pero mas lentas las modificaciones (INSERT, UPDATE, DELETE)

# ELIMINAR UN INDICE
DROP INDEX nombreIndice ON nombreTabla

*/

## Ejemplo pagina 3 apuntes
CREATE DATABASE db_indices;
USE db_indices;

drop table if exists libros;

create table libros(
	codigo int unsigned auto_increment,
	titulo varchar(40) not null,
	autor varchar(30),
	editorial varchar(15),
	primary key (codigo)
);

show index from libros;  # Muestra los indices de la tabla libros (primary key codigo)

create index i_editorial on libros (editorial); # SE crea el indice i_editorial 

show index from libros; # Muestra los indices de la tabla libros (primary key codigo) y i_editorial (columna editorial)

create unique index i_tituloeditorial on libros (titulo,editorial); # unique previene que no haya valores duplicados
/** Los índices también pueden ser "únicos". Este tipo de índices previene de la entrada de valores duplicados en
la columna o combinación de columnas en donde existe índice. */
# crea UN INDICE EN AMBAS COLUMNAS INDICADAS TITULO Y EDITORIAL

show index from libros;  #  (primary key codigo) , i_editorial (columna editorial), i_tituloeditorial (columna titulo y editorial)

DROP INDEX i_editorial ON libros; # Eliminar indice >> ON TABLE  

show index from libros;  #  (primary key codigo) i_tituloeditorial (columna titulo y editorial)

DROP INDEX i_tituloeditorial ON libros; # Eliminar indice >> ON TABLE  

show index from libros;  #  (primary key codigo) 

/** TEORIA ** USUARIOS ROLES Y PERMISOS  **

https://drive.google.com/file/d/1Q6dnGIigOIlp-WhN8gTwomf0QHESYgMK/view

Trabajo de Clase > Bases de Datos > Usuarios, roles, permisos > 9usuariosYpermisosYroles.odt

AL conectarte a SQL el usuario y password que te pide para permitirte consultar las bases de datos

Agregar nuevos usuarios
CREATE USER 'usuario'@'localhost' IDENTIFIED BY 'password';

	El @localhost es el servidor (podria ser @miDominio o una direccion IP 215.154.100.32 
    o la que corresponda al servidor de la base de datos
    
Mostrar permisos del usuario admin@localhost
SHOW GRANTS FOR 'admin'@'localhost';

Cambiar permisos (lectura/escritura) 
GRANT ALL PRIVILEGES ON *.* TO 'nombre_usuario'@'localhost';

	*.*    >>>  baseDatos.nombreTabla
    *.* asigna los permisos a todas las bases de datos y todas las tablas
    
*/
# Estos comandos hay que usuarlos con un usuario ROOT ( que tenga todos los permisos ) 
CREATE USER 'miUsuario'@'localhost' IDENTIFIED BY '123456'; # Crea el usuario miUsuario con passsword 123456 en el servidor localhost

SHOW GRANTS FOR 'miUsuario'@'localhost';			# Muestra los permisos del usuario miUsuario en el servidor ( *.* todas las bases y tablas) 

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP 	# Permitir todas estas acciones (SELECT, INSERT, UPDATE, DELETE, CREATE, DROP) 
ON mibasededatos.*									# en esta base de datos (mibasededatos) y todas las tablas (*) de esta base de datos
TO 'miUsuario'@'localhost'; 						# para el usuario 'miUsuario' en el servidor 'localhost'

GRANT ALL PRIVILEGES ON *.* TO 'miUsuario'@'localhost'; # Permitir todas las acciones en todas las bases de datos y tablas para  'miUsuario'@'localhost'

SELECT * FROM mysql.user; # Ver todos los usuarios 

DROP USER 'miUsuario'@'localhost'; 					# Eliminar un usuario 

REVOKE UPDATE, DELETE ON *.* FROM 'usuario'@'localhost';  	# Eliminar permisos en concreto (Ejemplo update y delete).

# REVOKE ALL PRIVILEGES ON *.* FROM 'usuario'@'localhost';	# Eliminar todos los privilegios 

/** Ejercicio: Crea un usuario llamado oscar con contraseña 1234
Dale permisos de creacion de tablas y bases de datos y de insercion y mostrar
Crea una base de datos llamada dbUsuarios y una tabla usuarios (dni,edad).
Inserta el usuario y muestra el resutlado. Luego quitale los permisos de insercion */

CREATE USER 'oscar'@'localhost' IDENTIFIED BY '1234'; # Se crea usuario oscar password 1234

GRANT SELECT, INSERT, CREATE ON *.*	TO 'oscar'@'localhost'; # Permisos CREATEm SELECT, INSERT en todas las bases de datos y tablas

CREATE DATABASE dbUsuarios;				# Se crea la base de datos
USE dbUsuarios;							# Se utiliza la base de datos creada

CREATE TABLE usuarios (					# Se crea tabla usuarios
	id int primary key auto_increment,
    dni varchar(9),
    edad int
);
INSERT INTO usuarios (dni,edad) VALUES ('11111111R',25); # Se inserta un usuario en la tabla

SELECT * FROM usuarios;

REVOKE INSERT ON dbUsuarios.usuarios FROM 'oscar'@'localhost'; # Se elimina el permiso de INSERT en esta base de datos y tabla para oscar

INSERT INTO usuarios (dni,edad) VALUES ('11111111R',25); # Si te conectas como oscar (actualmenteo como root) no podrias hacer este insert al no tener permisos

SELECT * FROM usuarios;

/** Ejercicio (base de datos ventas) 
Devuelve un listado de los nombres de los clientes que empiezan por A y terminan por n y tambien los nombres que empiezan por p.
El listado deberña estar ordenado alfabéticamente */
USE ventas;
SELECT nombre FROM cliente WHERE nombre LIKE 'a%n' OR nombre LIKE 'p%' ORDER BY nombre ASC;

/** Ejercicio
Devuelve un listado de los nombres de los cliente no no empiezan por A.
El listado debera estar ordenado alfabeticamente */
SELECT nombre FROM cliente WHERE nombre NOT LIKE 'a%' ORDER BY nombre ASC;

/** Ejercicio
Devuelve un listado con los nombres de los comerciales que terminan por el O 
Tenga en cuenta que se deberan eliminar los nombres repetidos */
SELECT distinct (nombre) FROM comercial WHERE nombre LIKE '%o';

/** Ejercicio
Devuelve un listado con el identificador, nombre y los apellidos de todos los cliente que han realizado algun pedido
El listado debe estar ordenado alfabeticamente por apellido, nombre  y se deben eliminar los elementos repetidos */
SELECT distinct(cliente.id), nombre, apellido1, apellido2 FROM cliente
INNER JOIN pedido ON cliente.id = pedido.id_cliente
ORDER BY apellido1, nombre;

/** Ejercicio
Devuelve un listado que muestre todos los pedidos que ha realizado cada cliente
El resultado debe mostrar todos los datos de los pedidos y del cliente 
El listado debe mostrar los datos de los clientes ordenados alfabeticamente por apellido y nombre*/
SELECT * FROM cliente, pedido
WHERE cliente.id = pedido.id_cliente
ORDER BY cliente.apellido1, cliente.nombre;

/** Ejercicio
Devuelve un listado que muestre todos los pedidos en los que ha participado un comercial
El resultado debe mostrar todos los datos de los pedidos y de los comerciales 
El listado debe mostrar los datos de los comerciales ordenados alfabeticamente */
SELECT * FROM pedido, comercial 
WHERE pedido.id_comercial = comercial.id 
AND pedido.id_comercial IS NOT NULL 
ORDER BY comercial.apellido1, comercial.nombre;

/** Ejercicio
Devuelve un listado que muestre todos los clientes, con todos los pedidos y 
con los datos de los comerciales asociados a cada pedido */
SELECT * FROM cliente, pedido, comercial 
WHERE cliente.id = pedido.id_cliente AND comercial.id = pedido.id_comercial;

/** Ejercicio
Devuelve un listado de todos los clientes que realizaron un pedido durante el año 2017
cuya cantidad (total)  esta entre 300 y 1000 euros */
SELECT * FROM cliente 
INNER JOIN pedido ON pedido.id_cliente = cliente.id 
WHERE total BETWEEN 300 AND 1000 AND year(fecha) = 2017;

/** Ejercicio
Devuelve el nombre y los apellidos de todos los comerciales que han participado en algun pedido
realizado por Maria Santana Moreno (cliente y comercial se relacionan entre si a traves del pedido )*/
SELECT distinct (comer.nombre), comer.apellido1, comer.apellido2 FROM comercial as comer 
INNER JOIN pedido as p ON comer.id = p.id_comercial
INNER JOIN cliente as cl ON cl.id = p.id_cliente 
WHERE cl.nombre = 'Maria' AND cl.apellido1= "Santana" AND cl.apellido2 = "Moreno";

/** Ejercicio
Devuelve el nombre de todos los cliente que han realizado algun pedido con el comercial Daniel Saez Vega */
SELECT distinct (c.nombre), c.apellido1, c.apellido2 FROM cliente as c 
INNER JOIN pedido as p ON p.id_cliente = c.id
INNER JOIN comercial as comer ON comer.id = p.id_comercial
WHERE comer.nombre LIKE 'Daniel' AND comer.apellido1 LIKE 'Saez' AND comer.apellido2 LIKE 'Vega';
