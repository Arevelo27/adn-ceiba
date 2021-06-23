package com.ceiba.consultorio.comando.manejador;

import com.ceiba.consultorio.servicio.ServicioEliminarPaciente;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarPaciente implements ManejadorComando<Integer> {

    private final ServicioEliminarPaciente servicioEliminarPaciente;

    public ManejadorEliminarPaciente(ServicioEliminarPaciente servicioEliminarPaciente) {
        this.servicioEliminarPaciente = servicioEliminarPaciente;
    }

    public void ejecutar(Integer ident) {
        this.servicioEliminarPaciente.ejecutar(ident);
    }
}
