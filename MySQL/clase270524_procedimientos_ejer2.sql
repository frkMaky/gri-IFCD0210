/** 
Trabajo de clase > Bases de Datos >  Procedimientos2 > procedimientos_ejer2
https://drive.google.com/file/d/19lKldYofKUuYthYT1oKIkUeOeyY2ofcu/view
**/

# CREATE DATABASE testProcedures;
USE testProcedures;

/** 
Create a table named customers with the following columns:
Column Data Type
customer_id INT
name VARCHAR(100)
email VARCHAR(100)
phone VARCHAR(20)
**/ 
CREATE TABLE customers(
	customer_id INT primary key,
	name VARCHAR(100), 
	email VARCHAR(100), 
	phone VARCHAR(20)
);

/**
**Step 2: **
Insert some sample data into the customers table.
**/
INSERT INTO customers (customer_id, name, email, phone) VALUES
(1, 'Paco Perez', 'pperz@correo.com','555-666333'),
(2, 'Karen Gomez', 'kgomez@correo.com','555-777888'),
(3, 'Mike Tyson', 'mtyson@correo.com','555-123456'),
(4, 'Rodolfo Langostino', 'rlangostino@correo.com','555-548721');

/**Step 3: **
Now, let's create a stored procedure named GetCustomerInfo that takes
a customer_id as an input parameter and returns the customer's name and email. */
DELIMITER $$
CREATE PROCEDURE GetCustomerInfo (
	IN id INT
)
BEGIN 
	SELECT name, email FROM customers WHERE customer_id = id;
END $$
DELIMITER ;

# LLamada al procedimiento almacenado para el cliente con ID 2
CALL GetCustomerInfo(2);


CREATE TABLE employees (
	id INT PRIMARY KEY,
	name VARCHAR(100),
	department VARCHAR(100),
	salary DECIMAL(10,2)
);
INSERT INTO employees (id, name, department, salary)
VALUES (1, 'John Doe', 'Marketing', 5000.00),
(2, 'Jane Smith', 'Sales', 6000.00),
(3, 'Robert Johnson', 'Finance', 7000.00);

/** Crea un procedimiento almacenado que devuelva la información de todos los empleados */
DELIMITER //
CREATE PROCEDURE get_all_employees() # No se le pasa ningun parametro ()
BEGIN
	SELECT * FROM employees; # Sentencia que se ejecuta
END //
DELIMITER ;

CALL get_all_employees(); ## LLamada al procedimiento 

/** Se elimina tabla employees y crea de nuevo para el siguiente ejercicio por campos diferentes **/
DROP TABLE employees;
CREATE TABLE employees (
	id INT PRIMARY KEY,
	name VARCHAR(50),
	age INT,
	department VARCHAR(50)
);
INSERT INTO employees (id, name, age, department) VALUES 
(1, 'John Doe', 30, 'Engineering'),
(2, 'Jane Smith', 35, 'Marketing'),
(3, 'Mike Johnson', 28, 'Sales'),
(4, 'Sarah Williams', 32, 'Finance');

/** Crea un procedimiento que coja un nombre de departamento y muestre a todos los empleados. **/
DELIMITER $$
CREATE PROCEDURE get_employee_by_department ( IN depto VARCHAR(50) ) # se le pasa parametro de entrada IN llamado depto de tipo VARCHAR(50)
BEGIN 
	SELECT * FROM employees WHERE department = depto; #Se utiliza el parametro para filtrar los resultados en el where
END $$
DELIMITER ;

CALL get_employee_by_department('Marketing');  ## LLamada al procedimiento 

/** Se elimina tabla employees y crea de nuevo para el siguiente ejercicio por campos diferentes **/
DROP TABLE Employees;
CREATE TABLE Employees (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50),
	department VARCHAR(50),
	salary DECIMAL(10,2)
);
INSERT INTO Employees (name, department, salary)
VALUES ('John Doe', 'Sales', 5000.00),
('Jane Smith', 'Marketing', 6000);

/** Crea un procedimiento almacenado GetEmployeeSalary que coja el nombre de un empleado y devuelva su salario */
DELIMITER $$
CREATE PROCEDURE GetEmployeeSalary ( IN nombre VARCHAR(50), OUT salario decimal(10,2) ) 
BEGIN 
	 SELECT salary INTO salario 
     FROM Employees WHERE name = nombre;
END $$
DELIMITER ;

CALL GetEmployeeSalary('John Doe', @salario);
SELECT @salario;

/** Se elimina tabla customersy crea de nuevo para el siguiente ejercicio por campos diferentes **/
DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
	id INT PRIMARY KEY,
	name VARCHAR(100),
	email VARCHAR(100)
);

INSERT INTO customers (id, name, email) VALUES
(1, 'John Doe', 'john.doe@example.com'),
(2, 'Jane Smith', 'jane.smith@example.com');

DELIMITER //
CREATE PROCEDURE get_customer_details(IN customer_id INT)
	BEGIN
		SELECT * FROM customers WHERE id = customer_id;
	END //
DELIMITER ;

# Elimina el procediiento get_customer_details
DROP PROCEDURE get_customer_details;