package com.ceiba.consultorio.puerto.repositorio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.modelo.entidad.Pago;

public interface RepositorioPaciente {
    /**
     * Permite crear un Paciente
     * @param paciente
     * @return el id generado
     */
    Long crear(Paciente paciente);

    /**
     * Permite actualizar un Paciente
     * @param paciente
     */
    void actualizar(Paciente paciente);

    /**
     * Permite eliminar un Paciente
     * @param id
     */
    void eliminar(Integer id);

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

    /**
     * Permite validar si existe un Pago con un nombre excluyendo un id
     * @param identificacion
     * @return si existe o no
     */
    boolean existeincluyendoId(Integer identificacion);

}
