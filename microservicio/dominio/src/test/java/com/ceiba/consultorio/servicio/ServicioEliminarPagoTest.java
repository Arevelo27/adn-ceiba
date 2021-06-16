package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ServicioEliminarPagoTest {
    private static final Long ID_PAGO =  99999L;

    @Test
    public void eliminarPagoTest() throws Exception {
        // arrange
        PagoTestDataBuilder PagoTestDataBuilder = new PagoTestDataBuilder().conIdPago(ID_PAGO);

        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        ServicioCrearPago servicioCrearPago = new ServicioCrearPago(repositorioPago);
        ServicioEliminarPago servicioEliminarPago = new ServicioEliminarPago(repositorioPago);

        //act
        Pago pago = PagoTestDataBuilder.build();
        Mockito.when(repositorioPago.crear(pago)).thenReturn(ID_PAGO);
        servicioCrearPago.ejecutar(pago);
        servicioEliminarPago.ejecutar(pago.getIdPago());

        //assert
        assertEquals(pago.getIdPago(), ID_PAGO);
    }
}
