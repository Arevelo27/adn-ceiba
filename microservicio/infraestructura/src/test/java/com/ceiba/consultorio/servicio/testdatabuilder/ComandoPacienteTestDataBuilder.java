package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.comando.ComandoPaciente;

public class ComandoPacienteTestDataBuilder {

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

    public ComandoPacienteTestDataBuilder() {
        this.idPaciente = 1;
        this.nombres = "CARLOS";
        this.apellidos = "RUIZ";
        this.identificacion = 11111111;
        this.direccion = "CR 44A#12-29";
        this.telefono = "991855511";
        this.email = "carlos@gmail.com";
    }

    public ComandoPaciente build() {
        return new ComandoPaciente(this.idPaciente, this.nombres, this.apellidos, this.identificacion, this.direccion, this.telefono, this.email);
    }

    public ComandoPaciente buildActualizar() {
        return new ComandoPaciente(this.identificacion, this.nombres, this.apellidos, this.direccion, this.telefono, this.email);
    }
}
