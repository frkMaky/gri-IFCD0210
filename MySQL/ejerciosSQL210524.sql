use bd1; 
/*
drop table if exists empleados;
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
*/

# Muestra todos los nombres de los empleados de la tabla empleados cuya edad no sea 23
SELECT nombre FROM empleados WHERE edad != 23;

# Muestra todos los nombres de empleados de la tabla empleados cuya edad no sea null
SELECT nombre FROM empleados WHERE edad IS NOT NULL;

# Actualiza la tupla de la tabla empleados cuyo id = 11
UPDATE empleados SET edad=26 WHERE id=11;

# Actualiza todas las tuplas de la tabla empleados con la edad 30
UPDATE empleados SET edad=30;

# Muestra el dni del empleado de edad maxima
SELECT dni FROM empleados order by edad desc limit 1;

# Muestra la edad maxima, muestra la edad minima
SELECT max(edad) FROM empleados;
SELECT min(edad) FROM empleados;

# Muestra todos los campos de empleado de aquel empleado con la edad minima
SELECT * FROM empleados order by edad asc limit 1;