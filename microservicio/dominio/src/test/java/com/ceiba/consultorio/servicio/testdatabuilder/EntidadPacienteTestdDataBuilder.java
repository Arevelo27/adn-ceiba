package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EntidadPacienteTestdDataBuilder {

    private Long idEntidadPaciente;
    private Paciente paciente;
    private Double valor;
    private LocalDateTime fechaPago;
    private Integer activo;

    public EntidadPacienteTestdDataBuilder() {
        Paciente p = new Paciente();
        p.setIdPaciente(22);
        p.setIdentificacion(11111111);
        this.idEntidadPaciente = 99999L;
        this.paciente = p;
        this.valor = 0.0;
        this.fechaPago = LocalDateTime.now();
        this.activo = 1;
    }

    public EntidadPacienteTestdDataBuilder conPaciente(Paciente paciente) {
        this.paciente = paciente;
        return this;
    }

    public EntidadPacienteTestdDataBuilder conValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public EntidadPacienteTestdDataBuilder conFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
        return this;
    }

    public EntidadPacienteTestdDataBuilder conActivo(Integer activo) {
        this.activo = activo;
        return this;
    }

    public EntidadPaciente build() {
        return new EntidadPaciente(this.idEntidadPaciente, this.paciente, this.valor, this.fechaPago, this.activo);
    }
}
