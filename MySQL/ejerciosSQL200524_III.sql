use ejerciciosSQL;

DROP TABLE Persons;

CREATE TABLE Persons (
	PersonID int PRIMARY KEY,
    LastName varchar(60),
    FirstName varchar(60),
    Age int
);
CREATE TABLE Orders (
	OrderID int PRIMARY KEY,
    OrderNumber int,
    PersonID int,
    foreign key (PersonID) references Persons(PersonID)
);

INSERT INTO Persons (PersonID, LastName, FirstName, Age) VALUES 
(1,	'Hansen', 'Ola', 30),
(2,	'Svendson', 'Tove', 23),
(3,	'Pettersen', 'Kari', 20) ;

INSERT INTO Orders (OrderID, OrderNumber, PersonID) VALUES 
(1, 77895, 3),
(2,	44678, 3),
(3,	22456, 2),
(4,	24562, 1);

ALTER TABLE Persons ADD CHECK (Age>=18);

SELECT * FROM Persons;