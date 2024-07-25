/** Trabajo de clase > Bases de datos > Ejercicios consultas ventas 
https://drive.google.com/file/d/1Chpbi5bEq2tbw6Lm8KOLA4kEusGr-e7u/view */

/** EJERCICIO REPASO */
 
CREATE DATABASE ventas;

USE ventas;

CREATE TABLE cliente (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	apellido1 VARCHAR(100),
	apellido2 VARCHAR(100),
	ciudad VARCHAR(100),
	categoria INT
);

CREATE TABLE comercial (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	apellido1 VARCHAR(100),
	apellido2 VARCHAR(100),
	comision FLOAT
);

CREATE TABLE pedido (
	id INT AUTO_INCREMENT PRIMARY KEY,
	total DOUBLE NOT NULL,
	fecha DATE,
	id_cliente INT,
	id_comercial INT,
	FOREIGN KEY (id_cliente) REFERENCES cliente(id),
	FOREIGN KEY (id_comercial) REFERENCES comercial(id)
);
INSERT INTO cliente (nombre, apellido1, apellido2, ciudad, categoria) VALUES
('Aarón', 'Rivero', 'Gómez', 'Almería', 100),
('Adela', 'Salas', 'Díaz', 'Granada', 200),
('Adolfo', 'Rubio', 'Flores', 'Sevilla', NULL),
('Adrián', 'Suárez', NULL, 'Jaén', 300),
('Marcos', 'Loyola', 'Méndez', 'Almería', 200),
('María', 'Santana', 'Moreno', 'Cádiz', 100),
('Pilar', 'Ruiz', NULL, 'Sevilla', 300),
('Pepe', 'Ruiz', 'Santana', 'Huelva', 200),
('Guillermo', 'López', 'Gómez', 'Granada', 225),
('Daniel', 'Santana', 'Loyola', 'Sevilla', 125);

INSERT INTO comercial(nombre, apellido1, apellido2, comision) VALUES
('Daniel', 'Sáez', 'Vega', 0.15),
('Juan', 'Gómez', 'López', 0.13),
('Diego','Flores', 'Salas', 0.11),
('Marta','Herrera', 'Gil', 0.14),
('Antonio','Carretero', 'Ortega', 0.12),
('Manuel','Domínguez', 'Hernández', 0.13),
('Antonio','Vega', 'Hernández', 0.11),
('Alfredo','Ruiz', 'Flores', 0.05);

INSERT INTO pedido(total, fecha, id_cliente, id_comercial) VALUES
(150.5, '2017-10-05', 5, 2),
(270.65, '2016-09-10', 1, 5),
(65.26, '2017-10-05', 2, 1),
(110.5, '2016-08-17', 8, 3),
(948.5, '2017-09-10', 5, 2),
(2400.6, '2016-07-27', 7, 1),
(5760, '2015-09-10', 2, 1),
(1983.43, '2017-10-10', 4, 6),
(2480.4, '2016-10-10', 8, 3),
(250.45, '2015-06-27', 8, 2),
(75.29, '2016-08-17', 3, 7),
(3045.6, '2017-04-25', 2, 1),
(545.75, '2019-01-25', 6, 1),
(145.82, '2017-02-02', 6, 1),
(370.85, '2019-03-11', 1, 5),
(2389.23, '2019-03-11', 1, 5);

## Ejercicio: Devuelve un listado con todos los pedidos que se han realizado
## Los pedidos deben estar ordenados por la fecha de realización, mostrando en primer lugar los pedidos mas recientes
SELECT * FROM pedido ORDER BY fecha DESC;

## Ejercicio: Devuelve todos los datos de los dos pedidos del mayor valor (total)
SELECT * FROM pedido ORDER BY total DESC limit 2;

## Ejercicio: Devuelve un listado con los identificadores de los clientes que han realizado algun pedido
## Tenga en cuenta que no debe mostrar identificadores que no estan repetidos (DISTINC) 
SELECT distinct (c.id) FROM cliente as c JOIN pedido as p WHERE c.id=p.id_cliente; #Solucion con tablas cliente y pedido
SELECT distinct (id_cliente) FROM pedido; #Solucion solo con tabla pedido (pide los id, que ya los tienes en tabla pedido como id_cliente) 

## Ejercicio: Devuelve un listado de todos los pedidos que se realizaron durante el año 2017 y cuyo total sea superior a 500
SELECT * FROM pedido WHERE fecha LIKE '%2017%' AND total > 500; #solucion con LIKE 
SELECT * FROM pedido WHERE year(fecha)=2017 AND total > 500; # solucion usando funcion year(campo)

## Ejercicio: Devuelve un listado con el nombre y los apellidos de los comerciales que tienen una comision entre 0.05 y 0.11
SELECT nombre, apellido1, apellido2 FROM comercial WHERE comision between 0.05 AND 0.11;

## Ejercicio: Devuelve la comision de mayor valor que existe en la tabla comercial
SELECT max(comision) FROM comercial;

## Ejercicio: Devuelve el id, nombre y primer apellido de aquellos clientes cuyo segundo apellido no sea nulo
## El listado estara ordenado alfabeticamente por apellidos y nombre
SELECT id, nombre, apellido1 FROM cliente WHERE apellido2 IS NOT NULL ORDER BY apellido1, nombre;