package com.ceiba.consultorio.puerto.repositorio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;

public interface RepositorioPaciente {

    /**
     * Permite validar si existe un Paciente con un identificacion
     * @param identificacion
     * @return si existe o no
     */
    Integer existePorCedula(Integer identificacion);

    /**
     * Permite validar si existe un Paciente con un identificacion
     * @param identificacion
     * @return si existe o no
     */
    boolean existe(Integer identificacion);

}
