CREATE database ejercicioCalorias;
USE ejercicioCalorias;

#
CREATE TABLE departament (
	id int primary key auto_increment,
    name varchar(60)
);
insert into departament (name) VALUES
('fruits'),('vegetables'),('seafood'),('deli'),('bakery'),('meat'),('dairy');

#
CREATE TABLE producer (
	id int primary key,
    name varchar(60)
);
INSERT INTO producer (id, name) VALUES
(1, 'BeHealthy'),
(2, 'HealthyFood Inc.'),
(3, 'SupremeFoods'),
(4, 'Foodie'),
(5, 'Gusto'),
(6, 'Baker n Sons'),
(7, 'GoodFoods'),
(8, 'Tasty n Healthy');


CREATE TABLE product (
	id int primary key auto_increment,
    name varchar(60),
    department_id int,
	shelf_id int,
	producer_id int,
	price decimal(6,2),
    foreign key (department_id) references departament(id),
	foreign key (producer_id) references producer(id)
);

INSERT INTO product (id, name, department_id, shelf_id, producer_id, price) VALUES
(1,'Apple',1,1,NULL,0.5),
(2,'Avocado',1,1,7,1),
(3,'Banana',1,1,7,0.5),
(4,'Grapefruit',NULL,1,1,0.5),
(5,'Grapes',1,1,4,2);

CREATE TABLE nutrition_data (
	id int primary key auto_increment,
	product_id int,
	calories int,
	fat int,
	carbohydrate int,
	protein int,
    foreign key (product_id) references product(id)
);
INSERT INTO nutrition_data (product_id, calories, fat, carbohydrate, protein) VALUES
(1,130,0,5,1),
(2,50,4.5,3,1),
(3,110,0,30,1),
(4,60,0,15,1),
(NULL,90,0,23,0);

CREATE TABLE sales_history(
	id int primary key auto_increment,
	fecha date,
    product_id int,
    amount int,
    foreign key (product_id) references product(id)
);
insert into sales_history (fecha, product_id, amount) VALUES 
('2015-01-14',1,14),
('2015-01-14',1,13),
('2015-01-15',2,2),
('2015-01-16',2,6),
('2015-01-17',3,8);

# Ejercicio 8: Mostrar productos de menos de 150 calorías y su departamento
SELECT p.name, d.name FROM product as p, departament as d WHERE p.department_id = d.id;

# Ejercicio 9: Listar Todos los Productos con sus Productores, Departamentos y Carbohidratos
SELECT p.name , pro.name, d.name, n.carbohydrate 
FROM product as p
LEFT JOIN producer as pro ON p.producer_id = pro.id 
LEFT JOIN departament as d ON p.department_id = d.id 
LEFT JOIN nutrition_data as n ON p.shelf_id = n.id;

# Ejercicio 10: Mostrar todos los Productos, Precios, Productores y Departamentos
SELECT p.name as producto, price as precio, pro.name as productor, d.name as departamento
FROM product as p
JOIN producer as pro ON p.producer_id = pro.id 
JOIN departament as d ON p.department_id = d.id;

#REaliza la division nomal de 11 entre 2, aslias division normal
# Muestra el resutado de la division entresa, y el modulo
SELECT 11/2 as 'Division Normal', 11 DIV 2 as 'Division Entera', 11 MOD 2 as 'Resto';