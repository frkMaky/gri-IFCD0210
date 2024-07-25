# show databases;

# create database ejemplo2;

# use ejemplo2;

/* create table ciudades (
	codigo varchar(3),
	nombre varchar(30),
	primary key (codigo)
); */

/* create table personas (
	nombre varchar(20),
	direccion varchar(40),
	edad decimal(3),
	codciudad varchar(3)
); */

# insert into ciudades values ('a', 'alicante');
# insert into ciudades values ('b', 'barcelona');
# insert into ciudades values ('m', 'madrid');

# insert into personas values ('juan', 'su casa', 25, 'a');
# insert into personas values ('pedro', 'su calle', 23, 'm');
# insert into personas values ('alberto', 'calle uno', 22, 'b');

# Mostar nombre persona y ciudad y su direccion 
# SELECT personas.nombre, direccion, ciudades.nombre FROM personas, ciudades;

# Mostar nombre persona y ciudad y su direccion 
# SELECT personas.nombre, direccion, ciudades.nombre FROM personas, ciudades WHERE personas.codciudad = ciudades.codigo;

# Mostrar nombre direccion y edad de las personas que viven en Madrid
# SELECT personas.nombre, direccion, edad FROM personas, ciudades WHERE ciudades.nombre = "Madrid" AND personas.codciudad = ciudades.codigo;

# Personas de ciudaddes que comiencen con la letra b 
# SELECT personas.nombre FROM personas, ciudades WHERE ciudades.nombre LIKE 'b%' AND personas.codciudad = ciudades.codigo;