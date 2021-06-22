package com.ceiba.consultorio.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.consultorio.comando.ComandoPaciente;
import com.ceiba.consultorio.comando.ComandoPago;
import com.ceiba.consultorio.comando.fabrica.FabricaPaciente;
import com.ceiba.consultorio.comando.fabrica.FabricaPago;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.servicio.ServicioCrearPaciente;
import com.ceiba.consultorio.servicio.ServicioCrearPago;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPaciente implements ManejadorComandoRespuesta<ComandoPaciente, ComandoRespuesta<Long>> {

    private final FabricaPaciente fabricaPaciente;
    private final ServicioCrearPaciente servicioCrearPaciente;

    public ManejadorCrearPaciente(FabricaPaciente fabricaPaciente, ServicioCrearPaciente servicioCrearPaciente) {
        this.fabricaPaciente = fabricaPaciente;
        this.servicioCrearPaciente = servicioCrearPaciente;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoPaciente comandoPaciente) {
        Paciente paciente = this.fabricaPaciente.crear(comandoPaciente);
        return new ComandoRespuesta<>(this.servicioCrearPaciente.ejecutar(paciente));
    }
}
