/** Trabajo de clase > Bases de datos > VISTAS > Ejercicio
https://drive.google.com/file/d/17trppKGG4aBPowDzZiHROcWXTEUfp5S0/view
**/

/** EJERCICIO VISTAS SQL */ 

# SE CREA LA BASE DE DATOS ed CON LAS TABLAS Departamentos y Empleados y se llenan con algunos datos para los ejercicios

DROP DATABASE IF EXISTS ed;

CREATE DATABASE ed CHARACTER SET utf8mb4;
USE ed;

CREATE TABLE Departamentos (
	idDpto INT PRIMARY KEY,
	nombreDpto VARCHAR(30),
	idUbicacion INT
);

INSERT INTO Departamentos VALUES ( 20,'Márketing', 180);
INSERT INTO Departamentos VALUES ( 30,'Compras', 1700);
INSERT INTO Departamentos VALUES ( 40, 'Recursos humanos', 2400);
INSERT INTO Departamentos VALUES ( 50, 'Envío', 1500);
INSERT INTO Departamentos VALUES ( 60 , 'IT', 1400);
INSERT INTO Departamentos VALUES (70,'Relaciones públicas',2700);
INSERT INTO Departamentos VALUES (80,'Ventas', 2500 );
INSERT INTO Departamentos VALUES ( 90 , 'Ejecutivo', 1700);
INSERT INTO Departamentos VALUES ( 100 , 'Finanzas', 1700);
INSERT INTO Departamentos VALUES ( 110 , 'Contabilidad', 1700);
INSERT INTO Departamentos VALUES (120,'Tesoro' , 1700);
INSERT INTO Departamentos VALUES (130 ,'Tasa corporativa', 1700);
INSERT INTO Departamentos VALUES (140,'Control y crédito' ,1700);
INSERT INTO Departamentos VALUES (150 ,'Servicios al accionista',1700);
INSERT INTO Departamentos VALUES ( 160 , 'Beneficios', 1700);
INSERT INTO Departamentos VALUES ( 170 , 'Payroll' , 1700);

CREATE TABLE Empleados(
	idEmpleado INT PRIMARY KEY,
	nombre VARCHAR(20),
	apellido VARCHAR(25),
	email VARCHAR(25),
	telefono VARCHAR(20),
	fechaAlquiler DATE,
	idTrabajo VARCHAR(10),
	salario INT,
	comisionPct INT,
	idManager INT,
	idDepartamento INT
);

