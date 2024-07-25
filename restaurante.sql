CREATE DATABASE restaurante;
USE restautante;

CREATE TABLE usuarios (
	id int primary key auto_increment,
    nombre varchar(50),
    apellidos varchar(50),
    direccion varchar(100),
    email varchar(100),
    telefono varchar(20),
    tarjeta varchar(20)
);

CREATE TABLE producto (
	id int primary key auto_increment,
    nombre varchar(50),
    descripcion varchar(100),
	categoria varchar(50),
    imagen varchar(100),
    precio decimal (10,2)
);

CREATE TABLE reservas (
	id int primary key auto_increment,
	fecha date,
    hora time,
    idUsuario int, 
    comensales int
);
ALTER TABLE reservas ADD foreign key (idUsuario) REFERENCES usuarios(id);

CREATE TABLE articulo (
	id int primary key auto_increment,
	titulo varchar(100),
    cuerpo text,
    imagen varchar(100),
    idUsuario int, 
	fecha date
);
ALTER TABLE articulo ADD foreign key (idUsuario) REFERENCES usuarios(id);

DROP TABLE pedido;

CREATE TABLE pedido (
	id int primary key auto_increment,
    idUsuario int, 
    idProducto varchar(100),
    cantidadProducto varchar(100),
    totalProducto varchar(100),
    total decimal (10,2),
    estado varchar(30),
    foreign key (idUsuario) REFERENCES usuarios(id)
);
ALTER TABLE pedido ADD COLUMN fecha date;
ALTER TABLE pedido ADD COLUMN  hora time;
ALTER TABLE pedido ADD foreign key (idUsuario) REFERENCES usuarios(id);


INSERT INTO producto (nombre, descripcion , categoria , imagen, precio ) VALUES 
('Puerros Asados con Vieiras', 'Puerros asados con vieiras , velo ibérico y vinagreta de avellanas', 'entrantes', '', 11.5),
('Enslada de Queso y Piñones', 'Ensalada de Queso de cabra con piñones, bacon y cebolla caramelizada', 'entrantes', '', 11.75),
('Zamburiñas a la Plancha', 'Zamburiñas a la Plancha con vinagreta de cítricos', 'entrantes', '', 15.5),
('Pulpo a la Plancha', 'Pulpo a la Plancha con aliño verde', 'entrantes', '', 17.95),
('Jamón de Bellota', 'Jamón ibérico 100% de Bellota', 'entrantes', '', 24),
('Ensalada de Bogavante', 'Ensalada de Bogavante con vinagreta de trufa', 'entrantes', '', 24),
('Arroz Negro con Choco y Langostinos', 'Arroz Negro con Choco y Langostinos para 2 personas', 'arroces y pastas', '', 17.9),
('Fideuá de Marisco', 'Fideuá de Marisco para 2 personas', 'arroces y pastas', '', 18),
('Arroz del Señorito', 'Arroz del Señorito para 2 personas', 'arroces y pastas', '', 18.9),
('Paella de Bogavante', 'Paella de Bogavante para 2 personas', 'arroces y pastas', '', 29.9),
('Lomito de Rape', 'Lomito de Rape a la Romana con ensalada de brotes y AliOli', 'pescado', '', 19),
('Bacalao con Puré', 'Bacalao con Puré de berenjena, verduras asadas y tapenade', 'pescado', '', 20),
('Merluza con Almejas', 'Merluza de Pincho con Almejas en Salsa Verde y puré de Coliflor', 'pescado', '', 22.5),
('Rodaballon', 'Rodaballo Salvaje a la Plancha con salteado de trigueros y chipirones', 'pescado', '', 24.85),
('Secreto Ibérido', 'Secreto de Cerdo Ibérico a la parrilla', 'carnes', '', 17),
('Chuletas de lechal', 'Chuletas de Lechal con Ajetes  y Pimientos', 'carnes', '', 18.5),
('Lomo de Vaca', 'Lomo Altode Vaca Madura con Patatas Al Romero', 'carnes', '', 21),
('Solomillo de Vaca', 'Solomillo de Vaca a la Parrilla con Verduras a la Plancha', 'carnes', '', 24),
('Tocinillo con Helado', 'Tocinilocon Marcarpone y Helado de Yogurt', 'postres', '', 6),
('Tarta de Manzana', 'Tarta fina de Manzana y hojaldre', 'postres', '', 6),
('Torrijas', 'Torrijas caramelizadas  con Helado', 'postres', '', 6),
('Fresones con Yogurt', 'Fresones con Yogurt y salsa de Tomillo', 'postres', '', 6),
('Tarta de la Abuela', 'Tarja borracha de chocolate y galletas con helado de vainilla', 'postres', '', 6),
('Botella de Agua', 'Botella de Agua Mineral 1.5l ', 'bebidas', '', 3),
('Refrescos', 'Cocacola, Fanta, Nestea, Zumos, Aquarius', 'bebidas', '', 2.5),
('Café', 'Solo, con leche', 'bebidas', '', 1.5),
('Vino de la Casa', 'Ribeiro botella 3/4', 'bebidas', '', 7),
('Cunqueiro III Milenium 2023', 'Ribeiro botella 3/4', 'bebidas', '', 15),
('Eduardo Bravo 2023', 'Ribeiro botella 3/4', 'bebidas', '', 15),
('Godello Mar de Frades ', 'Albariño botella 3/4 2021 · D.O. Rías Baixas', 'bebidas', '', 28),
('Cervezas', 'Varias Marcas, consulta según prefeerencias', 'bebidas', '', 3);