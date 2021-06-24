create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);

CREATE TABLE pagos (
    id_Pago int(11) NOT NULL AUTO_INCREMENT,
	documento_Identificacion_deudor int(11) NOT NULL,
    codigo_factura VARCHAR(10) NOT NULL,
    tipo_examen VARCHAR(150) NOT NULL,
	valor_adeudado DECIMAL(20,2) NOT NULL,
	valor_pagado DECIMAL(20,2),
	fecha_vencimiento_pago VARCHAR(10) NOT NULL,
	fecha_pago VARCHAR(10),
    PRIMARY KEY (id_Pago)
);

CREATE TABLE entidad (
    id_entidad int(11) NOT NULL AUTO_INCREMENT,
    eps VARCHAR(250) NOT NULL
);

CREATE TABLE paciente(
    id_paciente int(10) NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(70) NOT NULL,
    apellidos VARCHAR(70) NOT NULL,
    identificacion int(13) NOT NULL,
    direccion VARCHAR(150) NOT NULL,
    telefono varchar (9) NOT NULL,
    email VARCHAR(55) NOT NULL
);

CREATE TABLE entidad_paciente(
    id_entidad_paciente int(10) NOT NULL AUTO_INCREMENT,
    id_paciente int(10) NOT NULL,
    id_entidad int(11) NOT NULL,
    valor DECIMAL(20,2) NOT NULL,
    fecha_viculacion datetime,
    fecha_Pago datetime,
    activo int(1) not null
);

ALTER TABLE entidad_paciente
ADD CONSTRAINT FK_PacienteEntidad
FOREIGN KEY (id_paciente) REFERENCES paciente(id_paciente);

ALTER TABLE entidad_paciente
ADD CONSTRAINT FK_EntidadPaciente
FOREIGN KEY (id_entidad) REFERENCES entidad(id_entidad);

CREATE TABLE especialidad(
    id_especialidad int(10) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(150) NOT NULL,
    descripcion VARCHAR(270) NOT NULL
);

CREATE TABLE medico(
    id_medico int(11) NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    stpm int(11) NOT NULL unique,
    foto_url VARCHAR(250) NULL
);

CREATE TABLE especialidad_medico(
    id_especialidad_medico int(10) NOT NULL AUTO_INCREMENT,
    id_medico int(11) NOT NULL,
    id_especialidad int(11) NOT NULL
);

ALTER TABLE especialidad_medico
ADD CONSTRAINT FK_EspecialidadEspecialidad
FOREIGN KEY (id_especialidad) REFERENCES especialidad(id_especialidad);

ALTER TABLE especialidad_medico
ADD CONSTRAINT FK_EspecialidadMedico
FOREIGN KEY (id_medico) REFERENCES medico(id_medico);

CREATE TABLE medico_disponible(
    id_med_disponible int(10) NOT NULL AUTO_INCREMENT,
    id_especialidad_medico int(10) NOT NULL,
    fecha_ini datetime NOT NULL,
    fecha_fin datetime NOT NULL,
);

ALTER TABLE medico_disponible
ADD CONSTRAINT FK_MedicoDisponible
FOREIGN KEY (id_especialidad_medico) REFERENCES especialidad_medico(id_especialidad_medico);

CREATE TABLE medico_disponible_consulta(
    id_med_disp_const int(10) NOT NULL AUTO_INCREMENT,
    id_med_disponible int(10) NOT NULL,
    fecha_ini datetime NOT NULL,
    fecha_fin datetime NOT NULL,
);

ALTER TABLE medico_disponible_consulta
ADD CONSTRAINT FK_MedicoDisponibleConsulta
FOREIGN KEY (id_med_disponible) REFERENCES medico_disponible(id_med_disponible);

CREATE TABLE metodo_pago(
    id_metodo_pago int(11) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE pago(
    id_pago int(10) NOT NULL AUTO_INCREMENT,
    valor DECIMAL(20,2) NOT NULL,
    fecha_pago datetime,
    id_metodo_pago int(11) NOT NULL
);

ALTER TABLE pago
ADD CONSTRAINT FK_PagoMetodo
FOREIGN KEY (id_metodo_pago) REFERENCES metodo_pago(id_metodo_pago);


CREATE TABLE consultorio(
    id_consultorio int(10) NOT NULL,
    fecha datetime NOT NULL,
    disponible int(1) NOT NULL
);

CREATE TABLE consulta(
    id_consulta int(10) NOT NULL AUTO_INCREMENT,
    id_med_disp_const int(10) NOT NULL,
    id_consultorio int(10) NOT NULL,
    fecha_sistema datetime NOT NULL
);

ALTER TABLE consulta
ADD CONSTRAINT FK_ConsultaMedicoDisponibleConsulta
FOREIGN KEY (id_med_disp_const) REFERENCES medico_disponible_consulta(id_med_disp_const);

ALTER TABLE consulta
ADD CONSTRAINT FK_ConsultaConsultorio
FOREIGN KEY (id_consultorio) REFERENCES consultorio(id_consultorio);

CREATE TABLE pago_consulta_paciente(
    id_pago_const_pac int(10) NOT NULL AUTO_INCREMENT,
    id_consulta int(10) NOT NULL,
    id_paciente int(10) NOT NULL,
    id_pago int(10) NOT NULL
);

ALTER TABLE pago_consulta_paciente
ADD CONSTRAINT FK_PagoConsultaPaciente_1
FOREIGN KEY (id_consulta) REFERENCES consulta(id_consulta);

ALTER TABLE pago_consulta_paciente
ADD CONSTRAINT FK_PagoConsultaPaciente_2
FOREIGN KEY (id_paciente) REFERENCES paciente(id_paciente);

ALTER TABLE pago_consulta_paciente
ADD CONSTRAINT FK_PagoConsultaPaciente_3
FOREIGN KEY (id_pago) REFERENCES pago(id_pago);
