CREATE DATABASE ejerciciosSQL;

USE ejerciciosSQL;

# 1. Escriba una consulta MySQL para crear una tabla simple de países
# que incluya las columnas country_id, country_name y region_id.
CREATE TABLE paises (
	country_id int primary key auto_increment, 
    country_name varchar(45),
    region_id int
);

#2. Escriba una consulta MySQL para crear una tabla simple de países
#que incluya las columnas country_id, country_name y region_id que ya
#existe.
CREATE TABLE paisesSimple  AS (SELECT * FROM paises);

# 3. Escriba una consulta MySQL para crear la estructura de una tabla
# dup_countries similar a países
CREATE TABLE IF NOT exists  dup_countries LIKE paises;

# 4. Escriba una consulta MySQL para crear una copia duplicada de la
# tabla de países, incluida la estructura y los datos por nombre
# dup_countries.
CREATE TABLE IF NOT EXISTS  dup_countries AS (SELECT * FROM paises);

# 5. Escriba una consulta MySQL para crear una tabla de países y
# establezca una restricción NULL.
DROP TABLE paises;
CREATE TABLE  IF NOT EXISTS paises (
	country_id int primary key auto_increment, 
    country_name varchar(45) NOT NULL,
    region_id decimal(10,2) NOT NULL
);

# 6. Escriba una consulta MySQL para crear una tabla denominada
# trabajos que incluya las columnas job_id, job_title, min_salary,
# max_salary y verifique si la cantidad max_salary excede el límite superior
# 25000.
CREATE TABLE trabajos (
	job_id int primary key,
    job_title varchar (60),
    min_salary decimal(8,2),
    max_salary decimal(8,2),
    CHECK (max_salary <=25000 )
);
#Quita y pon la columna min_salary
ALTER TABLE trabajos DROP COLUMN min_salary;
ALTER TABLE trabajos ADD min_salary decimal(8,2), ADD CHECK (min_salary >= 20000);

# 7. Escriba una consulta MySQL para crear una tabla denominada países
# que incluya las columnas country_id, country_name y region_id y
# asegúrese de que no se ingrese ningún país excepto Italia, India y China
# en la tabla.
DROP TABLE IF EXISTS paises;
CREATE TABLE paises (
	country_id int primary key,
    country_name varchar(60),
    region_id int,
    CHECK ( country_name  IN ('Italia', 'India', 'China') )
);

# 9. Escriba una consulta MySQL para crear una tabla denominada países
# que incluya las columnas id_país, nombre_país y id_región y asegúrese
# de que no se permitan datos duplicados en la columna id_país en el
# momento de la inserción.
DROP TABLE IF EXISTS paises;
CREATE TABLE paises (
	id_país int PRIMARY KEY,
    nombre_país varchar(60),
    id_región int 
);

# 10. Escriba una consulta MySQL para crear una tabla denominada
# trabajos que incluya las columnas job_id, job_title, min_salary y
# max_salary, y asegúrese de que el valor predeterminado para job_title
# esté en blanco, min_salary sea 8000 y max_salary sea NULL se ingrese
# automáticamente en el momento de inserción si no hay ningún valor
# asignado para las columnas especificadas.
DROP TABLE IF EXISTS trabajos;
CREATE TABLE trabajos (
	job_id int PRIMARY KEY,
    job_title varchar(45) default '',
    min_salary decimal (10,2) default 8000,
    max_salary decimal (10,2) default null
);

# 11. Escriba una consulta MySQL para crear una tabla denominada
# países que incluya las columnas country_id, country_name y region_id y
# asegúrese de que la columna country_id sea un campo clave que no
# contendrá ningún dato duplicado en el momento de la inserción.
DROP TABLE IF EXISTS paises;
CREATE TABLE paises (
	country_id int PRIMARY KEY,
    country_name varchar(60),
    id_región int 
);

# 12. Escriba una consulta MySQL para crear una tabla de países que
# incluya las columnas country_id, country_name y region_id y asegúrese
# de que la columna country_id sea única y almacene un valor
# incrementado automáticamente.
DROP TABLE IF EXISTS paises;
CREATE TABLE paises (
	country_id int unique auto_increment,
    country_name varchar(60),
    id_región int 
);

