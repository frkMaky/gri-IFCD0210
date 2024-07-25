/*Vamos a aplicar buena parte de lo que conocemos para hacer un ejercicio de repaso que haga distintas
manipulaciones a una única tabla. Será una tabla que contenga datos de productos: código, nombre, precio
y fecha de alta, para que podamos trabajar con datos de texto, numéricos y de tipo fecha. */

#Crear la base de datos
CREATE DATABASE ejercicio1;

#Comenzar a usarla
USE ejercicio1;

# CREAR tabla que contenga datos de productos: código, nombre, precio y fecha de alta
CREATE TABLE productos (codigo int primary key, nombre varchar(60), precio decimal(10,2), fecha_alta DATE ) ;

# Introducir 3 datos de ejemplo
INSERT INTO productos (nombre, precio, fecha_alta) VALUES 
("Silla",50,'2024-05-05'),
("TV",150,'2024-05-05'),
("Laptop",480,'2024-05-05');

# Mostrar todos los datos
SELECT * FROM productos;

# Mostrar los datos que tienen un cierto nombre
SELECT * FROM procuctos WHERE nombre LIKE "%illa%";

# Mostrar los datos que comienzan por una cierta inicial
SELECT * FROM procuctos WHERE nombre LIKE "a%";

# Ver sólo el nombre y el precio de los que cumplen una condición (precio > 22)
SELECT nombre, precio FROM productos WHERE precio>22;

# Ver el precio medio de aquellos cuyo nombre comienza con "Silla"
SELECT AVG(precio) FROM productos WHERE LEFT (nombre,5) = 'Silla';

# Modificar la estructura de la tabla para añadir un nuevo campo: "categoría"
# Dar el valor "utensilio" a la categoría de todos los productos existentes
# Modificar los productos que comienza por la palabra "Silla", para que su categoría sea "silla"
# Ver la lista categorías (sin que aparezcan datos duplicados)
# Ver la cantidad de productos que tenemos en cada categoría
