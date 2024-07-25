/** 
Trabajo de clase > Bases de Datos >  Procedimientos2 > procedimientos_ejer3
https://drive.google.com/file/d/1PXHhQDiBUBcEczdjR-Edz54wAvhHnHwW/view
**/

CREATE DATABASE testProceduresII;
USE testProceduresII;

CREATE TABLE CUSTOMERS (
	ID INT NOT NULL,
	NAME VARCHAR (20) NOT NULL,
	AGE INT NOT NULL,
	ADDRESS CHAR (25),
	SALARY DECIMAL (18, 2),
	PRIMARY KEY (ID)
);

INSERT INTO CUSTOMERS VALUES
(1, 'Ramesh', 32, 'Ahmedabad', 2000.00 ),
(2, 'Khilan', 25, 'Delhi', 1500.00 ),
(3, 'Kaushik', 23, 'Kota', 2000.00 ),
(4, 'Chaitali', 25, 'Mumbai', 6500.00 ),
(5, 'Hardik', 27, 'Bhopal', 8500.00 ),
(6, 'Komal', 22, 'Hyderabad', 4500.00 ),
(7, 'Muffy', 24, 'Indore', 10000.00 );

# Crea un procedimiento llamado GetCustomerInfo() sin parametros que devuelva todas las tuplas donde la edad sea mayor que 25
DELIMITER $$
CREATE PROCEDURE GetCustomerInfo() 
BEGIN 
	SELECT * FROM CUSTOMERS WHERE AGE > 25;
END $$
DELIMITER ;

CALL GetCustomerInfo(); ## LLamada al procedimiento 

# Crea un procedimiento llamado GetCustomerInfo() con 1 parametro que devuelva las tuplas donde la edad sea mayor que 25
DELIMITER $$
CREATE PROCEDURE GetCustomerInfo2( IN edad INT) 
BEGIN 
	SELECT * FROM CUSTOMERS WHERE AGE > edad;
END $$
DELIMITER ;

CALL GetCustomerInfo2(25); ## LLamada al procedimiento 

# Crea un procedimiento almacenado que coja el id de customer como parametro de entrada y devuelva el salario
DELIMITER $$
CREATE PROCEDURE getSalary( IN idCustomer INT, OUT salario DECIMAL (18, 2)) 
BEGIN 
	SELECT SALARY into salario FROM CUSTOMERS WHERE ID = idCustomer;
END $$
DELIMITER ;

CALL getSalary(1,@sueldo); # se guarda el resultado en la variable @sueldo
SELECT @sueldo;	 # se muestra el contenido de la variable @sueldo


/** Crea un procedimiento alamcenado que devuelva el salario actual del cliene usando el parametor de entrada cust_id. Incremente 
el salario un 10% mediante un parametro inout*/
DELIMITER $$
CREATE PROCEDURE getSalary2( IN cust_id INT, INOUT salario DECIMAL (18, 2)) 
BEGIN 
	UPDATE CUSTOMERS SET salary = salario * 1.1 WHERE ID = cust_id;
	SELECT SALARY into salario FROM CUSTOMERS WHERE ID = cust_id;
END $$
DELIMITER ;
 
SET @sueldo = 1000;
CALL getSalary2(1, @sueldo);
SELECT @sueldo;
