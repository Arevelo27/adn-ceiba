package com.ceiba.consultorio.comando.fabrica;

import com.ceiba.consultorio.comando.ComandoPago;
import com.ceiba.consultorio.modelo.entidad.Pago;
import org.springframework.stereotype.Component;

@Component
public class FabricaPago {
    public Pago crear(ComandoPago comandoPago){

        return new Pago(comandoPago.getIdPago(),comandoPago.getDocumentoIdentificacionDeudor(),
                        comandoPago.getCodigoFactura(), comandoPago.getValorAdeudado()+"",
                        comandoPago.getValorPagado()+"", comandoPago.getFechaVencimientoPago(),
                        comandoPago.getFechaPago());
    }
}
