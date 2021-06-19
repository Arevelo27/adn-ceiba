package com.ceiba.consultorio.puerto.repositorio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;

public interface RepositorioEntidadPaciente {

    /**
     * Permite actualizar un EntidadPaciente
     * @param pago
     */
    void actualizar(EntidadPaciente pago);

    /**
     * Permite validar si existe un EntidadPaciente con un nombre excluyendo un id
     * @param idPaciente
     * @return si existe o no
     */
    boolean existeincluyendoId(Integer idPaciente);

}
