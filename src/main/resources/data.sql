INSERT INTO usuario (nombre, email) VALUES ('Juan Perez', 'juan.perez@example.com');
INSERT INTO usuario (nombre, email) VALUES ('Maria Rodriguez', 'maria.rodriguez@example.com');

INSERT INTO articulo (nombre, precio, stock) VALUES ('Articulo 1', 10.99, 100);
INSERT INTO articulo (nombre, precio, stock) VALUES ('Articulo 2', 5.99, 50);
INSERT INTO articulo (nombre, precio, stock) VALUES ('Articulo 3', 7.99, 200);

INSERT INTO comprobante (fecha, total, usuario_id) VALUES ('2022-01-01', 100.00, 1);
INSERT INTO comprobante (fecha, total, usuario_id) VALUES ('2022-01-15', 50.00, 2);

INSERT INTO detalle_comprobante (comprobante_id, articulo_id, cantidad, precio_unitario) VALUES (1, 1, 2, 10.99);
INSERT INTO detalle_comprobante (comprobante_id, articulo_id, cantidad, precio_unitario) VALUES (1, 2, 1, 5.99);
INSERT INTO detalle_comprobante (comprobante_id, articulo_id, cantidad, precio_unitario) VALUES (2, 3, 3, 7.99);