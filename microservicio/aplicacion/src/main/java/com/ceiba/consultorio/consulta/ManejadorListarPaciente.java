package com.ceiba.consultorio.consulta;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.consultorio.modelo.dto.DtoPago;
import com.ceiba.consultorio.puerto.dao.DaoEntidadPaciente;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ManejadorListarEntidadPaciente {

    private final DaoEntidadPaciente daoEntidadPaciente;

    public ManejadorListarEntidadPaciente(DaoEntidadPaciente daoEntidadPaciente){
        this.daoEntidadPaciente = daoEntidadPaciente;
    }

    public List<DtoEntidadPaciente> ejecutar(){ return this.daoEntidadPaciente.listar(); }

    public List<DtoEntidadPaciente> ejecutar(String identificacion){ return this.daoEntidadPaciente.listarPorCedula(identificacion); }
}
