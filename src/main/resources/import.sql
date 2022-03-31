/*Pupulate table clientes*/
INSERT INTO regiones (id,nombre) VALUES (1,'Sudamérica');
INSERT INTO regiones (id,nombre) VALUES (2,'Centroamérica');
INSERT INTO regiones (id,nombre) VALUES (3,'Norteamérica');
INSERT INTO regiones (id,nombre) VALUES (4,'Europa');
INSERT INTO regiones (id,nombre) VALUES (5,'Asia');
INSERT INTO regiones (id,nombre) VALUES (6,'Africa');
INSERT INTO regiones (id,nombre) VALUES (7,'Oceanía');
INSERT INTO regiones (id,nombre) VALUES (8,'Antártida');

INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Fabian','Tapia','fabian@gmail.com','2010-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Arturo','Tapia','arturo@gmail.com','2011-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (5,'Oscar','Tapia','oscar@gmail.com','2012-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (7,'Gabriel','Tapia','gabriel@gmail.com','2013-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (2,'Rosa','Barroso','rosa@gmail.com','2014-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (4,'Isela','Barroso','isela@gmail.com','2015-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (6,'Miriam','Barroso','miriam@gmail.com','2016-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Karen','Tapia','karen@gmail.com','2017-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Betzabel','Tapia','betabel@gmail.com','2018-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Victor','Tapia','victor@gmail.com','2019-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Hugo','Tapia','hugo@gmail.com','2020-11-12');

INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Fabian','Tapia','fabian@gmail.com','2010-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Arturo','Tapia','arturo@gmail.com','2011-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (5,'Oscar','Tapia','oscar@gmail.com','2012-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (7,'Gabriel','Tapia','gabriel@gmail.com','2013-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (2,'Rosa','Barroso','rosa@gmail.com','2014-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (4,'Isela','Barroso','isela@gmail.com','2015-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (6,'Miriam','Barroso','miriam@gmail.com','2016-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Karen','Tapia','karen@gmail.com','2017-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Betzabel','Tapia','betabel@gmail.com','2018-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Victor','Tapia','victor@gmail.com','2019-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Hugo','Tapia','hugo@gmail.com','2020-11-12');

INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Fabian','Tapia','fabian@gmail.com','2010-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Arturo','Tapia','arturo@gmail.com','2011-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (5,'Oscar','Tapia','oscar@gmail.com','2012-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (7,'Gabriel','Tapia','gabriel@gmail.com','2013-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (2,'Rosa','Barroso','rosa@gmail.com','2014-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (4,'Isela','Barroso','isela@gmail.com','2015-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (6,'Miriam','Barroso','miriam@gmail.com','2016-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Karen','Tapia','karen@gmail.com','2017-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (1,'Betzabel','Tapia','betabel@gmail.com','2018-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (3,'Victor','Tapia','victor@gmail.com','2019-11-12');
INSERT INTO clientes (region_id,nombre,apellido,email,create_at) VALUES (8,'Hugo','Tapia','hugo@gmail.com','2020-11-12');

INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('loge','$2a$10$s7KPhaK8Ic2lWt.VcR8EwOp4MZw/IuGTFhCH8GOQKcXPqD8lWmF7C',1,'ArtLoge','Black','art.loge@gmail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('arturo','$2a$10$UK5RTitXbHw3YSJtZ34km.ZZxBtOhI57XsONVPYM5CjSsC76cZVJS',1,'Arturo','Tapia','f.tapia9206@gmail.com');
INSERT INTO usuarios (username,password,enabled,nombre,apellido,email) VALUES ('fabian','$2a$10$x8oA1W390kIQnlx2o9C1CO0LQx4KU8utPmkbEc2Y/9LB/czbqWpHO',1,'Fabian','Tapia','ftapia@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) values (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) values (2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) values (2,1);
