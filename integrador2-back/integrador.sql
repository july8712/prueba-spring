create database integrador2;

use integrador2;

create table consultas(
id int auto_increment primary key,
nombre varchar(30) not null,
email varchar(35) not null unique,
mensaje varchar(250) not null
);

select * from consultas;

insert into consultas(nombre, email, mensaje)
		values("Tomas", "tomy@email.com", "Hola, cómo estás?");