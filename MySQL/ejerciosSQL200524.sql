/** 
	Crea una tabla Persons con los campos ID, LASTNAME, FIRSTNAME , ADDRESS y CITY
    y luego añade un nuevo campo DateOfBirth
*/ 

# USE bd1; # BBDD de pruebas GRI

# CREATE TABLE Persons (
#	 ID INT PRIMARY KEY AUTO_INCREMENT,
#    LastName varchar(45),
#    FirstName varchar(45),
#    Address varchar(90),
#    City varchar(45)
# ); 

# ALTER TABLE Persons ADD DateOfBirth DATE;

/*
INSERT INTO Persons (LastName, FirstName, Address, City) VALUES 
('Hansen', 'Ola', 'Timoteivn 10','Sandnes'),
('Svendson', 'Tove', 'Borgvn 23','Sandnes'),
('Pettersen', 'Kari', 'Storgt 20','Stavanger');
*/

# UPDATE Persons SET DateOfBirth = '1970/01/01' WHERE ID=1;
# UPDATE Persons SET DateOfBirth = '1970/01/01' WHERE ID=2;
# UPDATE Persons SET DateOfBirth = '1970/01/01' WHERE ID=3;

/* Eliminamos campo dateofbirth*/
# ALTER TABLE Persons DROP COLUMN DateOfBirth;

# Busca los nombre que contenga a
SELECT FirstName, LastName FROM Persons WHERE FirstName LIKE '%a%';

# Muestra los nombre de persona cuya ciudad acaba en s
SELECT FirstName FROM Persons WHERE City LIKE '%s';

# Muestra aquellos apelllidos cuyo ID sea mayor que 1
SELECT LastName FROM Persons WHERE ID > 1;

# Elimina la tabla Persons
# DROP TABLE Persons;

# Elimina la bass de datos dbpersonas;
# DROP DATABASE dbpersonas;

SELECT * FROM Persons;

