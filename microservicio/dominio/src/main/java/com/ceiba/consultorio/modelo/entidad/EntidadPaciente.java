package com.ceiba.consultorio.modelo.entidad;

import java.time.LocalDateTime;

public class EntidadPaciente {
    private Long idEntidadPaciente;
    private Paciente paciente;
    private Entidad entidad;
    private Double valor;
    private LocalDateTime fechaVinculacion;
    private LocalDateTime fechaPago;
    private Integer activo;

    public EntidadPaciente(Long idEntidadPaciente, Paciente paciente, Entidad entidad, Double valor, LocalDateTime fechaVinculacion, LocalDateTime fechaPago, Integer activo) {
        this.idEntidadPaciente = idEntidadPaciente;
        this.paciente = paciente;
        this.entidad = entidad;
        this.valor = valor;
        this.fechaVinculacion = fechaVinculacion;
        this.fechaPago = fechaPago;
        this.activo = activo;
    }
}
