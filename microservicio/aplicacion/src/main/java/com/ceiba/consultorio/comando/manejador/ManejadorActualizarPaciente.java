package com.ceiba.consultorio.comando.manejador;

import com.ceiba.consultorio.comando.ComandoPaciente;
import com.ceiba.consultorio.comando.fabrica.FabricaPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.servicio.ServicioActualizarPaciente;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPaciente implements ManejadorComando<ComandoPaciente> {

    private final FabricaPaciente fabricaPaciente;
    private final ServicioActualizarPaciente servicioActualizarPaciente;

    public ManejadorActualizarPaciente(FabricaPaciente fabricaPaciente, ServicioActualizarPaciente servicioActualizarPaciente) {
        this.fabricaPaciente = fabricaPaciente;
        this.servicioActualizarPaciente = servicioActualizarPaciente;
    }

    public void ejecutar(ComandoPaciente comandoPaciente) {
        Paciente paciente = this.fabricaPaciente.actualizar(comandoPaciente);
        this.servicioActualizarPaciente.ejecutar(paciente);
    }
}
