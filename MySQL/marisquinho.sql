# MARISQUIÑO

CREATE DATABASE marisquinho;

USE marisquinho;

/**
	Tablas: Modalidades    
    skate, bmx y breaking.
*/
CREATE TABLE modalidades (
	id int primary key auto_increment,
    nombre varchar(50)
);
INSERT INTO modalidades (nombre) VALUES
("skate"),("bmx"),("breaking");
/*
	Tablas: Paises
    
	País * (a elegir entre; Afghanistan Albania Algeria Andorra Angola Antigua &
	Deps Argentina Armenia Australia Austria Azerbaijan Bahamas Bahrain Bangladesh Barbados Belarus Belgium Belize Benin Bhutan Bolivia Bosnia
	Herzegovina Botswana Brazil Brunei Bulgaria Burkina Burundi Cambodia Cameroon Canada Cape Verde Central African
	Rep Chad Chile China Colombia Comoros Congo Congo {Democratic Rep} Costa Rica Croatia Cuba Cyprus Czech
	Republic Denmark Djibouti Dominica Dominican Republic East Timor Ecuador Egypt El Salvador Equatorial

	Guinea Eritrea España Estonia Ethiopia Fiji Finland France Gabon Gambia Georgia Germany Ghana Greece Grenada Guatemala Guinea Guinea-
	Bissau Guyana Haiti Honduras Hungary Iceland India Indonesia Iran Iraq Ireland {Republic} Israel Italy Ivory

	Coast Jamaica Japan Jordan KazakhstanKorea Kenya Kiribati Korea North Korea
	South Kosovo Kuwait Kyrgyzstan Laos Latvia Lebanon Lesotho Liberia Libya Liechtenstein Lithuania Luxembourg Macedonia Madagascar Malawi Malaysia M
	Islands Mauritania Mauritius Mexico Micronesia Moldova Monaco Mongolia Montenegro Morocco Mozambique Myanmar,
	{Burma} Namibia Nauru Nepal Netherlands New Zealand Nicaragua Niger Nigeria Norway Oman Pakistan Palau Panama Papua New
	Guinea Paraguay Peru Philippines Poland Portugal Qatar Romania Russian Federation Rwanda St Kitts & Nevis St Lucia Saint Vincent & the
	Grenadines Samoa San Marino Sao Tome & Principe Saudi Arabia Senegal Serbia Seychelles Sierra Leone Singapore Slovakia Slovenia Solomon
	Islands Somalia South Africa South Sudan Sri
	Lanka Sudan Suriname Swaziland Sweden Switzerland Syria Taiwan Tajikistan Tanzania Thailand Togo Tonga Trinidad &
	Tobago Tunisia Turkey Turkmenistan Tuvalu Uganda Ukraine United Arab Emirates United Kingdom United States Uruguay Uzbekistan Vanuatu Vatican
	City Venezuela Vietnam Yemen Zambia Zimbabwe)
*/
CREATE TABLE paises (
	id int primary key auto_increment,
	nombre varchar(50)
);
INSERT INTO paises (nombre) VALUES
("Afghanistan"),("Albania"),("Algeria"),("Andorra"),("Angola"),("Antigua & Deps "),("Argentina"),("Armenia"),("Australia"),("Austria"),("Azerbaijan"),
("Bahamas"), ("Bahrain"), ("Bangladesh"), ("Barbados"),("Belarus"), ("Belgium"), ("Belize"), ("Benin"), ("Bhutan"), ("Bolivia"),
("Bosnia Herzegovina"), ("Botswana"), ("Brazil"), ("Brunei"), ("Bulgaria"), ("Burkina"), ("Burundi"), 
("Cambodia"), ("Cameroon"), ("Canada"), ("Cape Verde"), ("Central African"),("Rep Chad"), ("Chile"), ("China"), ("Colombia"), ("Comoros"), ("Congo"),
("Congo {Democratic Rep}"), ("Costa Rica"), ("Croatia"), ("Cuba"), ("Cyprus"), ("Czech Republic"), ("Denmark"), ("Djibouti"), ("Dominica"), ("Dominican Republic"), 
("East Timor"), ("Ecuador"), ("Egypt"), ("El Salvador"), ("Egypt"), ("Equatorial Guinea"), ("Eritrea"), ("España"), ("Estonia"), ("Ethiopia"), ("Finland"), ("France"),
("Gabon"),("Gambia"),("Georgia"),("Germany"),("Ghana"),("Greece"),("Grenada"),("Guatemala"),("Guinea"),("Guinea-Bissau"),("Guyana"),("Haiti"),("Honduras"),("Hungary"),
("Iceland"),("India"),("Indonesia"),("Iran"),("Ireland"),("{Republic} Israel"),("Italy"),("Ivory Coast"),
("Jamaica"),("Japan"),("Jordan"),("Kazakhstan"),("Kenya"),("Kiribati"),("Korea North"),("Korea South"),("Kosovo"),("Kuwait"),("Kyrgyzstan"),("Laos"),("Latvia"),
("Lebanon"),("Lesotho"),("Liberia"),("Libya"),("Liechtenstein"),("Lithuania"),("Luxembourg"),("Macedonia"),("Madagascar"),("Malawi"),("Malaysia"),("M Islands"),
("Mauritania"),("Mauritius"),("Mexico"),("Micronesia"),("Moldova"),("Monaco"),("Mongolia"),("Montenegro"),("Morocco"),("Mozambique"),("Myanmar"),("{Burma} Namibia"),("Nauru"),
("Nepal"),("Netherlands"),("New Zealand"),("Nicaragua"),("Niger"),("Nigeria"),("Norway"),("Oman"),("Pakistan"),("Palau"),("Panama"),("Papua"),("New Guinea"),("Paraguay"),
("Peru"),("Philippines"),("Poland"),("Portugal"),("Qatar"),("Romania"),("Russian Federation"),("Rwanda"),("St Kitts & Nevis"),("St Lucia"),("Saint Vincent & the Grenadines"),
("Samoa"),("San Marino"),("Sao Tome & Principe"),("Saudi Arabia"),("Senegal"),("Serbia"),("Seychelles"),("Sierra Leone"),("Singapore"),("Slovakia"),("Slovenia"),("Solomon Islands"),
("Somalia"),("South Africa"),("South Sudan"),("Sri Lanka "),("Sudan"),("Suriname"),("Swaziland"),("Sweden"),("Switzerland"),("Syria"),("Taiwan"),
("Tajikistan"),("Tanzania"),("Thailand"),("Togo"),("Tonga"),("Trinidad & Tobago"),("Tunisia"),("Turkey"),("Turkmenistan"),("Tuvalu"),("Uganda"),("Ukraine"),("United Arab Emirates"),
("United Kingdom"),("United States"),("Uruguay"),("Uzbekistan"),("Vanuatu"),("Vatican City"),("Venezuela"),("Vietnam"),("Yemen"),("Zambia"),("Zimbabwe");


