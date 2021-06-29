package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entidad {
    private Integer idEntidad;
    private String nombreEntidad;

    public Entidad(Integer idEntidad, String entidad) {
        this.idEntidad = idEntidad;
        this.nombreEntidad = entidad;
    }

    public Entidad() {
    }
}
