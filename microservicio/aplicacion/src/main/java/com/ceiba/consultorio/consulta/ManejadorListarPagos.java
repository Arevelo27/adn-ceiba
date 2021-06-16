package com.ceiba.consultorio.consulta;

import com.ceiba.consultorio.modelo.dto.DtoPago;
import com.ceiba.consultorio.puerto.dao.DaoPago;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPagos {

    private final DaoPago daoPago;

    public ManejadorListarPagos(DaoPago daoPago){
        this.daoPago = daoPago;
    }

    public List<DtoPago> ejecutar(){ return this.daoPago.listar(); }

    public List<DtoPago> ejecutar(String identificacion){ return this.daoPago.listarPorCedula(identificacion); }
}