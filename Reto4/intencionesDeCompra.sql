CREATE TABLE intencionesDeCompra(
    username CHAR(20),
    nombre_fabricante CHAR(20),
    fecha_hora TIMESTAMP(0),
    FOREIGN KEY (username) REFERENCES clientes(username)
);
INSERT INTO intencionesDeCompra VALUES('lucky', 'Cannondale', '2017-10-25 20:00:00');
INSERT INTO intencionesDeCompra VALUES('lucky', 'Trek', '2019-03-15 18:30:00');
INSERT INTO intencionesDeCompra VALUES('lucky', 'Starker', '2019-05-20 20:30:00');
INSERT INTO intencionesDeCompra VALUES('malopez', 'Cannondale', '2018-05-20 20:30:00');
INSERT INTO intencionesDeCompra VALUES('malopez', 'Starker', '2020-01-20 20:30:00');
INSERT INTO intencionesDeCompra VALUES('diva', 'Yeti', '2019-05-20 20:30:00');
INSERT INTO intencionesDeCompra VALUES('diva', 'Fuji', '2018-06-22 21:30:00');
INSERT INTO intencionesDeCompra VALUES('diva', 'Lucky Lion', '2020-03-17 15:30:20');
INSERT INTO intencionesDeCompra VALUES('dreamer', 'Lucky Lion', '2020-03-17 15:30:20');
INSERT INTO intencionesDeCompra VALUES('dreamer', 'Be Electric', '2020-04-10 18:30:20');
INSERT INTO intencionesDeCompra VALUES('ninja', 'Aima', '2020-02-17 20:30:20');
INSERT INTO intencionesDeCompra VALUES('ninja', 'Starker', '2020-02-20 16:30:20');
INSERT INTO intencionesDeCompra VALUES('ninja', 'Mec de Colombia', '2020-03-27 18:30:20');
INSERT INTO intencionesDeCompra VALUES('rose', 'Atom Electric', '2020-03-20 21:30:20');
INSERT INTO intencionesDeCompra VALUES('green', 'Yeti', '2020-01-10 17:30:20');
INSERT INTO intencionesDeCompra VALUES('green', 'Trek', '2020-02-15 20:30:20');
INSERT INTO intencionesDeCompra VALUES('green', 'Bmc', '2020-03-17 18:30:20');