package com.ceiba.consultorio.servicio;

import com.ceiba.core.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionNoExiste;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ServicioActualizarPagoTest {
    private static final String VALOR_INCREMENTO_ESPERADO = "1100000.0";
    private static final String VALOR_SIN_INCREMENTO = "1000000.0";
    private static final String VALOR_FECHA_ESPERADO = "2021-02-18";
    private static final String FORMATO_FECHA =  "yyyy-MM-dd";
    private static final Long ID_PAGO =  99999L;

    @Test
    public void validarFechaPagoDiaMayorRangoTest()  {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conFechaVencimientoPago("2021-03-30").conFechaPago("2021-02-17").conValorAdeudado("1000000");
        Pago pago = pagoTestDataBuilder.build();

        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        when(repositorioPago.existe(Mockito.anyString())).thenReturn(true);
        ServicioActualizarPago servicioActualizarPago = new ServicioActualizarPago(repositorioPago);

        Pago pagoRespueta = servicioActualizarPago.validarFechaPago(pago);

        // act - assert
        assertEquals(VALOR_INCREMENTO_ESPERADO,pagoRespueta.getValorPagado());
    }

    @Test
    public void validarFechaPagoDiaRangoTest()  {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conFechaVencimientoPago("2021-03-30").conFechaPago("2021-02-10").conValorAdeudado("1000000.0");
        Pago pago = pagoTestDataBuilder.build();

        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        when(repositorioPago.existe(Mockito.anyString())).thenReturn(true);
        ServicioActualizarPago servicioActualizarPago = new ServicioActualizarPago(repositorioPago);

        Pago pagoRespueta = servicioActualizarPago.validarFechaPago(pago);

        // act - assert
        assertEquals(VALOR_SIN_INCREMENTO,pagoRespueta.getValorAdeudado());
    }

    @Test
    public void validarHoraPagoCorrectaTest() throws Exception {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conFechaVencimientoPago("2021-03-30").conFechaPago("2021-02-17").conValorAdeudado("1000000");
        Pago pago = pagoTestDataBuilder.build();


        //act
        Pago pagoRespueta = pagoTestDataBuilder.conFechaPago("2021-02-18").build();

        ServicioActualizarPago servicioActualizarPago = Mockito.mock(ServicioActualizarPago.class);
        Mockito.when(servicioActualizarPago.validarHoraPago(pago)).thenReturn(pagoRespueta);

        // assert
        assertTrue(pagoRespueta.getFechaPago().equalsIgnoreCase(VALOR_FECHA_ESPERADO));
    }

    @Test
    public void validarHoraPagoIncorrectaTest() throws Exception {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder =
                new PagoTestDataBuilder().conFechaVencimientoPago("2021-03-30").conFechaPago("2021-02-17").conValorAdeudado("1000000");
        Pago pago = pagoTestDataBuilder.build();


        //act
        Pago pagoRespueta = pagoTestDataBuilder.conFechaPago("2021-02-17").build();

        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        ServicioActualizarPago servicioActualizarPago = Mockito.mock(ServicioActualizarPago.class);
        Mockito.when(servicioActualizarPago.validarHoraPago(pago)).thenReturn(pagoRespueta);

        // assert
        assertFalse(pagoRespueta.getFechaPago().equalsIgnoreCase(VALOR_FECHA_ESPERADO));
    }


    @Test(expected= ExcepcionNoExiste.class)
    public void actualizarPagoNoExistenteTest() throws Exception {
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder = new PagoTestDataBuilder();
        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        ServicioActualizarPago servicioActualizarPago = new ServicioActualizarPago(repositorioPago);

        //act
        pagoTestDataBuilder.conCodigoFactura("FV-9898").conIdPago(99999L);
        Pago pago = new PagoTestDataBuilder().build();
        servicioActualizarPago.ejecutar(pago);

        //assert
        assertEquals(pago.getIdPago(), ID_PAGO);
    }

    @Test
    public void actualizarPagoTest(){
        // arrange
        PagoTestDataBuilder pagoTestDataBuilder = new PagoTestDataBuilder();
        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);
        Pago pago = pagoTestDataBuilder.build();
        ServicioActualizarPago servicioActualizarPago = new ServicioActualizarPago(repositorioPago);


        //act
        when(repositorioPago.existeincluyendoId(Mockito.anyLong(),Mockito.anyString())).thenReturn(Boolean.TRUE);
        servicioActualizarPago.ejecutar(pago);

        //assert
        Mockito.verify(repositorioPago).actualizar(pago);
    }

    @Test
    public void validarPagoExistenciaPreviaTest(){
        // arrange
        Pago pago = new PagoTestDataBuilder().conIdPago(1L).build();
        RepositorioPago repositorioPago = Mockito.mock(RepositorioPago.class);

        //act
        when(repositorioPago.existeExcluyendoId(Mockito.anyLong(),Mockito.anyString())).thenReturn(Boolean.TRUE);
        ServicioActualizarPago servicioActualizarPago = new ServicioActualizarPago(repositorioPago);

        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarPago.ejecutar(pago), ExcepcionNoExiste.class, servicioActualizarPago.EL_PAGO_NO_EXISTE_EN_EL_SISTEMA );
    }

}
