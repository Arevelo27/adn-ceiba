package com.ceiba.consultorio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class DtoEntidadPaciente {
    private Long idEntidadPaciente;
    private String paciente;
    private String entidad;
    private Double valor;
    private LocalDateTime fechaVinculacion;
    private LocalDateTime fechaPago;
    private String activo;
}
