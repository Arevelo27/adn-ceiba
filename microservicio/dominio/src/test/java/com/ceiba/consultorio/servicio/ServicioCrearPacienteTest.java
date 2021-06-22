package com.ceiba.consultorio.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ServicioCrearPacienteTest {

    private static final Long ID_PACIENTE =  99l;

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
    public void validarIdentificacionLongitudMenor8Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdentificacion(1111);
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_IDENTIFICACION, LONGITUD_MINIMA_IDENTIFICACION));
    }

    @Test
    public void validarNombreLongitudMenor4Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conNombres("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_NOMBRES, LONGITUD_MINIMA_NOMBRE));
    }

    @Test
    public void validarApellidoLongitudMenor4Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conApellidos("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_APELLIDOS, LONGITUD_MINIMA_APELLIDOS));
    }

    @Test
    public void validarDireccionLongitudMenor7Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conDireccion("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_DIRECCION, LONGITUD_MINIMA_DIRECCION));
    }

    @Test
    public void validarTelefonoLongitudMenor7Test() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conTelefono("eee");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionLongitudValor.class, String.format(MENSAJES_CAMPO_LONGITUD_TELEFONO, LONGITUD_MINIMA_TELEFONO));
    }

    @Test
    public void validarEmailTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conEmail("abhigmail.com");
        // act - assert
        BasePrueba.assertThrows(() -> pacienteTestDataBuilder.build(), ExcepcionValorInvalido.class, MENSAJES_VALIDATOR_EMAIL);
    }

    @Test
    public void crearPagoTest() {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdPaciente(99);

        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        ServicioCrearPaciente servicioCrearPaciente = new ServicioCrearPaciente(repositorioPaciente);

        //act
        Paciente pacienteRespuesta = pacienteTestDataBuilder.build();
        when(repositorioPaciente.crear(pacienteRespuesta)).thenReturn(ID_PACIENTE);
        servicioCrearPaciente.ejecutar(pacienteRespuesta);

        //assert
        Long idPaciente = Long.parseLong(pacienteRespuesta.getIdPaciente().toString());
        assertEquals(idPaciente, ID_PACIENTE);
    }

    @Test
    public void validarPacienteExistenciaPreviaTest() {
        // arrange
        Paciente paciente = new PacienteTestDataBuilder().conIdPaciente(99).build();
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);

        //act
        Mockito.when(repositorioPaciente.existe(paciente.getIdentificacion())).thenReturn(Boolean.TRUE);
        ServicioCrearPaciente servicioCrearPaciente = new ServicioCrearPaciente(repositorioPaciente);

        // act - assert
        BasePrueba.assertThrows(() -> servicioCrearPaciente.ejecutar(paciente), ExcepcionDuplicidad.class, servicioCrearPaciente.EL_PACIENTE_YA_EXISTE_EN_EL_SISTEMA);
    }
}
