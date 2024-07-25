# Mostrar todos los elementos y campos de una tabla
# SELECT * FROM mitabla;

# Inserta a Oscar de 39 que gana 35000
# INSERT INTO mitabla (nombre, edad, salario) VALUES ("Oscar",39,35000);

# Mostrar solo salario
# SELECT id, salario FROM mitabla;

# Borrar elementos de la tabla
# DELETE FROM mitabla WHERE id=15;

# Muestra los campos nombre y salario
# SELECT nombre, salario FROM mitabla;

# Mostrar los mayores de 18
# SELECT * FROM mitabla WHERE edad>18;

# Mostrar nombre y salario > 30000
# SELECT nombre, salario FROM mitabla WHERE salario>30000;

# Muestra todos los nombres que contengan ca
# SELECT nombre FROM mitabla WHERE nombre LIKE "%ca%";

# Muestra todos los campos de aquellas tuplas cuyo nombre acabe en a
# SELECT * FROM mitabla WHERE nombre LIKE "%a";

# Mostrar todos los campos ordenados por salario de menor a mayor
# SELECT * FROM mitabla ORDER BY salario;

# Inserta a ana de 23, con salario 39000
# INSERT INTO mitabla (nombre, edad, salario) VALUES ("Ana", 23,39000);

# Muestra nombre y salario ordenado por salario y nombre
# SELECT nombre, salario FROM mitabla ORDER BY salario, nombre;

# Inserta en mitabla dos personas con el nombre Susana, muestra todos los campos de las tuplas asociadas a susana 
# Luego muestra una tupla con distinct
/* use bd1;
INSERT INTO mitabla (nombre, edad, salario) VALUES ("Susana", 25,30000);
SELECT * FROM mitabla WHERE nombre = "Susana";
SELECT DISTINCT nombre FROM mitabla; */

# Borrar a la susana introducida
/* DELETE FROM mitabla WHERE nombre='Susana' AND salario=30000;
SELECT * FROM mitabla; */

# Inserta a Monica de 23 y 40000
# INSERT INTO mitabla (nombre, edad, salario) VALUES ("Monica", 23, 40000);

# Muestra todas las Monicas
# SELECT * FROM mitabla WHERE nombre="Monica";

# Muestra la ultima Monica
SELECT distinct nombre, edad, salario FROM mitabla WHERE nombre="Monica" ORDER BY nombre DESC LIMIT 1;