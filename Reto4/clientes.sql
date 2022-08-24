CREATE TABLE clientes(
    username CHAR(20) PRIMARY KEY,
    nombres_cliente CHAR(20),
    apellidos_cliente CHAR(20),
    email CHAR(100),
    celular CHAR(15),
    contraseña INT,
    fecha_nacimiento CHAR(20)
);
INSERT INTO clientes VALUES('lucky', 'Pedro', 'Perez', 'pedroPe1990@hotmail.com', '3114548789', 01124215, '1990-24-06');
INSERT INTO clientes VALUES('malopez', 'Maria', 'Lopez', 'malope@hotmail.com', '3125487416', 45627496, '1995-26-02');
INSERT INTO clientes VALUES('diva', 'Ana', 'Diaz', 'divana@hotmail.com', '3154893678', 78161203, '1992-14-04');
INSERT INTO clientes VALUES('dreamer', 'Luis', 'Rojas', 'luigi26@gmail.com', '3224598798', 63206952, '1997-29-06');
INSERT INTO clientes VALUES('ninja', 'Andres', 'Cruz', 'andy93@gmail.com', '31502511219', 87141241, '1993-08-07');
INSERT INTO clientes VALUES('neon', 'Nelson', 'Ruiz', 'nelsonru@hotmail.com', '3223568095', 47858958, '1998-03-12');
INSERT INTO clientes VALUES('rose', 'Claudia', 'Mendez', 'clauu@gmail.com', '3188305562', 16547463, '2000-07-11');
INSERT INTO clientes VALUES('green', 'Jorge', 'Rodriguez', 'jorger97@gmail.com', '3257841041', 56231741, '1997-01-09');