/*
	Tablas: Participantes
    
*/
CREATE TABLE participantes (
	id int primary key auto_increment,
    nombre varchar(50),
    apellidos varchar(100),
    telefono varchar(20),
    email varchar(50),
    dni varchar(50),
    fecha_nacimiento date,
    alias varchar(50),
    veterano tinyint(1),
    sponsors varchar(200),
    musica varchar(200),
    instagram varchar(100),
    tiktok varchar(100),
    id_modalidad int,
    id_pais int,
    foreign key (id_modalidad) references modalidades(id),
    foreign key (id_pais) references paises(id)
);

#REGISTRO PARTICIPANTES
INSERT INTO participantes (nombre, apellidos, telefono, email, dni, fecha_nacimiento, alias, veterano, sponsors, musica, instagram, tiktok, id_modalidad, id_pais) VALUES
        ( 'Pablo Abraham', '', '666777888', 'clara@mail.com3', '53186184H', '', 'Rousi', 'on', 'asdlkajdñladj','rock, heavy', 'https://www.instagram.com/pablomaky/?hl=es','https://www.tiktok.com/es/', 1, 1);
        
#LISTADO PARTICIPANTES pod ALIAS-PAIS-MODALIDAD
SELECT p.alias, pais.nombre, m.nombre FROM participantes as p 
LEFT JOIN paises as pais ON p.id_pais = pais.id
LEFT JOIN modalidades as m ON p.id_modalidad = m.id;         
        
# Datos del participante con nombre de pais y modalidad

SELECT p.nombre, p.apellidos, p.alias, p.sponsors, p.musica, p.instagram, p.tiktok, pais.nombre as pais, m.nombre as modalidad FROM participantes as p 
LEFT JOIN paises as pais ON pais.id = p.id_pais
LEFT JOIN modalidades as m ON m.id = p.id_modalidad
WHERE p.id = 94;

        
        
        
        
        