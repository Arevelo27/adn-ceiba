insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(1,'72302301','FV-1982','Anestesiología',500000,0,'2020-01-30','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(2,'72302301','FV-1983','Cardiología',300000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(3,'72301302','FV-1984','Cirugía General',500000,0,'2020-01-30','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(4,'72301302','FV-1985','Neurología',500000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(5,'72301303','FV-1986','Oftalmología',1000000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(6,'72301304','FV-1986','Gastroenterología',1000000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(7,'72301304','FV-1986','Endoscopia',1000000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(8,'72301305','FV-1986','Anestesiología',1000000,0,'2020-02-28','');
insert into pagos (id_pago,documento_Identificacion_Deudor,codigo_Factura,tipo_examen,valor_Adeudado,valor_Pagado,fecha_Vencimiento_Pago,fecha_Pago) values(9,'72301305','FV-1986','Cardiología',1000000,0,'2020-02-28','');


---ENTIDAD---
INSERT INTO entidad (eps) values ('Eps Sura');
INSERT INTO entidad (eps) values ('SOS');
INSERT INTO entidad (eps) values ('Cruz Blanca');
INSERT INTO entidad (eps) values ('Eps Sánitas');
INSERT INTO entidad (eps) values ('Solsalud Eps');
INSERT INTO entidad (eps) values ('Exisalud Sas');

---PACIENTE---
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('CARLOS', 'RUIZ', 72302301, 'CR 44A', 'carlos@gmail.com', '991855511');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('ANDRES', 'RUIZ', 72301302, 'CR 44A', 'carlos@gmail.com', '991855512');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('ANA', 'RUIZ', 72301303, 'CR 44A', 'carlos@gmail.com', '991855513');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('MARIA', 'RUIZ', 72301304, 'CR 44A', 'carlos@gmail.com', '991855514');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('KAREN', 'RUIZ', 72301305, 'CR 44A', 'carlos@gmail.com', '991855512');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('LUIS', 'RUIZ', 72301306, 'CR 44A', 'carlos@gmail.com', '991855513');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('JOSE', 'RUIZ', 72301307, 'CR 44A', 'carlos@gmail.com', '991855514');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('EDGAR', 'RUIZ', 72301308, 'CR 44A', 'carlos@gmail.com', '991855588');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('ROBERTO', 'RUIZ', 72301309, 'CR 44A', 'carlos@gmail.com', '991855522');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('MIA', 'RUIZ', 72301310, 'CR 44A', 'carlos@gmail.com', '991855566');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('JEREMY', 'RUIZ', 72301322, 'CR 44A', 'carlos@gmail.com', '991855557');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('PEPE', 'RUIZ', 72301312, 'CR 44A', 'carlos@gmail.com', '991855541');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('KATHY', 'RUIZ', 72301313, 'CR 44A', 'carlos@gmail.com', '991855565');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('MANUEL', 'RUIZ', 72301314, 'CR 44A', 'carlos@gmail.com', '991855561');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('MARCOS', 'RUIZ', 72301316, 'CR 44A', 'carlos@gmail.com', '991855562');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('KARLA', 'RUIZ', 72301391, 'CR 44A', 'carlos@gmail.com', '991855563');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('CARLOS', 'RUIZ', 72301801, 'CR 44A', 'carlos@gmail.com', '991855564');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('EDUARDO', 'RUIZ', 72308301, 'CR 44A', 'carlos@gmail.com', '991855565');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('LESTER', 'RUIZ', 72301901, 'CR 44A', 'carlos@gmail.com', '991855566');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('ERIKA', 'RUIZ', 72301381, 'CR 44A', 'carlos@gmail.com', '991855567');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('TOMAS', 'RUIZ', 72301311, 'CR 44A', 'carlos@gmail.com', '991855568');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('TOMASA', 'RUIZ', 72301491, 'CR 44A', 'carlos@gmail.com', '991855569');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('TITO', 'RUIZ', 72301953, 'CR 44A', 'carlos@gmail.com', '991855570');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('YAHAIRA', 'RUIZ', 72301341, 'CR 44A', 'carlos@gmail.com', '991855571');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('BRAYAN', 'RUIZ', 72301342, 'CR 44A', 'carlos@gmail.com', '991855572');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('KEVIN', 'RUIZ', 72301343, 'CR 44A', 'carlos@gmail.com', '991855573');
INSERT INTO paciente(nombres, apellidos, identificacion, direccion, email, telefono) VALUES('LORENA', 'VALENCIA', 82301343, 'CR 88B', 'lorena@gmail.com', '777855573');

---ENTIDAD_PACIENTE---
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (1, 1, 80000.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 1);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (2, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (3, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (4, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (5, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (6, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (7, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (8, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (9, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (10, 1, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (11, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (12, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (13, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (14, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (15, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (16, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (17, 2, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (18, 3, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (19, 3, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (20, 3, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (21, 4, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (22, 4, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (23, 4, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (24, 5, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);
INSERT INTO entidad_paciente (id_paciente, id_entidad, valor,fecha_viculacion,fecha_Pago,activo) values (25, 6, 0.0, '2021-06-10 05:00:00', '2021-06-10 05:00:00', 0);


---MEDICO---
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('LOLA', 'RUIZ PEPA', 72301362, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('PEPI', 'RUIZ PEPI', 72301363, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('PETRO', 'RUIZ PEPO', 72301364, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('PEPU', 'RUIZ PEPU', 72301365, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MARA', 'RUIZ MARA', 72301366, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('CLAUDIO', 'RUIZ CLAUDIO', 72309367, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('CLAUDIA', 'RUIZ CLAUDIA', 72301368, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('EDSON', 'RUIZ EDSON', 72301369, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('HUGO', 'RUIZ HUGO', 72301370, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('HUMBERTO', 'RUIZ HUMBERTO', 72301371, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('FIORELA', 'RUIZ FIORELA', 72301372, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('TIFFANY', 'RUIZ TIFFANY', 72301373, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('CHUKY', 'RUIZ CHUKY', 72301374, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('FEFE', 'RUIZ FEFE', 72301375, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MARQUINHOS', 'RUIZ MARQUINHOS', 72301376, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MAX', 'RUIZ MAX', 72301377, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MAXA', 'RUIZ MAXA', 72301378, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MAXI', 'RUIZ MAXI', 72301379, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MAXO', 'RUIZ MAXO', 72301380, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('GUSTAVO', 'RUIZ GUSTAVO', 72901381, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('DELIA', 'RUIZ DELIA', 72301382, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('DEWI', 'RUIZ DEWI', 72301383, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('KUN', 'RUIZ KUN', 72301384, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('NAVARRO', 'PEREZ', 72901389, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('CLAUDIA', 'LOPEZ', 72301388, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('DERWIN', 'MENDOZA DEWI', 72301387, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('ALEJANDRO', 'DE LA CRUZ', 72301386, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('HILDA', 'REVELO', 72301385, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('MICHAEL', 'ERAZO', 72301389, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('ALVARO', 'PAEZ', 72301319, '');
INSERT INTO medico(nombres, apellidos, stpm, foto_url) VALUES('ANDRES', 'PEÑA', 72301329, '');

---ESPECIALIDAD---
INSERT INTO especialidad(nombre, descripcion) VALUES('Anestesiología', 'resolverá las necesidades anestésicas que le permitan al paciente recibir el tratamiento y las correcciones medico-quirúrgicas necesarias para la recuperación de su salud.');
INSERT INTO especialidad(nombre, descripcion) VALUES('Anatomía Patológica', 'Al finalizar la especialidad, el alumno manejara con eficiencia las técnicas y procedimientos de la anatomía patológica, para establecer los diagnósticos integrales y confiables de la especialidad');
INSERT INTO especialidad(nombre, descripcion) VALUES('Cardiología', 'Procedimientos de la cardiología para atender la patología y procedimientos cardiológicos en pacientes adultos y pediátricos con la finalidad de reintegrarlos a sus actividades habituales en las mejores condiciones');
INSERT INTO especialidad(nombre, descripcion) VALUES('Cardiología Intervencionista', 'Valorará en forma integral a los pacientes con problemas cardiológicos, con base en la historia clínica y los resultados de los estudios de laboratorio, a fin de establecer el diagnóstico y elaborar y ejecutar el plan terapéutico en forma holística');
INSERT INTO especialidad(nombre, descripcion) VALUES('Cirugía Pediátrica', 'Procedimientos quirúrgicos para atender a los pacientes pediátricos con padecimientos de resolución quirúrgica más frecuentes, tanto electivos como de urgencia.');
INSERT INTO especialidad(nombre, descripcion) VALUES('Cirugía General', 'Procedimientos quirúrgicos para atender a los pacientes con padecimientos de resolución quirúrgica más frecuentes, tanto los electivos como de urgencia, que corresponden a la especialidad de cirugía general');
INSERT INTO especialidad(nombre, descripcion) VALUES('Cirugía Plástica y Reconstructiva', 'procedimientos de la cirugía plástica y reconstructiva, en el paciente con amputaciones, trauma desfigurante y facial, malformaciones congénitas, quemados y con necesidades estéticas');
INSERT INTO especialidad(nombre, descripcion) VALUES('Angiología y Cirugía Vascular', 'Procedimientos de la angiología y cirugía vascular, en el paciente con patología vascular');
INSERT INTO especialidad(nombre, descripcion) VALUES('Dermatología', 'Los métodos y procedimientos de la nueva tecnología disponible mediante la categorización del origen y desarrollo de las diferentes entidades nosológicas que afectan la piel y sus anexos. Para mayor información sobre esta especialidad da clic aquí');
INSERT INTO especialidad(nombre, descripcion) VALUES('Endoscopia', 'Procedimientos diagnósticos y terapéuticos que se llevan a cabo mediante el empleo de la endoscopia, para apoyar al medico tratante en la conformación del diagnostico, mediante el conocimiento de la patología clínica');
INSERT INTO especialidad(nombre, descripcion) VALUES('Gastroenterología', 'Padecimientos del aparato digestivo, utilizando los adelantos tecnológicos y científicos en los procedimientos de diagnóstico clínico, de laboratorio y de gabinete, así como su aplicación en la terapéutica indicada');
INSERT INTO especialidad(nombre, descripcion) VALUES('Ginegología y Obstetricia', 'Proporcionara atención directa, integral y constante a las pacientes con problemas gineco-obstetricos, sobre la base de un suficiente conocimiento de los mecanismos homeostáticos y fisiológicos del organismo humano normal y patológico y de la apreciación');
INSERT INTO especialidad(nombre, descripcion) VALUES('Hematología', 'Valorar los problemas hematológicos, con base en la información clínica adquirida a través de la historia clínica y los resultados de los estudios de laboratorio y gabinete, a fin de establecer el diagnóstico y elaborar y ejecutar el plan terapéutico en forma holística');
INSERT INTO especialidad(nombre, descripcion) VALUES('Infectología', 'Al finalizar la especialidad, el alumno realizará los diagnósticos de los padecimientos infecciosos que le permitan proponer medidas preventivas y proporcionar el tratamiento adecuado en pacientes de todas las edades');
INSERT INTO especialidad(nombre, descripcion) VALUES('Medicina Aeroespacial', 'Al finalizar la especialidad, el alumno realizara los procedimientos diagnósticos y terapéuticos de la especialidad en medicina aeroespacial, además de realizar acciones de medicina del trabajo y preventiva en el ámbito aeronáutico');
INSERT INTO especialidad(nombre, descripcion) VALUES('Medicina de Rehabilitación', 'Las técnicas y procedimientos de la rehabilitación física y mental, en el paciente con capacidades diferentes en cualquier edad para reintegrarlo a sus actividades habituales en las mejores condiciones en su calidad de vida');
INSERT INTO especialidad(nombre, descripcion) VALUES('Medicina Interna', 'Evaluar en forma integral a los pacientes adultos con problemas médicos, con base en el estudio multidisciplinario sustentado en la recopilación de la información clínica adquirida a través de la historia clínica y los resultados de los estudios de laboratorio gabinete,');
INSERT INTO especialidad(nombre, descripcion) VALUES('Nefrología', 'Al finalizar la especialidad, el alumno aplicará procedimientos para la prevención, estudio, diagnóstico y tratamiento de las enfermedades renales y las alteraciones del equilibrio hidro-eletrolitico y ácido básico, en pacientes de todas las edades');
INSERT INTO especialidad(nombre, descripcion) VALUES('Neurología', 'Proporcionara atención específica, directa, integral a los pacientes con problemas neurológicos, para restablecer el funcionamiento normal del sistema nervioso central en todas las edades, que le permita una adecuada integración a su vida cotidiana');
INSERT INTO especialidad(nombre, descripcion) VALUES('Neumología', 'Valorar en forma integral a los pacientes adultos con problemas neumológicos, con base en la información clínica adquirida a través de la historia clínica y los resultados de los estudios de laboratorio y gabinete, a fin de establecer el diagnóstico y elaborar');
INSERT INTO especialidad(nombre, descripcion) VALUES('Oftalmología', 'Determinar el diagnóstico y tratamiento médico, terapeútico y quirúrgico del globo ocular, su aparato de protección y anexos en pacientes con diversos problemas y patologías oftalmológicas para reintegrarlos a sus actividades normales');
INSERT INTO especialidad(nombre, descripcion) VALUES('Ortopedia', 'Proporcionar atención directa, integral y constante a las pacientes con problemas ortopédicos en cualquier edad sobre la base de un suficiente conocimiento de la anatomía del aparato musculo-esquelético, mecanismos traumáticos, biomecánica, homeostásis');
INSERT INTO especialidad(nombre, descripcion) VALUES('Otorrinolaringología', 'Procedimientos médico-quirúrgicos de la especialidad en otorrinolaringología para atender los pacientes con padecimientos de los oídos, nariz y garganta, y la resolución quirúrgica de padecimientos de la cabeza y el cuello tanto los electivos como de urgencia');
INSERT INTO especialidad(nombre, descripcion) VALUES('Medicina General', 'Procedimientos, diagnósticos, además de realizar acciones de medicina del trabajo y preventiva en el paciente');

---ESPECIALIDAD_MEDICO---
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(1, 3);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(2, 3);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(3, 3);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(4, 4);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(5, 4);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(6, 2);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(7, 2);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(8, 2);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(9, 1);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(10, 1);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(11, 1);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(12, 1);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(13, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(14, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(15, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(16, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(17, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(18, 9);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(19, 12);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(20, 12);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(21, 24);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(22, 24);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(23, 24);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(24, 24);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(25, 17);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(26, 21);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(27, 10);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(28, 6);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(29, 6);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(30, 6);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(26, 5);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(27, 5);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(28, 4);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(29, 3);
INSERT INTO especialidad_medico(id_medico, id_especialidad) VALUES(30, 1);

---METODO_PAGO---
INSERT INTO metodo_pago (nombre) values ('Transferencia bancaria');
INSERT INTO metodo_pago (nombre) values ('Tarjetas de crédito o débito');
INSERT INTO metodo_pago (nombre) values ('PayPal');
INSERT INTO metodo_pago (nombre) values ('PSE');

---CONSULTORIO---
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (1, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (2, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (3, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (4, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (5, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (6, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (7, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (8, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (9, '2021-06-10 05:00:00', 1);
INSERT INTO consultorio (id_consultorio, fecha, disponible) values (10, '2021-06-10 05:00:00', 1);
