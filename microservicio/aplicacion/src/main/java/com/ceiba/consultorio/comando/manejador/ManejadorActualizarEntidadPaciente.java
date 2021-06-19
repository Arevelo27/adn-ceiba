package com.ceiba.consultorio.comando.manejador;

import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.comando.fabrica.FabricaEntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.servicio.ServicioActualizarEntidadPaciente;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarEntidadPaciente implements ManejadorComando<ComandoEntidadPaciente> {

    private final FabricaEntidadPaciente fabricaEntidadPaciente;
    private final ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente;

    public ManejadorActualizarEntidadPaciente(FabricaEntidadPaciente fabricaEntidadPaciente, ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente) {
        this.fabricaEntidadPaciente = fabricaEntidadPaciente;
        this.servicioActualizarEntidadPaciente = servicioActualizarEntidadPaciente;
    }

    public void ejecutar(ComandoEntidadPaciente comandoEntidadPaciente) {
        EntidadPaciente entidadPaciente = this.fabricaEntidadPaciente.editar(comandoEntidadPaciente);
        this.servicioActualizarEntidadPaciente.ejecutar(entidadPaciente);
    }
}
