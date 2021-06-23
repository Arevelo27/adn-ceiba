package com.ceiba.consultorio.consulta;

import com.ceiba.consultorio.modelo.dto.DtoPaciente;
import com.ceiba.consultorio.puerto.dao.DaoPaciente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPaciente {

    private final DaoPaciente daoPaciente;

    public ManejadorListarPaciente(DaoPaciente daoPaciente){
        this.daoPaciente = daoPaciente;
    }

    public List<DtoPaciente> ejecutar(){ return this.daoPaciente.listar(); }

    public List<DtoPaciente> ejecutar(String identificacion){ return this.daoPaciente.listarPorCedula(identificacion); }
}
