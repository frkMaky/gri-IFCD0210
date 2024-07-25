CREATE DATABASE TestJoin;

USE TestJoin;

CREATE TABLE Departamentos(
	Id int,
	Nombre varchar(20)
);

CREATE TABLE Empleados(
	Nombre varchar(20),
	DepartamentoId int
);

INSERT INTO Departamentos VALUES(31, 'Sales');
INSERT INTO Departamentos VALUES(33, 'Engineering');
INSERT INTO Departamentos VALUES(34, 'Clerical');
INSERT INTO Departamentos VALUES(35, 'Marketing');

INSERT INTO Empleados VALUES('Rafferty', 31);
INSERT INTO Empleados VALUES('Jones', 33);
INSERT INTO Empleados VALUES('Heisenberg', 33);
INSERT INTO Empleados VALUES('Robinson', 34);
INSERT INTO Empleados VALUES('Smith', 34);
INSERT INTO Empleados VALUES('Williams', NULL);

# listar a los empleados e indicar el nombre del departamento al que pertenecen,
SELECT e.*, d.Nombre as DeptoName  FROM Empleados as e, Departamentos as d WHERE e.DepartamentoId = d.Id;
SELECT * FROM Empleados E JOIN Departamentos D ON E.DepartamentoId = D.Id;

# LEFT JOIN 
SELECT e.nombre as 'Empleado', d.nombre as 'Departamento' FROM Empleados e LEFT JOIN Departamentos d ON e.DepartamentoId = d.Id;

# RIGHT JOIN 
SELECT e.nombre as 'Empleado', d.nombre as 'Departamento' FROM Empleados e RIGHT JOIN Departamentos d ON e.DepartamentoId = d.Id;

# FULL JOIN 
SELECT e.nombre as 'Empleado', d.nombre as 'Departamento' FROM Empleados e CROSS JOIN Departamentos d ON e.DepartamentoId = d.Id;