INSERT INTO Empleados VALUES (100, 'Steven', 'King', 'SKING','515.123.4567', '1987-06-17' , 'AD_PRES', 24000 , NULL, NULL, 20);
INSERT INTO Empleados VALUES (101, 'Neena' , 'Kochhar' , 'NKOCHHAR', '515.123.4568' , '1989-11-21' , 'AD_VP' , 17000 , NULL , 100 ,20);
INSERT INTO Empleados VALUES (102 , 'Lex' , 'De Haan' , 'LDEHAAN' ,'515.123.4569' , '1993-09-12' , 'AD_VP' , 17000 , NULL , 100 , 30);
INSERT INTO Empleados VALUES (103 , 'Alexander' , 'Hunold' ,'AHUNOLD' , '590.423.4567' , '1990-09-30', 'IT_PROG' , 9000 , NULL, 102 , 60);
INSERT INTO Empleados VALUES (104 , 'Bruce' , 'Ernst' , 'BERNST' ,'590.423.4568' , '1991-05-21', 'IT_PROG' , 6000 , NULL , 103 ,60);
INSERT INTO Empleados VALUES (105 , 'David' , 'Austin' , 'DAUSTIN', '590.423.4569' , '1997-06-25', 'IT_PROG' , 4800 , NULL , 103 ,60);
INSERT INTO Empleados VALUES (106 , 'Valli' , 'Pataballa' ,'VPATABAL' , '590.423.4560' , '1998-02-05', 'IT_PROG' , 4800 ,NULL , 103 , 40);
INSERT INTO Empleados VALUES (107 , 'Diana' , 'Lorentz' ,'DLORENTZ' , '590.423.5567' , '1999-02-09', 'IT_PROG' , 4200 ,NULL , 103 , 40);
INSERT INTO Empleados VALUES (108 , 'Nancy' , 'Greenberg' ,'NGREENBE' , '515.124.4569' , '1994-08-17', 'FI_MGR' , 12000 ,NULL , 101 , 100);
INSERT INTO Empleados VALUES (109 , 'Daniel' , 'Faviet' , 'DFAVIET', '515.124.4169' , '1994-08-12', 'FI_ACCOUNT' , 9000 , NULL , 108, 170);
INSERT INTO Empleados VALUES (110 , 'John' , 'Chen' , 'JCHEN' ,'515.124.4269' , '1997-04-09', 'FI_ACCOUNT' , 8200 , NULL , 108 ,170);
INSERT INTO Empleados VALUES (111 , 'Ismael' , 'Sciarra' ,'ISCIARRA' , '515.124.4369' , '1997-02-01', 'FI_ACCOUNT' , 7700 ,NULL , 108 , 160);
INSERT INTO Empleados VALUES (112 , 'Jose Manuel' , 'Urman' ,'JMURMAN' , '515.124.4469' , '1998-06-03', 'FI_ACCOUNT' , 7800 ,NULL , 108 , 150);
INSERT INTO Empleados VALUES (113 , 'Luis' , 'Popp' , 'LPOPP' ,'515.124.4567' , '1999-12-07', 'FI_ACCOUNT' , 6900 , NULL , 108 ,140);
INSERT INTO Empleados VALUES (114 , 'Den' , 'Raphaely' , 'DRAPHEAL', '515.127.4561' , '1994-11-08', 'PU_MAN' , 11000 , NULL , 100 ,30);
INSERT INTO Empleados VALUES (115 , 'Alexandra' , 'Khoo' , 'AKHOO', '515.127.4562' , '1995-05-12', 'PU_CLERK' , 3100 , NULL , 114 ,80);
INSERT INTO Empleados VALUES (116 , 'Shelli' , 'Baida' , 'SBAIDA' ,'515.127.4563' ,'1997-12-13', 'PU_CLERK' , 2900 , NULL , 114 , 70);
INSERT INTO Empleados VALUES (117 , 'Sigal' , 'Tobias' , 'STOBIAS', '515.127.4564' , '1997-09-10', 'PU_CLERK' , 2800 , NULL , 114 ,30);
INSERT INTO Empleados VALUES (118 , 'Guy' , 'Himuro' , 'GHIMURO' ,'515.127.4565' , '1998-01-02', 'PU_CLERK' , 2600 , NULL , 114 ,60);
INSERT INTO Empleados VALUES (119 , 'Karen' , 'Colmenares' ,'KCOLMENA' , '515.127.4566' , '1999-04-08', 'PU_CLERK' , 2500 ,NULL , 114 , 130);
INSERT INTO Empleados VALUES (120 , 'Matthew' , 'Weiss' , 'MWEISS', '650.123.1234' ,'1996-07-18', 'ST_MAN' , 8000 , NULL , 100 ,50);
INSERT INTO Empleados VALUES (121 , 'Adam' , 'Fripp' , 'AFRIPP' ,'650.123.2234' , '1997-08-09', 'ST_MAN' , 8200 , NULL , 100 , 50);
INSERT INTO Empleados VALUES (122 , 'Payam' , 'Kaufling' ,'PKAUFLIN' , '650.123.3234' ,'1995-05-01', 'ST_MAN' , 7900 , NULL, 100 , 40);
INSERT INTO Empleados VALUES (123 , 'Shanta' , 'Vollman' ,'SVOLLMAN' , '650.123.4234' , '1997-10-12', 'ST_MAN' , 6500 , NULL, 100 , 50);
INSERT INTO Empleados VALUES (124, 'Kevin' , 'Mourgos' , 'KMOURGOS', '650.123.5234' , '1999-11-12', 'ST_MAN' , 5800 , NULL , 100 ,80);
INSERT INTO Empleados VALUES (125, 'Julia' , 'Nayer' , 'JNAYER' ,'650.124.1214' , '1997-07-02', 'ST_CLERK' , 3200 , NULL , 120 ,50);
INSERT INTO Empleados VALUES (126, 'Irene' , 'Mikkilineni' ,'IMIKKILI' , '650.124.1224' , '1998-11-12', 'ST_CLERK' , 2700 ,NULL , 120 , 50);
INSERT INTO Empleados VALUES (127, 'James' , 'Landry' , 'JLANDRY' ,'650.124.1334' , '1999-01-02' , 'ST_CLERK' , 2400 , NULL , 120 ,90);
INSERT INTO Empleados VALUES (128, 'Steven' , 'Markle' , 'SMARKLE', '650.124.1434' , '2000-03-04' , 'ST_CLERK' , 2200 , NULL , 120 ,50);
INSERT INTO Empleados VALUES (129, 'Laura' , 'Bissot' , 'LBISSOT' ,'650.124.5234' ,'1997-09-10' , 'ST_CLERK' , 3300 , NULL , 121 ,50);
INSERT INTO Empleados VALUES (130, 'Mozhe' , 'Atkinson' ,'MATKINSO' , '650.124.6234' , '1997-10-12' , 'ST_CLERK' , 2800 ,NULL , 121 , 110);

## Ejercicio: Crea una vista que contenga el nombre de los empleados del departamento Recursos Humanos, que se llamaara vista_empleadosRH
CREATE VIEW vista_empleadosRH AS 
SELECT e.nombre FROM Empleados as e JOIN Departamentos as d ON e.idDepartamento = d.idDpto
WHERE d.nombreDpto = 'Recursos humanos';

SELECT * FROM vista_empleadosRH;

## Ejercicio: Borra la vista
DROP VIEW IF EXISTS vista_empleadosRH;

## Ejercicio: Crea una vista que contenga el nombre y apellido de los empleados del depto de Marketing
CREATE VIEW vista_empleadosMarketing AS 
SELECT e.nombre, e.apellido FROM Empleados as e JOIN Departamentos as d ON e.idDepartamento = d.idDpto
WHERE d.nombreDpto = 'Márketing';

SELECT * FROM vista_empleadosMarketing;

## Ejercicio: Modifica la vista para que contenga tambien el email y ponle el alias correo
ALTER VIEW vista_empleadosMarketing AS 
SELECT e.nombre, e.apellido, e.email as correo FROM Empleados as e JOIN Departamentos as d ON e.idDepartamento = d.idDpto
WHERE d.nombreDpto = 'Márketing';

SELECT * FROM vista_empleadosMarketing;

## Ejercicio: Muestra la vista de los emails que contengan la o
/** de la propia vista creada se seleccionan los correos que contienen la o (email tiene el alias de correo) */
SELECT * FROM vista_empleadosMarketing WHERE correo like '%o%';  