/*
14. Escriba una consulta MySQL para crear una tabla historial_trabajo
que incluya las columnas id_empleado, fecha_inicial, fecha_finalización,
id_trabajo y id_departamento y asegúrese de que la columna
id_empleado no contenga ningún valor duplicado en el momento de la
inserción y que la columna de clave externa id_trabajo contenga solo
esos valores que existen en la tabla de trabajos.
Aquí está la estructura de los trabajos de la tabla;
+------------+--------------+------+-----+-------- -+-------+
| Campo 			| Tipo 			| Nulo | Clave 	| Predeterminado | Adicional
+------------+--------------+------+-----+-------- -+-------+
| TRABAJO_ID 		| varchar(10) 	| NO 	| PRI 	| 					| |
| TÍTULO_TRABAJO 	| varchar(35) 	| NO 	| 		| NULO 				| |
| MIN_SALARIO 		| decimal(6,0) 	| SÍ 	| 		| NULO 				| |
| MAX_SALARIO 		| decimal(6,0) 	| SÍ 	| 		| NULO 				| |
+------------+--------------+------+-----+--------
*/
DROP TABLE IF EXISTS trabajos;
CREATE TABLE trabajos (
	TRABAJO_ID varchar(10) PRIMARY KEY,
	TÍTULO_TRABAJO varchar(35) NOT NULL,
	MIN_SALARIO decimal(6,0), 
	MAX_SALARIO decimal(6,0) 
);
CREATE TABLE historial_trabajo (
	id_empleado int unique, 
	fecha_inicial date, 
	fecha_finalización date,
	id_trabajo varchar(10),
	id_departamento int,
    foreign key (id_trabajo) references trabajos (TRABAJO_ID)
);

/*
16. Escriba una consulta MySQL para crear una tabla de empleados que
incluya las columnas id_empleado, nombre, apellido, correo electrónico,
número de teléfono, fecha_contratación, id_trabajo, salario, comisión,
id_gerente y id_departamento y asegúrese de que la columna
id_empleado no contenga ningún valor duplicado en ese momento. de
inserción, y la columna de clave externa id_departamento, referenciada
por la columna id_departamento de la tabla de departamentos, puede
contener solo aquellos valores que existen en la tabla de departamentos
y otra columna de clave externa id_trabajo, a la que hace referencia la
columna id_departamento de la tabla de trabajos, puede contener solo
aquellos valores que existen en la tabla de trabajos. Se ha utilizado el
motor InnoDB para crear las tablas.
&quot;No se requiere una restricción de clave externa simplemente para unir
dos tablas. Para motores de almacenamiento distintos de InnoDB, es
posible al definir una columna usar una cláusula REFERENCES
tbl_name(col_name), que no tiene ningún efecto real y solo sirve como
una nota. o comentarle que la columna que está definiendo actualmente
pretende hacer referencia a una columna de otra tabla&quot;. -
Referencia dev.mysql.com
Supongamos que la estructura de dos tablas es departamentos y puestos
de trabajo.
+-----------------+--------------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| DEPARTMENT_ID | decimal(4,0) | NO | PRI | 0 ||
| DEPARTMENT_NAME | varchar(30) | NO | | NULL ||
| MANAGER_ID | decimal(6,0) | YES | | NULL ||
| LOCATION_ID | decimal(4,0) | YES | | NULL ||
+-----------------+--------------+------+-----+---------+-------+

+------------+--------------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra|
+------------+--------------+------+-----+---------+-------+
| JOB_ID | varchar(10) | NO | PRI | |
|
| JOB_TITLE | varchar(35) | NO | | NULL |
|
| MIN_SALARY | decimal(6,0) | YES | | NULL |
|
| MAX_SALARY | decimal(6,0) | YES | | NULL |
|
+------------+--------------+------+-----+---------+-------+
*/
use bd1;

create table departamentos (
	id_departamento decimal(4,0) primary key,
    DEPARTMENT_NAME varchar(30) not null,
    MANAGER_ID decimal(6,0),
    LOCATION_ID decimal(4,0) 
) ENGINE=InnoDB;

create table trabajos  (
	id_trabajo varchar(10) primary key,
    JOB_TITLE varchar(35) not null,
    MIN_SALARY decimal(6,0),
    MAX_SALARY decimal(4,0) 
) ENGINE=InnoDB;

create table empleados(
	id_empleado int PRIMARY KEY, 
	nombre varchar(35), 
	apellido varchar(35), 
	email varchar(35),
	telefono int, 
	fecha_contratación date, 
	id_trabajo varchar(35), 
	salario decimal(10,2), 
	comisión int,
	id_gerente int,
	id_departamento decimal(4,0),
    foreign key (id_departamento) references departamentos (id_departamento),
    foreign key (id_trabajo) references trabajos (id_trabajo)
) 	ENGINE=InnoDB;