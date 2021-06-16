package com.ceiba.consultorio.puerto.dao;

import com.ceiba.consultorio.modelo.dto.DtoPago;

import java.util.List;

public interface DaoPago{

    /**
     * Permite listar pagos
     * @return los pagos
     */
    List<DtoPago> listar();

    /**
     * Permite listar pagos por cedula
     * @return los pagos
     */
    List<DtoPago> listarPorCedula(String docIdentificacionPaciente);
}
