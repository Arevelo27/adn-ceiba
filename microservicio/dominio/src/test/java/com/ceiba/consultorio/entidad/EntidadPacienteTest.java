package com.ceiba.consultorio.entidad;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.servicio.testdatabuilder.EntidadPacienteTestdDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntidadPacienteTest {

    private static final double VALOR_PAGO = 80000.00;

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarPacienteTest() {
        // arrange
        EntidadPacienteTestdDataBuilder dataBuilder = new EntidadPacienteTestdDataBuilder().conPaciente(null);

        //act
        EntidadPaciente ep = dataBuilder.build();

        //assert
        EntidadPaciente entidadPacienteTest = new EntidadPaciente(ep.getIdEntidadPaciente(), ep.getPaciente(), ep.getValor(), ep.getFechaPago(), ep.getActivo());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validaValorNullTest() {
        // arrange
        EntidadPacienteTestdDataBuilder dataBuilder = new EntidadPacienteTestdDataBuilder().conValor(null);

        //act
        EntidadPaciente ep = dataBuilder.build();

        //assert
        EntidadPaciente entidadPacienteTest = new EntidadPaciente(ep.getIdEntidadPaciente(), ep.getPaciente(), ep.getValor(), ep.getFechaPago(), ep.getActivo());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarFechaPagoPagoTest() {
        // arrange
        EntidadPacienteTestdDataBuilder dataBuilder = new EntidadPacienteTestdDataBuilder().conFechaPago(null);

        //act
        EntidadPaciente ep = dataBuilder.build();

        //assert
        EntidadPaciente entidadPacienteTest = new EntidadPaciente(ep.getIdEntidadPaciente(), ep.getPaciente(), ep.getValor(), ep.getFechaPago(), ep.getActivo());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarActivoTest() {
        // arrange
        EntidadPacienteTestdDataBuilder dataBuilder = new EntidadPacienteTestdDataBuilder().conActivo(null);

        //act
        EntidadPaciente ep = dataBuilder.build();

        //assert
        EntidadPaciente entidadPacienteTest = new EntidadPaciente(ep.getIdEntidadPaciente(), ep.getPaciente(), ep.getValor(), ep.getFechaPago(), ep.getActivo());
    }

    @Test
    public void validarActualizarPagoTest() {
        // arrange
        EntidadPacienteTestdDataBuilder dataBuilder = new EntidadPacienteTestdDataBuilder();

        //act
        EntidadPaciente ep = dataBuilder.build();

        //assert
        EntidadPaciente entidadPacienteTest = new EntidadPaciente(ep.getIdEntidadPaciente(), ep.getPaciente(), ep.getValor(), ep.getFechaPago(), ep.getActivo());
        assertNotNull(entidadPacienteTest);
    }
}
