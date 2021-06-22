package com.ceiba.consultorio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoPaciente {

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

}
