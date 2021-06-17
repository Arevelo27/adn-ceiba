package com.ceiba.consultorio.puerto.dao;

import com.ceiba.consultorio.modelo.dto.DtoPago;

import java.util.List;

public interface DaoEntidad {

    /**
     * Permite listar entidades
     * @return las entidades
     */
    List<DtoPago> listar();

}
