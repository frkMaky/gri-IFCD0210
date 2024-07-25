# VISTAS UPDATE https://www.tutorialspoint.com/mysql/mysql-update-views.htm
/*
UPDATE view_name
SET column1 = value1, column2 = value2...., columnN = valueN
WHERE [condition];	
*/

/** VISTAS SQL : UPDATE VIEW */ 

CREATE database bdClientes;
USE bdClientes;

CREATE TABLE CUSTOMERS(
   ID int NOT NULL,
   NAME varchar(20) NOT NULL,
   AGE int NOT NULL,
   ADDRESS varchar(25),
   SALARY decimal(18, 2),
   PRIMARY KEY (ID)
);
INSERT INTO CUSTOMERS VALUES 
(1, 'Ramesh', '32', 'Ahmedabad', 2000),
(2, 'Khilan', '25', 'Delhi', 1500),
(3, 'Kaushik', '23', 'Kota', 2500),
(4, 'Chaitali', '26', 'Mumbai', 6500),
(5, 'Hardik','27', 'Bhopal', 8500),
(6, 'Komal', '22', 'MP', 9000),
(7, 'Muffy', '24', 'Indore', 5500);

# Crea la vista CUSTOMERS_VIEW que contenga la información asociada a todos los cliente
CREATE VIEW CUSTOMERS_VIEW AS SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS_VIEW;

# Actualizar campo edad a 35 para Ramesh utilizando la vista 
# (igual que un update de una tabla, pero nombrando la vista y no la tabla) 
UPDATE CUSTOMERS_VIEW 
SET AGE = 35 
WHERE name = 'Ramesh';

SELECT * FROM CUSTOMERS_VIEW;

# Actualizar el ID 3 a nombre Kaushik y edad 24 
UPDATE CUSTOMERS_VIEW 
SET NAME = 'Kaushik', AGE = 24
WHERE ID = 3;

SELECT * FROM CUSTOMERS_VIEW;