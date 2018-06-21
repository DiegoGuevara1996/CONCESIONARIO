# CONCESIONARIO
BASE DE DATOS
CREATE DATABASE IF NOT EXISTS concesionario;

USE concesionario;


CREATE TABLE IF NOT EXISTS clientes
(
	codCliente tinyint(4) PRIMARY KEY,
	nombre varchar(30) NOT NULL,
	apellidos varchar(30) NOT NULL,
	direccion varchar(30) NOT NULL,
	poblacion varchar(30) NOT NULL,
	codPostal varchar(6) NOT NULL,
	provincia varchar(20) NOT NULL,telefono varchar(12) NOT NULL,fechaNac date NOT NULL			)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
CREATE TABLE IF NOT EXISTS coches
(matricula varchar(7) PRIMARY KEY,marca varchar(30) NOT NULL,modelo varchar(30) NOT NULL,color varchar(10) NOT NULL,precio decimal(8,2) NOT NULL ,codCliente tinyint(4) NOT NULL,fotografia varchar(30) NOT NULL)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
  ALTER TABLE coches
	ADD CONSTRAINT fk_coches_clientes FOREIGN KEY (codCliente) REFERENCES clientes (codCliente);
