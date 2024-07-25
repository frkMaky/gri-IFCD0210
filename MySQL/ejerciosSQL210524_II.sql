use ejerciciosSQL;

drop table if exists Products;	

create table Products(
	ProductID int primary key,
	ProductName	varchar(60),
    SupplierID	int,
    CategoryID int,
	Unit varchar(30),
	Price decimal(10,2)
);

insert into Products (ProductID, ProductName, SupplierID, CategoryID, Unit, Price) values
(1, 'Chais', 1, 1, '10 boxes x 20 bags', 18),
(2, 'Chang', 1, 1, '24 - 12 oz bottles', 19),
(3, 'Aniseed Syrup', 1, 2, '12 - 550 ml bottles', 10),
(4, 'Chef Anton\'s Cajun Seasoning', 2, 2, '48 - 6 oz jars', 22),
(5, 'Chef Anton\'s Gumbo Mix', 2, 2, '36 boxes', 21.35);

# Muestra todos los datos
SELECT * FROM Products;

# Muestra el precio maximo
SELECT max(Price) as Precio_Maximo FROM Products;

# Muestra el precio minimo
SELECT min(Price) as Precio_Minim0 FROM Products;

# Muestra la media de los precios
SELECT avg(Price) as Media FROM Products;

# Muestra la suma de los precios
SELECT sum(Price) as SumaPrecios FROM Products;

# Muestra los nombres de los prooductos ordenados por precio de mayor a menor
SELECT ProductName FROM Products ORDER BY Price DESC;

# Muestra los nomrbes de los productos que finalicen en g
SELECT ProductName FROM Products WHERE ProductName LIKE '%g';

# Muestra el primer nombre de los productos que contengan a y cuyo precio sea el mas bajo
SELECT ProductName FROM Products WHERE ProductName LIKE '%a%' ORDER BY Price ASC LIMIT 1;

# Actualiza la ultima tupla al precio 25.00
UPDATE Products SET Price = 25.00 WHERE ProductID = 5;

# Muestra todas las tuplas cuyo SupplierId no sea 2
SELECT * FROM Products WHERE SupplierId != 2;

# Muestra todos los nombre de producto que empieces por Chef o Chang
SELECT ProductName FROM Products WHERE ProductName LIKE 'Chef%' OR ProductName LIKE 'Chang%';

# muestra todos los datos de las tuplas cuyo precio está entre 20 y 22
SELECT * FROM Products WHERE Price BETWEEN 20 AND 22;

# Muestra todos los datos de las tuplas cuyo ProductId es Impar
SELECT * FROM Products WHERE ProductID %2 != 0;

# Cuenta todas las tuplas cuyo precio sea menor que 24.00
SELECT count(ProductId) FROM Products WHERE Price < 24;

# Cuenta todas las tuplas cuyo precio no sea nulo
SELECT count(ProductId) FROM Products WHERE Price IS NOT NULL;

# Cuenta todas las tuplas y muestra los precios y el resto de campos  cuyo precio no sea nulo
SELECT count(ProductId) as Conteo FROM Products WHERE PRICE IS NOT NULL ;
SELECT ProductID, ProductName, SupplierID, CategoryID, Unit, Price FROM Products WHERE PRICE IS NOT NULL;

# Muestra aquellos productos que contengan una n en el 4to caracter
SELECT * FROM Products WHERE ProductName LIKE '___n%';

# Muestra aquellos productos que tengan extactamente 5 caracteres y acaben en g
SELECT * FROM Products WHERE ProductName LIKE '____g';

# Muestra aquellos productos que no tengan 10 caracteres
SELECT * FROM Products WHERE ProductName NOT like '__________';

# Muestra aquellos productos cuyo nombre este comprendido entre 'ce' y 'cu'
SELECT * FROM Products WHERE ProductName BETWEEN 'Ce' AND 'Cu';

# Muestra aquellos productos cuyo nombre no este entre 'ch' y 'cg';
SELECT * FROM Products WHERE ProductName NOT BETWEEN 'Cg%' AND 'Ci%';