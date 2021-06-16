package com.ceiba.consultorio.entidad;

import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class PagoTest {
    private static final String SE_DEBE_INGRESAR_DOCUMENTO_IDENTIFICACION = "Se debe ingresar el documento de identificación";

    @Test(expected=ExcepcionValorObligatorio.class)
    public void validarIdentificacionTest() {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conDocumentoIdentificacionDeudor(null);

        //act
        Pago pago = pagoTestDataBuilder.build();

        //assert
        Pago pagoTest = new Pago(pago.getIdPago(),pago.getDocumentoIdentificacionDeudor(),
                                 pago.getCodigoFactura(),pago.getValorAdeudado(),pago.getValorPagado(),
                                 pago.getFechaVencimientoPago(),pago.getFechaPago());

     }

    @Test(expected=ExcepcionValorObligatorio.class)
    public void validarCodigoFacturaTest() {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conCodigoFactura(null);

        //act
        Pago pago = pagoTestDataBuilder.build();

        //assert
        Pago pagoTest = new Pago(pago.getIdPago(),pago.getDocumentoIdentificacionDeudor(),
                pago.getCodigoFactura(),pago.getValorAdeudado(),pago.getValorPagado(),
                pago.getFechaVencimientoPago(),pago.getFechaPago());

    }

    @Test(expected=ExcepcionValorObligatorio.class)
    public void validarValorAdeudadoTest() {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conValorAdeudado(null);

        //act
        Pago pago = pagoTestDataBuilder.build();

        //assert
        Pago pagoTest = new Pago(pago.getIdPago(),pago.getDocumentoIdentificacionDeudor(),
                pago.getCodigoFactura(),pago.getValorAdeudado(),pago.getValorPagado(),
                pago.getFechaVencimientoPago(),pago.getFechaPago());

    }

    @Test(expected=ExcepcionValorObligatorio.class)
    public void validarFechaVencimientoPagoTest() {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conFechaVencimientoPago(null);

        //act
        Pago pago = pagoTestDataBuilder.build();

        //assert
        Pago pagoTest = new Pago(pago.getIdPago(),pago.getDocumentoIdentificacionDeudor(),
                pago.getCodigoFactura(),pago.getValorAdeudado(),pago.getValorPagado(),
                pago.getFechaVencimientoPago(),pago.getFechaPago());

    }

    @Test
    public void validarCreacionPagoTest() {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder();

        //act
        Pago pago = pagoTestDataBuilder.build();

        //assert
        Pago pagoTest = new Pago(pago.getIdPago(),pago.getDocumentoIdentificacionDeudor(),
                pago.getCodigoFactura(),pago.getValorAdeudado(),pago.getValorPagado(),
                pago.getFechaVencimientoPago(),pago.getFechaPago());

        assertNotNull(pagoTest);
    }

}
