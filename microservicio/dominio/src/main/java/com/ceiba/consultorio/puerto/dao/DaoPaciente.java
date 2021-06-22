package com.ceiba.consultorio.puerto.dao;

import com.ceiba.consultorio.modelo.dto.DtoPaciente;

import java.util.List;

public interface DaoPaciente {

    /**
     * Permite listar  pacientes
     * @return los pacientes
     */
    List<DtoPaciente> listar();

    /**
     * Permite listar paciente por identificación
     * @return los pacientes
     */
    List<DtoPaciente> listarPorCedula(String docIdentificacion);
}
