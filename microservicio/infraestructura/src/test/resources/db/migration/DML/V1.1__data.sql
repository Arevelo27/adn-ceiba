insert into pagos
(id_pago,documento_Identificacion_Deudor,codigo_Factura,valor_Adeudado,
valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago)
values(99999,'123456789','FV-9898',1000000,0,'2020-03-30','');

INSERT INTO entidad (eps) values ('Eps Sura');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('CARLOS', 'RUIZ', 11111111, 'CR 44A', 'carlos@gmail.com', '991855511');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('BERTA', 'DE LA CRUZ', 11111112, 'CR 88', 'berta@gmail.com', '991855321');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('CARLOS', 'RUIZ', 11111113, 'CR 44A', 'carlos@gmail.com', '991855511');
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (1, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (2, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 1);