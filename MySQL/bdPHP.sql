CREATE DATABASE bdPHP;
USE bdPHP;

CREATE TABLE formulario1 (
	id int primary key auto_increment,
    nombre varchar(50),
    email  varchar(50),
    website varchar(50),
    comment varchar(200),
    gender varchar(50)
);

DELETE FROM formulario1;