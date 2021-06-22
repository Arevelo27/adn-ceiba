package com.ceiba.consultorio.puerto.dao;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;

import java.util.List;

public interface DaoEntidadPaciente {

    /**
     * Permite listar entidades pacientes
     * @return los pagos
     */
    List<DtoEntidadPaciente> listar();

    /**
     * Permite listar paciente por identificación
     * @return los pagos
     */
    List<DtoEntidadPaciente> listarPorCedula(String docIdentificacionPaciente);
}
