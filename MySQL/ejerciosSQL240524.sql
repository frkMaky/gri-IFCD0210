/** Trabajo de clase > Bases de datos > VISTAS 
https://drive.google.com/file/d/1kGkmRg38Ekjq0P1IvIUWc756Kyrnw8wP/view */

/** VISTAS SQL: CREATE VIEW */ 

# Usando base de datos tienda
USE tienda;

# Contenido de la tabla producto
SELECT * FROM producto;

# CREAR UNA VISTA
# CREATE VIEW nombreVista AS sentencia_SELECT_con_lo_que_sea

# ELIMINAR UNA VISTA
# DROP VIEW nombreVista;

## EJERCICIO
## Crea una vista en la base de datos tienda que muestre 
## toda la información asociada a los productos cuyo precio sea mayor que 200
CREATE VIEW precioMayor200 AS
SELECT * FROM producto WHERE precio > 200;

# DENTRO DE LA BASE DE DATOS las vistas se almacenan en la carpeta 'Views'
# permiten obtener los datos protegiendo la integridad de las tablas originales 
# accediendo solo a los datos de la consulta que contiene creando una tabla virtual (no existe realmente esa tabla)

# Acceder a la vista: SELECT * FROM nombreVista;
SELECT * FROM precioMayor200;

# Puedes acceder a los campos de la vista igual que a los de una tabla
SELECT nombre, precio FROM precioMayor200;

## EJERCICIO
## Crea una vista que muestre toda la info asociada a los productos
## cuyo precio sea menor a la media del precio de los productos
CREATE VIEW mediaMenor AS 
SELECT * FROM producto WHERE precio  < (SELECT avg(precio) FROM producto);

SELECT * FROM mediaMenor; # Ver resultado ( media de los precios 265, productos con precio inferior a 265) 

## EJERCICIO
## Crea una vista que muestre todos los nombres de los productos que empiecen por la palabra Monitor
CREATE VIEW monitores AS 
SELECT nombre FROM producto WHERE nombre LIKE 'Monitor%';

SELECT * FROM monitores; # Ver resultado

## EJERCICIO
## Crea una vista que muestre el nombre y precio de los productos cuyo nombre de fabricante sea seagate

# solucion 1 con JOIN 
CREATE VIEW productosSeagate AS 
SELECT p.nombre, p.precio FROM producto AS p JOIN fabricante AS f ON p.id_fabricante = f.id
WHERE f.nombre = 'seagate';

# solucion 2 sin JOIN 
CREATE VIEW productosSeagate2 AS 
SELECT p.nombre, p.precio FROM producto AS p , fabricante AS f 
WHERE f.nombre = 'seagate' AND p.id_fabricante = f.id;

SELECT * FROM productosSeagate;  # Ver resultado ( solo 1 producto seagate, id fabricante 5) 
SELECT * FROM productosSeagate2;

## EJERCICIO
## Elimina la vista monitores
DROP VIEW IF EXISTS monitores;
SELECT * FROM monitores; # error o no mostrara nada al haber eliminado la vista

## EJERCICIO
## Elimina todas las vistas creadas desde una misma sentencia 
DROP VIEW IF EXISTS mediaMenor, precioMayor200, productosSeagate, productosSeagate2;
# ** separa los nombres de las vistas por comas ** 

## EJERCICIO
## Crea una vista que sea vista_media que muestre la media de los precios de los productos
## luego modifica la vista para que muestre tambien el numero de tuplas que tiene
CREATE VIEW vista_media AS
SELECT avg(precio) as media FROM producto;

SELECT * FROM vista_media;

ALTER VIEW vista_media AS	# ALTER VIEW para modificar una vista, se puede usar tambien CREATE VIEW OR REPLACE, para modificar o crear en caso que no exista
SELECT avg(precio) as media, count(precio) as n_tuplas FROM producto; # nueva sentencia de la vista modificada

SELECT * FROM vista_media;

