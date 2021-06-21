package com.ceiba.consultorio.entidad;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarNombresTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conNombres(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }


    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarApellidosTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conApellidos(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarIdentificacionTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdentificacion(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarDireccionTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conDireccion(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarTelefonoTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conTelefono(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }

    @Test(expected = ExcepcionValorObligatorio.class)
    public void validarEmailTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conEmail(null);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
    }

    @Test
    public void validarCreacionPagoTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder();

        //act
        Paciente paciente = pacienteTestDataBuilder.build();

        //assert
        Paciente pacienteTest = new Paciente(paciente.getIdPaciente(), paciente.getNombres(), paciente.getApellidos(), paciente.getIdentificacion(),
                paciente.getDireccion(), paciente.getTelefono(), paciente.getEmail());
        assertNotNull(pacienteTest);
    }
}