CREATE TABLE motosElectricas(
    nombre_fabricante CHAR(20) PRIMARY KEY,
    precio_unitario INT,
    autonomia_bateria CHAR(10),
    proveedor INT,
    FOREIGN KEY (proveedor) REFERENCES proveedor(prov_id)
);
INSERT INTO motosElectricas VALUES('Starker',  4200000, '18 horas', 101);
INSERT INTO motosElectricas VALUES('Lucky Lion',  5600000, '14 horas', 102);
INSERT INTO motosElectricas VALUES('Be Electric',  4600000, '26 horas', 101);
INSERT INTO motosElectricas VALUES('Aima',  8000000, '20 horas', 103);
INSERT INTO motosElectricas VALUES('Mec de Colombia',  5900000, '18 horas', 104);
INSERT INTO motosElectricas VALUES('Atom Electric',  4500000, '12 horas', 105);

