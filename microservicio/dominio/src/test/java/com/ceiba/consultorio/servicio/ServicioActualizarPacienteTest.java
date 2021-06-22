package com.ceiba.consultorio.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.dominio.excepcion.ExcepcionNoExiste;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ServicioActualizarPacienteTest {

    private static final int LONGITUD_MINIMA_IDENTIFICACION = 8;
    private static final int LONGITUD_MINIMA_NOMBRE = 4;
    private static final int LONGITUD_MINIMA_APELLIDOS = 4;
    private static final int LONGITUD_MINIMA_DIRECCION = 7;
    private static final int LONGITUD_MINIMA_TELEFONO = 7;

    public static final String MENSAJES_CAMPO_LONGITUD_IDENTIFICACION = "EL documento de identificación debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_NOMBRES = "EL nombre debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_APELLIDOS = "EL apellido debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_DIRECCION = "La direccion debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_TELEFONO = "EL telefono debe tener una longitud mayor o igual a %s";
    private static final String MENSAJES_VALIDATOR_EMAIL = "Debe ingresar un email valido";

    @Test
    public void validarNombreLongitudMenor4Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conNombres("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.buildActualizar(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_NOMBRES, LONGITUD_MINIMA_NOMBRE));
    }

    @Test
    public void validarApellidoLongitudMenor4Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conApellidos("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.buildActualizar(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_APELLIDOS, LONGITUD_MINIMA_APELLIDOS));
    }

    @Test
    public void validarDireccionLongitudMenor7Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conDireccion("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.buildActualizar(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_DIRECCION, LONGITUD_MINIMA_DIRECCION));
    }

    @Test
    public void validarTelefonoLongitudMenor7Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conTelefono("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.buildActualizar(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_TELEFONO, LONGITUD_MINIMA_TELEFONO));
    }

    @Test
    public void validarEmailTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conEmail("abhigmail.com");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.buildActualizar(), ExcepcionValorInvalido.class, MENSAJES_VALIDATOR_EMAIL);
    }

    @Test
    public void actualizarPagoTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder =
                new PacienteTestDataBuilder().conNombres("ALEJANDRO").conApellidos("ORTEGA");

        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        Paciente paciente = pacienteTestDataBuilder.buildActualizar();
        ServicioActualizarPaciente servicioActualizarPaciente = new ServicioActualizarPaciente(repositorioPaciente);

        //act
        Paciente pacienteRespuesta = pacienteTestDataBuilder.conIdentificacion(99999).buildActualizar();
        when(repositorioPaciente.existeincluyendoId(Mockito.anyInt())).thenReturn(Boolean.TRUE);
        servicioActualizarPaciente.ejecutar(pacienteRespuesta);

        //assert
        Mockito.verify(repositorioPaciente).actualizar(pacienteRespuesta);
    }

    @Test
    public void validarPacienteExistenciaPreviaTest(){
        // arrange
        Paciente paciente = new PacienteTestDataBuilder().conIdPaciente(99).build();
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);

        //act
        when(repositorioPaciente.existe(Mockito.anyInt())).thenReturn(Boolean.TRUE);
        ServicioActualizarPaciente servicioActualizarPaciente = new ServicioActualizarPaciente(repositorioPaciente);

        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarPaciente.ejecutar(paciente), ExcepcionNoExiste.class, servicioActualizarPaciente.EL_PACIENTE_NO_EXISTE_EN_EL_SISTEMA );
    }
}
