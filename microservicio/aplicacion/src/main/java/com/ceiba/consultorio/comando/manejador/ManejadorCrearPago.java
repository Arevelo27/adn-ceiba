package com.ceiba.consultorio.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.consultorio.comando.ComandoPago;
import com.ceiba.consultorio.comando.fabrica.FabricaPago;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.servicio.ServicioCrearPago;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPago implements ManejadorComandoRespuesta<ComandoPago, ComandoRespuesta<Long>> {

    private final FabricaPago fabricaPago;
    private final ServicioCrearPago servicioCrearPago;

    public ManejadorCrearPago(FabricaPago fabricaPago, ServicioCrearPago servicioCrearPago) {
        this.fabricaPago = fabricaPago;
        this.servicioCrearPago = servicioCrearPago;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoPago comandoPago) {
        Pago pago = this.fabricaPago.crear(comandoPago);
        return new ComandoRespuesta<>(this.servicioCrearPago.ejecutar(pago));
    }
}
