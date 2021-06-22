package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;

import java.time.LocalDateTime;

public class ComandoEntidadPacienteTestDataBuilder {
    private Long idEntidadPaciente;
    private Paciente paciente;
    private Double valor;
    private LocalDateTime fechaPago;
    private Integer activo;

    public ComandoEntidadPacienteTestDataBuilder() {
        Paciente p = new Paciente();
        p.setIdPaciente(1);
        p.setIdentificacion(11111111);
        this.idEntidadPaciente = 1L;
        this.paciente = p;
        this.valor = 80000.0;
        this.fechaPago = LocalDateTime.now();
        this.activo = 1;
    }

    public ComandoEntidadPacienteTestDataBuilder conPaciente(Paciente paciente) {
        this.paciente = paciente;
        return this;
    }

    public ComandoEntidadPacienteTestDataBuilder conValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public ComandoEntidadPacienteTestDataBuilder conFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
        return this;
    }

    public ComandoEntidadPacienteTestDataBuilder conActivo(Integer activo) {
        this.activo = activo;
        return this;
    }

    public ComandoEntidadPaciente build() {
        return new ComandoEntidadPaciente(this.idEntidadPaciente, this.paciente, this.valor, this.fechaPago, this.activo);
    }
}
