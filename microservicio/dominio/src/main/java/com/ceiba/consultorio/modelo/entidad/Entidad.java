package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Entidad {
    private Integer idEntidad;
    private String eps;

    public Entidad(Integer idEntidad, String eps) {
        this.idEntidad = idEntidad;
        this.eps = eps;
    }
}
