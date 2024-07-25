DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;

USE tienda;

CREATE TABLE fabricante (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
	id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	precio DOUBLE,
	id_fabricante INT UNSIGNED NOT NULL,
	FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga  520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP  Laserjet Pro M26nw', 180, 3);
INSERT INTO producto VALUES(12, 'Smparthone',200,4);

# Lista el nombre de todos los productos de la tabla product
SELECT nombre FROM producto;

# Lista los nombres y los precios de todos los productos de la tabla productos
SELECT nombre, precio FROM producto;
	
# Lista todas las columnas de la tabla producto
SELECT * FROM producto;

# Lita el nombre los productos, el precion en euros y el precio en dolares estadounidenses (USD)
SELECT nombre, precio as euros , (precio * 1.09) as dolares FROM producto;

# Lista los nombres y los precios de todos los productos de la tabla producto, convitiendo los nombre a mayusculas
SELECT upper(nombre), precio FROM producto;

# Lista los nombre y los precios e todos los productos de la tabla producto, redondeando el valor del precio a 1 cifra decimal
SELECT nombre, round(precio ,1)  FROM producto;

# Lista los nombre y los precios e todos los productos de la tabla producto, truncando el valor del precio a 1 cifra decimal
SELECT nombre, truncate(precio,0)  FROM producto;

# Lista los nombres de los fabricantes ordenados de forma ascendente
SELECT nombre FROM fabricante ORDER BY nombre ASC;

# Lista los nombres de los fabricantes ordenados de forma descendente
SELECT nombre FROM fabricante ORDER BY nombre DESC;

# Lista los nombres de los productos ordenados en primer lugar por el nombre asc y el precio de forma desc
SELECT nombre, precio FROM producto  ORDER BY nombre, precio DESC;

# Devuelve una lista con las 5 primeras filas de la tabla fabricante
SELECT * FROM fabricante LIMIT 5;

# Lista el nombre y el precio del producto mas barato
SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1;

# Lista el nombre y el precio del producto mas caro
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

# Lista el nombre de todos los productos del fabricante con identificador es igual a 2
SELECT nombre FROM producto WHERE id_fabricante=2;

# Lista el nombre de los productos que tienen un precio menor o igual a 120
SELECT nombre FROM producto WHERE precio <= 120;

# Lista el nombre de los productos que tienen un precio mayor o igual que 400
SELECT nombre FROM producto WHERE precio >= 400;

# Lista todos los productos que tengan un precio entre 80 y 300
SELECT * FROM producto WHERE precio BETWEEN 80 AND 300 order by precio;

# Sin usar Between Lista todos los productos que tengan un precio entre 60 y 200
SELECT nombre FROM producto WHERE precio >= 60 AND precio <=200;

# Lista todos los productos que tengan un precio mayor que 200 y el identificador de fabricante sea igual a 6
SELECT nombre FROM producto WHERE precio > 200 AND id_fabricante = 6;

# Lista todos los productos donde el identificador de fabricante sea 1, 3, o 5 sin usar in
SELECT nombre FROM producto WHERE id_fabricante=1 OR id_fabricante=3 OR id_fabricante=5;  

# Lista el nombre y el precio de los productos en centimos.Cree un alias para la columna que contiene el precio que se llame centimos 
SELECT nombre, (precio * 100) as centimos FROM producto;

# Lista los nombre de los fabricantes cuyo nombre empiece por s
SELECT nombre FROM fabricante WHERE nombre LIKE 's%';

# Lista los nombre de los fabricantes cuyo nombre termine por la vocal e
SELECT nombre FROM fabricante WHERE nombre LIKE '%e';

# Lista los nombres de los fabricantes cuyo nombre contenga el caracter w
SELECT nombre FROM fabricante WHERE nombre LIKE '%w%';

# Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres
SELECT nombre FROM fabricante WHERE nombre LIKE '____';

# Devuelve una lista con el nombre de todos los productos que contienen la cadena 'portatil' en el nombre
SELECT nombre FROM producto WHERE nombre LIKE '%Portatil%';

# Devuelve una lista con el nombre de todos los productos que contienen la cadena 'Monitor' y tienen un precio inferior a 215
SELECT nombre FROM producto WHERE nombre LIKE '%Monitor%' AND precio < 215;

# Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180, ordena por precio desc y nombre asc
SELECT nombre, precio FROM producto WHERE precio >= 180 ORDER BY precio DESC, nombre;

# Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos
SELECT p.nombre, p.precio, f.nombre FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id;

# Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos ordena el resultado por nombre fabricante por orden alfabetico
SELECT p.nombre, p.precio, f.nombre FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id ORDER BY f.nombre;

# Devuelve una lista con el id del producto, nombre del producto, id del fabricante y nombre del fabricante de todos los productos
SELECT p.id, p.nombre, f.id, f.nombre FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id;

# Devuelve el nombre del producto, su precio, el nombre de su fabricante del producto mas barato
SELECT p.nombre, precio, f.nombre as fabricante FROM producto as p, fabricante as f WHERE f.id = p.id_fabricante  ORDER BY p.precio LIMIT 1;

# Devuelve una lista de todos los productos del fabricante lenovo
SELECT p.* FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id AND f.nombre LIKE '%LENOVO%';

# Devuelve una lista de todos los productos del fabricante 'crucial' que tengan un precio mayo que 200
SELECT p.* FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id AND f.nombre LIKE 'crucial' AND p.precio > 200;

# Devuelve un listado con todos los productos de los fabricantes asus, Hewlett-PAckard y seagate sin utiliar el operar in
SELECT p.* FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id AND ( f.nombre = "asus" OR f.nombre = "seagate" OR f.nombre = "Hewlett-Packard");  

# Devuelve un listado con todos los productos de los fabricantes asus, hewlett-packard y seagate utilizanfo IN
SELECT p.* FROM producto as p, fabricante as f WHERE p.id_fabricante = f.id AND f.nombre IN ("asus","seagate","Hewlett-Packard");  

# Devuelve un listado con el nombre y el precio de todos los productos de los fabricantes cuyo nombre termine e
SELECT p.nombre, p.precio FROM producto as p JOIN fabricante as f ON f.id = p.id_fabricante AND f.nombre LIKE '%e';

# Devuelve un listado con el nombre y el precio de todos los productos de los fabricantes cuyo nombre contenga W
SELECT p.nombre, p.precio FROM producto as p JOIN fabricante as f ON f.id = p.id_fabricante AND f.nombre LIKE '%w%';

# Devuelve un listado con el nombre de producto , precio y facbricante de todos los productos que tengan un precio >= 180
# y ordendado por precio descendente y nombre de producto
SELECT p.nombre as articulo, precio, f.nombre as fabricante FROM producto as p 
JOIN fabricante as f ON f.Id =p.id_fabricante AND p.precio >= 180 ORDER BY precio DESC, p.nombre;

# Devuelve un listado con el id y el nombre de fabricante, solo de aquellos fabricantes con productos asociados en la base de datos
SELECT f.Id, f.nombre FROM fabricante as f WHERE EXISTS (SELECT nombre from producto as p WHERE p.id_fabricante = f.Id);

# Devuelve un listado de todos los fabricantes junto con los productos que tiene cada uno de ellos. Mostrar fabricantes 
SELECT f.nombre as fabricante, count(p.nombre) as totalProductos FROM fabricante as f LEFT JOIN producto as p ON f.Id = p.id_fabricante GROUP BY f.nombre ORDER BY f.nombre; 

# Devuelve un listado donde solo aparezcan aquellos fabricantes que no tienen ningun producto asociado

# Devuelve un listado de todos los fabricantes junto con los productos que tiene cada uno de ellos. Mostrar fabricantes 
SELECT f.* FROM fabricante as f WHERE NOT EXISTS (SELECT nombre FROM producto p WHERE p.id_fabricante = f.Id) ; 