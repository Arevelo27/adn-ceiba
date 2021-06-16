package com.ceiba.consultorio.puerto.dao;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.consultorio.modelo.dto.DtoPago;

import java.util.List;

public interface DaoEntidadPaciente {

    /**
     * Permite listar paciente por identificación
     * @return los pagos
     */
    List<DtoEntidadPaciente> listarPorCedula(String docIdentificacionPaciente);
}
