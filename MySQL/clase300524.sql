#current_date() nos da la fecha actual en formato yyyy-mm-dd
#base de datos db_empleados
/*tabla Employee con campos emp_id fname lname start_date
1 Michael Smith 2001-06-22
2 Susan Barker 2002-09-12
3 Robert Tvler 2000-02-09
4 Susan Hawthorne 2002-04-24
Crea una función con un parámetro de entrada con la fecha de inicio del empleado y encuentra el número de años que el empleado lleva en la empresa
*/
CREATE database db_empleados;

USE db_empleados;

CREATE TABLE Employee (
	emp_id int primary key,
    fname varchar(50),
    lname varchar(50),
    start_date date
);
INSERT INTO Employee (emp_id, fname, lname, start_date) VALUES 
	(1 ,'Michael', 'Smith', '2001-06-22'),
	(2 ,'Susan', 'Barker', '2002-09-12'),
	(3 ,'Robert', 'Tvler', '2000-02-09'),
	(4 ,'Susan', 'Hawthorne', '2002-04-24');

#Crea una función con un parámetro de entrada con la fecha de inicio del empleado y encuentra el número de años que el empleado lleva en la empresa
DELIMITER $$
CREATE FUNCTION anhosActivo(fechaAlta date) returns int no sql
BEGIN 
	declare fechaActual date;
    declare resultado int;
    
    set fechaActual = current_date();
    set resultado = year(fechaActual) - year(fechaAlta);
    
    return resultado;
END $$
DELIMITER ;

SELECT anhosActivo('2002-04-24') as 'Años Activo' ;


################################################

CREATE TABLE CUSTOMERS (
	ID INT NOT NULL,
	name VARCHAR (20) NOT NULL,
	age INT NOT NULL,
	address CHAR (25),
	salary DECIMAL (18, 2),
	PRIMARY KEY(ID)
);

INSERT INTO CUSTOMERS VALUES
(1, 'Ramesh', 32, 'Ahmedabad', 2000.00),
(2, 'Khilan', 25, 'Delhi', 1500.00),
(3, 'Kaushik', 23, 'Kota', 2000.00),
(4, 'Chaitali', 25, 'Mumbai', 6500.00),
(5, 'Hardik', 27, 'Bhopal', 8500.00),
(6, 'Komal', 22, 'Hyderabad', 4500.00),
(7, 'Muffy', 24, 'Indore', 10000.00);

/** Crear una function llamada DATE_OF_BIRTH que pida la edad y devuelca el año de nacimiento */
DELIMITER $$
CREATE FUNCTION DATE_OF_BIRTH(edad int) returns year reads sql data
BEGIN 
	return year( current_date() ) - edad;
END $$
DELIMITER ;

/** Crea un procedimiento almacenado llamado StudentDetails() que llame a la funcion almacenada DEATE_OF_BIRTH. Nombre , direcc y fechaNAC */
DELIMITER $$
CREATE PROCEDURE StudentDetails(IN idStudent INT)
BEGIN 
	SELECT name, address, DATE_OF_BIRTH(age) as 'Año Nacimiento' FROM CUSTOMERS WHERE ID = idStudent;
END $$
DELIMITER ;

CALL StudentDetails(1);


################################################

