package com.ceiba.consultorio.comando.fabrica;

import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import org.springframework.stereotype.Component;

@Component
public class FabricaEntidadPaciente {
    public EntidadPaciente crear(ComandoEntidadPaciente comandoEntidadPaciente) {

        return new EntidadPaciente(comandoEntidadPaciente.getIdEntidadPaciente(), comandoEntidadPaciente.getPaciente(),
                comandoEntidadPaciente.getEntidad(), comandoEntidadPaciente.getValor(),
                comandoEntidadPaciente.getFechaVinculacion(), comandoEntidadPaciente.getFechaPago(),
                comandoEntidadPaciente.getActivo());
    }

    public EntidadPaciente editar(ComandoEntidadPaciente comandoEntidadPaciente) {

        return new EntidadPaciente(comandoEntidadPaciente.getIdEntidadPaciente(), comandoEntidadPaciente.getPaciente(),
                comandoEntidadPaciente.getValor(),
                comandoEntidadPaciente.getFechaPago(),
                comandoEntidadPaciente.getActivo());
    }
}
