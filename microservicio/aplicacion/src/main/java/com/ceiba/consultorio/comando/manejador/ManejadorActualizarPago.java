package com.ceiba.consultorio.comando.manejador;

import com.ceiba.manejador.ManejadorComando;
import com.ceiba.consultorio.comando.ComandoPago;
import com.ceiba.consultorio.comando.fabrica.FabricaPago;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.servicio.ServicioActualizarPago;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPago implements ManejadorComando<ComandoPago> {

    private final FabricaPago fabricaPago;
    private final ServicioActualizarPago servicioActualizarPago;

    public ManejadorActualizarPago(FabricaPago fabricaPago, ServicioActualizarPago servicioActualizarPago) {
        this.fabricaPago = fabricaPago;
        this.servicioActualizarPago = servicioActualizarPago;
    }

    public void ejecutar(ComandoPago comandoPago) {
        try
        {
            Pago pago = this.fabricaPago.crear(comandoPago);
            this.servicioActualizarPago.ejecutar(pago);
        }catch (Exception e)
        {
            throw e;
        }
    }
}
