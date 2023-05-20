drop table if exists alumno;
drop table if exists proyectoIntegrador;
drop table if exists areas;
drop table if exists administrado;


create table areas (
    codigo int(5) primary key,
    nombre varchar(30),
    descripcion varchar(50)
);

create table proyectoIntegrador (
    idProyecto int(5) primary key not null,
    nombreProyecto varchar(30),
    urlProyecto varchar(100),
    nota float(2),
    fecha date,
    curso int(4),
    grupo varchar(50),
    areaCorrespondiente int(5),    
    constraint proyecto_area_fk foreign key (areaCorrespondiente) references areas(codigo)
);

create table alumno (
    numExpediente int(5)primary key,
    codigo int(5) ,
    nombre varchar(20),
    apellidos varchar(20),
    idProyecto int (5), 
    constraint idProyecto_fk foreign key (idProyecto) references proyectoIntegrador (idProyecto)
);

create table administrado (
    idAdministrador int(5) primary key,
    username varchar(20),
    pass varchar(20)
);


INSERT INTO areas (codigo, nombre, descripcion) VALUES (1, 'DAW', 'Desarrollo de Aplicaciones Web');
INSERT INTO areas (codigo, nombre, descripcion) VALUES (2, 'DAM', 'Desarrollo de Aplicaciones Multiplataforma');
INSERT INTO areas (codigo, nombre, descripcion) VALUES (3, 'ASIR','Administración de Sistemas Informáticos en Red');

INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (001, 'Proyecto Integrador 1', 'https://github.com/Proyecto_Integrador1.git', 8.5, CURRENT_DATE(), 2, 'Grupo PAC', 1);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (002, 'Proyecto Integrador 2', 'https://github.com/Proyecto_Integrador2.git', 9, CURRENT_DATE(), 1, 'Grupo Energía Creativa', 2);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (003, 'Proyecto Integrador 3', 'https://github.com/Proyecto_Integrador3.git', 7.5, CURRENT_DATE(), 2, 'Grupo Mentes Alquímicas', 3);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (004, 'Proyecto Integrador 4', 'https://github.com/Proyecto_Integrador4.git', 5, CURRENT_DATE(), 2, 'Grupo Los Visionarios', 2);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (005, 'Proyecto Integrador 5', 'https://github.com/Proyecto_Integrador5.git', 5, CURRENT_DATE(), 1, 'Grupo PAC', 1);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (006, 'Proyecto Integrador 6', 'https://github.com/Proyecto_Integrador6.git', 4, CURRENT_DATE(), 2, 'Grupo Los Cazadores de Tesoros', 2);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (007, 'Proyecto Integrador 7', 'https://github.com/Proyecto_Integrador7.git', 6, CURRENT_DATE(), 1, 'Grupo Los Soñadores Perdidos', 3);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (008, 'Proyecto Integrador 8', 'https://github.com/Proyecto_Integrador8.git', 9.5, CURRENT_DATE(), 2, 'Grupo Los Buscadores de la Verdad', 2);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (009, 'Proyecto Integrador 9', 'https://github.com/Proyecto_Integrador9.git', 8.5, CURRENT_DATE(), 2, 'Grupo Los Maestros del Sonido', 1);
INSERT INTO proyectoIntegrador (idProyecto, nombreProyecto, urlProyecto, nota, fecha, curso, grupo, areaCorrespondiente)
VALUES (010, 'Proyecto Integrador 10', 'https://github.com/Proyecto_Integrador10.git', 9, CURRENT_DATE(), 1, 'Grupo Los Aventureros del Bosque Encantado', 2);

INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (1, 11122, 'Amelia María', 'Coca López', 001);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (2, 22233, 'Juan', 'Cortés Cortés', 001);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (3, 33344, 'Paula', 'Moure Prado', 001);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (6, 66677, 'James Andrew', 'BEHAN', 002);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (7, 77788, 'Ismael', 'Bodas Díaz', 002);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (8, 88899, 'Jorge', 'Burgos Barrera', 002);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (9, 99900, 'Ali', 'Chalak', 003);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (10, 10011, 'JAVIER', 'Chicano Miguel' ,003);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (11, 11022, 'Santiago Andres', 'Daza Villamizar',003);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (12, 12233, 'Amir Mahdi', 'Dorrani',004);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (13, 13344, 'Aarón Juan', 'Escudero Navas',004);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (14, 14455, 'Daniel', 'Garrido Nuñez',004);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (15, 15566, 'Daniel', 'Herrero Martínez',005);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (16, 16677, 'Alejandro', 'Junyent Romani',005);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (17, 17788, 'Aris', 'Maximilian Kuhs',005);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (18, 18899, 'Lucca', 'Manfredotti García',006);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (19, 19900, 'Ismael', 'Moreno Moral',006);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (20, 20011, 'Juan Diego', 'Motta Moncada',006);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (21, 21122, 'Pablo', 'Naranjo Cid',007);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (22, 22234, 'David', 'Oñate Sánchez',007);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (23, 23344, 'Mario', 'Robles Padua',007);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (24, 24455, 'Gabriel Enrique', 'Rodríguez Padrón',008);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (25, 25566, 'David', 'Rojo Villalba',008);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (26, 26677, 'Celia', 'Rubio Pais',008);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (27, 27788, 'Miguel', 'Sánz Villanueva',009);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (28, 28899, 'Elena', 'Saugar Mayoral',009);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (29, 29900, 'Álvaro', 'Serrano Colomer',009);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (30, 30011, 'Josep', 'Serrano Rayó',010);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (31, 31122, 'Wei', 'Xu',010);
INSERT INTO alumno (codigo, numExpediente, nombre, apellidos, idProyecto) VALUES (32, 32233, 'Guoanqi', 'Yin',010);


INSERT INTO administrado (idAdministrador, username, pass) VALUES (0512, 'SaraVillanueva', 'SaraProfesora');
INSERT INTO administrado (idAdministrador, username, pass) VALUES (4321, 'RaquelCerda', 'RaquelProfesora');

