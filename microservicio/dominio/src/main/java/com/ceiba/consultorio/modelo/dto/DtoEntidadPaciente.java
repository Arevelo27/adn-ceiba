package com.ceiba.consultorio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoEntidadPaciente {
    private Long idEntidadPaciente;
    private DtoPaciente paciente;
    private String nombreEntidad;
    private Double valor;
    private LocalDateTime fechaVinculacion;
    private LocalDateTime fechaPago;
    private Integer activo;
}
