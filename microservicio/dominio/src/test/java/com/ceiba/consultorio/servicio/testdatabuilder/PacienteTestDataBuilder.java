package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.modelo.entidad.Paciente;

public class PacienteTestDataBuilder {

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

    public PacienteTestDataBuilder() {
        this.idPaciente = 99;
        this.nombres = "PEPE";
        this.apellidos = "CASTILLO";
        this.identificacion = 99999;
        this.direccion = "CR 44 #12-29";
        this.telefono = "3109999999";
        this.email = "pepe.castillo@gmail.com";
    }

    public PacienteTestDataBuilder conIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
        return this;
    }

    public PacienteTestDataBuilder conNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public PacienteTestDataBuilder conApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public PacienteTestDataBuilder conIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
        return this;
    }

    public PacienteTestDataBuilder conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PacienteTestDataBuilder conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public PacienteTestDataBuilder conEmail(String email) {
        this.email = email;
        return this;
    }

    public Paciente build() {
        return new Paciente(this.idPaciente, this.nombres, this.apellidos, this.identificacion, this.direccion, this.telefono, this.email);
    }

}
