/** 
Trabajo de clase > Bases de Datos >  Procedimientos2 > procedimientos_ejer4
https://drive.google.com/file/d/1v0Dq8T6hDk5wr3OZEXwSbZTD--w6WDKK/view
**/
CREATE DATABASE sample_db;
USE sample_db;

CREATE TABLE states (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	country VARCHAR(255)
) ENGINE = InnoDB;

CREATE TABLE state_population (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	state_id BIGINT,
	population BIGINT
) ENGINE = InnoDB;

INSERT INTO states(name, country) VALUES
('Massachusetts', 'USA'),
('Wisconsin', 'USA'),
('Oregon', 'USA'),
('Western Australia', 'Australia'),
('Texas','USA'),
('Victoria','Australia'),
('South Australia', 'Australia'),
('Tasmania','Australia'),
('Nevada', 'USA'),
('Queensland','Australia');

INSERT INTO state_population(state_id, population) VALUES 
(1, 7029917),
(2, 5893718),
(3, 4237256),
(4, 2685165),
(5, 29145505),
(6, 6643062),
(7, 1772787),
(8, 540839),
(9, 3104614),
(10, 5240520);

## EJERCICIOS ##
#1. Crea una vista population_stats que muestre TODOS los nombres de estado y su población de la tabla state usando un left join.
CREATE VIEW population_stats AS 
SELECT s.name, sp.population FROM states as s LEFT JOIN state_population as sp ON s.id = sp.state_id;

SELECT * FROM population_stats; 

#2. Modifica la vista anterior para devolver además el campo country
ALTER VIEW population_stats AS 
SELECT s.name, sp.population, s.country FROM states as s LEFT JOIN state_population as sp ON s.id = sp.state_id;

SELECT * FROM population_stats; 

#3. Borra la vista
DROP VIEW population_stats;

#4. Crea un procedimiento almacenado named population_with_in con un parámetro de entrada id_state  y 
# muestra la población para dicho estado. Llámalo para el caso state 1.
DELIMITER $$
CREATE PROCEDURE population_with_in(IN id_state INT)
BEGIN 
	SELECT population FROM state_population WHERE state_id = id_state ;
END $$
DELIMITER ;

CALL population_with_in(1);

#5. Crea un procedimiento almacenado llamado population_with_in_and_out con un parámetro de entrada 
#llamado id_state y un parámetro de salida que cuenta la población
DELIMITER $$
CREATE PROCEDURE population_with_in_and_out(IN id_state INT, OUT contador BIGINT)
BEGIN 
	SET contador = (SELECT population FROM state_population WHERE state_id = id_state );
END $$
DELIMITER ;

CALL population_with_in_and_out(1, @contador);
SELECT @contador;
