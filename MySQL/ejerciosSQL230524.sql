/**	Base de datos Libros/Biblioteca */

DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;

USE biblioteca;

/* AUTOR */
CREATE TABLE author (
	id int primary key,
    name varchar(60) NOT NULL,
    birth_year int NOT NULL,
    death_year int
);

/* BOOK */
CREATE TABLE book (
	id int primary key,
    author int NULL,
    title varchar(60),
    publish_year int,
    publishing_house varchar(60),
    valoracion decimal(5,2),
    foreign key (author) references author(id)
);

/* ADAPTACION */
CREATE TABLE adaptacion (
	book_id int primary key,
    type varchar(60),
    title varchar(60),
    release_year year,
    rating decimal(5,2),
    foreign key (book_id) references book(id)
);

/* REVIEW */
CREATE TABLE review (
	id int primary key auto_increment,
	book_id int,
    review varchar(200),
    author varchar(60),
    foreign key (book_id) references book(id)
);

/** DATOS DE PRUEBAS */
INSERT INTO author (id, name, birth_year, death_year) VALUES
(1, 'Marcella Cole', 1983, NULL),
(2, 'Lisa Mullins', 1891, 1950),
(3, 'Dennis Stokes', 1935, 1994),
(4, 'Randolph Vasquez', 1957, 2004),
(5, 'Daniel Branson', 1965, 1990);

INSERT INTO book (id, author, title, publish_year, publishing_house,valoracion ) VALUES
(1, null, 'Soulless girl', 2008,'Golden Albatros', 43),
(2, null, 'Weak Heart', 1980,'Diarmud Inc.', 38),
(3, 4, 'Faith of Light', 1995,'White Cloud Press', 43),
(4, null, 'Memory of Hope', 2000,'Rutis Enterprise', 27),
(5, null, 'Warrior of Wind', 2005,'Maverick', 46);

INSERT INTO adaptacion (book_id, type, title, release_year, rating) VALUES
(1, 'movie', 'Gone With The Wolves: The Beginning', '2008', 3),
(3, 'movie', 'Companions of Tomorrow', '2001', 4.2),
(5, 'movie', 'Homeless Warrior', '2008', 4),
(2, 'movie', 'Blacksmith with Silver', '2014', 4.3),
(4, 'movie', 'PatronsAnd Bearers', '2004', 3.2);

INSERT INTO review (book_id, review, author) VALUES
(1, 'An incredible book', 'Sylvia Jones'),
(1, 'Great, although it has some flaws', 'Jessica Parker'),
(2, 'Dennis Stokes takes the reader for a ride full of emotions', 'Thomas Green'),
(3, 'Incredible craftsmanship of the author', 'Martin Freeman'),
(4, 'Not the best book by this author', 'Jude Falth'),
(5, 'Claudia Johnson at her best!', 'Joe Marqiz'),
(5, 'I cannot recall more captivating plot', 'Alexander Durham');

# Ejercicio 1: Listar todos los libros y sus autores
SELECT l.title, a.name FROM book as l JOIN author as a ON l.author = a.id;

# Ejercicio 2: Listar autores y libros publicados después de 2005
SELECT l.title, a.name FROM book as l LEFT JOIN author as a ON l.author = a.id WHERE l.publish_year >= 2005;

# Ejercicio 3: Mostrar libros adaptados en un plazo de 4 años y clasificados por debajo de la adaptación
SELECT l.title FROM book as l JOIN adaptacion as a ON l.id=a.book_id 
WHERE l.valoracion < (a.rating *10) 
AND (a.release_year - l.publish_year < 4);

# Ejercicio 4: Mostrar todos los libros y sus adaptaciones (si las  hay)
SELECT l.title as libro, a.title as adaptacion FROM book as l LEFT JOIN adaptacion as a ON l.id =a.book_id;

# Ejercicio 5: Mostrar todos los libros y sus adaptaciones cinematográficas
SELECT l.title as libro, a.title as adaptacion FROM book as l JOIN adaptacion as a ON l.id =a.book_id WHERE a.type LIKE 'movie';

# Ejercicio 6: Mostrar todos los libros con sus reseñas (si las hay)
SELECT l.title as libro, r.review FROM book as l LEFT JOIN review as r ON l.id =r.book_id;

# Ejercicio 7: Enumerar todos los libros y todos los autores
SELECT l.title as libro, a.name as autor FROM book as l CROSS JOIN author as a ON l.author = a.id;

# Mostrar titulo-año de publicacion de los libros
SELECT concat(title, "-", publish_year) as Titulo_Anho FROM book;

# Mostrar titulo*año de publicacion de los libros
SELECT concat_ws('*', title, publish_year, valoracion) as info FROM book;

#Muestra los 10 ultimos caracteres de la concatenacion anterior
SELECT right( concat_ws('*', title, publish_year, valoracion) , 10) as info FROM book; 

#Muestra el titulo de aquellos libros cuya longitud sea mayor a 10
SELECT title FROM book WHERE length(title) > 10;

# En la bd tienda por el precio del producto en binario
use tienda;
SELECT nombre, bin(precio) FROM producto;

# Muestra el precio del producto en binario de los 3 primeros items de mayor precio 
use tienda;
SELECT nombre, bin(precio) FROM producto ORDER BY precio DESC LIMIT 3;

# Inserta en la tabla libros el nombre del libro al final la palabra copyright
use biblioteca;
SELECT INSERT (title, length(title), length(title), ' COPYRIGHT') FROM book;
SELECT concat(title, ' COPYRIGHT') FROM book;

# Muestra los titulos cambiando la o por la a y el espacio por un guion medio
SELECT replace(replace(title,'o','a'),' ','-') FROM book;

# Muestra el titulo de los libros repetido 2 veces
SELECT repeat(title,2) FROM book;

# Muestra el titulo de los libros repetido 2 veces con la separacion de un guion
SELECT repeat(concat(title,'-'),2) FROM book;

