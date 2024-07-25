/*
 Tabla Orders
 CustomerId, FirstName, LastName, Email
 101, John, Doe, john@example.com
 102, Jane, Smith, jane@example.com
 103, Bob, Johnson, bob@example.com
 Tabla Customers
 OrderId, CustomerID,OrderDate,TotalAmount
 1,101,2023-03-01,99.99
 2,102,2023-03-02,149.75
 3,103,2023-03-03,75.25
 4,104,2023-03-04,120
 */
 USE db_empleados;
 
 CREATE TABLE Customers (
	 CustomerId int primary key,
     FirstName varchar(50), 
     LastName varchar(50), 
     Email varchar(50)
 );
 CREATE TABLE  Orders (
	OrderId int primary key,
    CustomerID int,
    OrderDate date,
    TotalAmount decimal(10,2)
 );
 
INSERT INTO Customers (CustomerId, FirstName, LastName, Email) VALUES 
 (101, 'John', 'Doe', 'john@example.com' ),
 (102, 'Jane', 'Smith', 'jane@example.com'),
 (103, 'Bob', 'Johnson', 'bob@example.com');
 
INSERT INTO Orders (OrderId, CustomerID, OrderDate, TotalAmount) VALUES 
(1,101,'2023-03-01',99.99),
(2,102,'2023-03-02',149.75),
(3,103,'2023-03-03',75.25),
(4,104,'2023-03-04',120);
 
#Crea una función para calcular la ganancia total generada por los pedidos.
DELIMITER $$
CREATE FUNCTION gananciaTotal() returns decimal(10,2) reads sql data
BEGIN 
	return (SELECT sum(TotalAmount) FROM Orders);
END $$
DELIMITER ;

SELECT gananciaTotal();

#Crea un procedimiento almacenado que devuelva la información del cliente (nombre y apellidos más lo que ha gastado)
DELIMITER $$
CREATE PROCEDURE clienteInfo (IN idCliente int)
BEGIN
	DECLARE total decimal(10,2);
    set total = (SELECT sum(TotalAmount) FROM Orders WHERE CustomerID = idCliente);
	SELECT FirstName, LastName, total FROM Customers WHERE CustomerID = idCliente;
END $$
DELIMITER ;

CALL clienteInfo(101);
CALL clienteInfo(102);
CALL clienteInfo(104);