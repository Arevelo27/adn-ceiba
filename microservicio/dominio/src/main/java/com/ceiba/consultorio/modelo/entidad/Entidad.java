package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Entidad {
    private Long idEntidad;
    private String eps;

    public Entidad(Long idEntidad, String eps) {
        this.idEntidad = idEntidad;
        this.eps = eps;
    }
}
