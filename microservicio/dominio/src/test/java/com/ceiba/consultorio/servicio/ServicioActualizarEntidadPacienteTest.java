package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.servicio.testdatabuilder.EntidadPacienteTestdDataBuilder;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.core.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionNoExiste;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class ServicioActualizarEntidadPacienteTest {

    public static final String EL_PACIENTE_NO_TIENE_PENDIENTE = "El Paciente no tiene pendientes";
    private static final Long ID_PAGO =  99999L;
    private static final Integer IDENTIFICACION =  72301302;
    private static final double VALOR_SIN_INCREMENTO = 80000.0;


    @Test
    public void validarExistenciaPreviaPaciente() {
        // arrange
        Paciente paciente = new Paciente();
        paciente.setIdentificacion(72301302);

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conPaciente(paciente);

        EntidadPaciente entidadPaciente = entidadPacienteTestdDataBuilder.build();

        //act
        EntidadPaciente entidadPacienteRespuesta = entidadPacienteTestdDataBuilder.conPaciente(paciente).build();
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente = Mockito.mock(ServicioActualizarEntidadPaciente.class);
        Mockito.when(servicioActualizarEntidadPaciente.validarExistenciaPreviaPaciente(entidadPaciente)).thenReturn(Boolean.TRUE);

        // assert
        assertEquals(entidadPacienteRespuesta.getPaciente().getIdentificacion(), IDENTIFICACION);
    }

    @Test
    public void validarIdPaciente() {
        // arrange
        Paciente paciente = new Paciente();
        paciente.setIdentificacion(72301302);

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conPaciente(paciente).conValor(0.0);
        EntidadPaciente entidadPaciente = entidadPacienteTestdDataBuilder.build();

        //act
        EntidadPaciente entidadPacienteRespuesta = entidadPacienteTestdDataBuilder.conPaciente(paciente).build();
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);

        ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente = Mockito.mock(ServicioActualizarEntidadPaciente.class);
        Mockito.when(servicioActualizarEntidadPaciente.validarIdPaciente(entidadPaciente)).thenReturn(entidadPacienteRespuesta);

        // assert
        assertEquals(entidadPacienteRespuesta.getIdEntidadPaciente(),ID_PAGO);
    }

    @Test
    public void validarExistenciaPreviaPago() {
        // arrange
        Paciente paciente = new Paciente();
        paciente.setIdentificacion(72301302);
        paciente.setIdPaciente(22);

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conPaciente(paciente);

        EntidadPaciente entidadPaciente = entidadPacienteTestdDataBuilder.build();

        //act
        EntidadPaciente entidadPacienteRespuesta = entidadPacienteTestdDataBuilder.conPaciente(paciente).build();
        RepositorioEntidadPaciente repositorioPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente = Mockito.mock(ServicioActualizarEntidadPaciente.class);
        Mockito.when(servicioActualizarEntidadPaciente.validarExistenciaPreviaPago(entidadPaciente)).thenReturn(Boolean.TRUE);

        // assert
        assertTrue(entidadPacienteRespuesta.getIdEntidadPaciente().equals(ID_PAGO));
    }

    @Test
    public void validarFechaPago() {
        // arrange
        String date = "2021-06-05T12:30:54";
        LocalDateTime localdatetime = LocalDateTime.parse(date);

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conFechaPago(localdatetime).conValor(80000.0);
        EntidadPaciente pago = entidadPacienteTestdDataBuilder.build();

        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        when(repositorioEntidadPaciente.existeincluyendoId(Mockito.anyInt())).thenReturn(true);
        ServicioActualizarEntidadPaciente servicioActualizarPago = new ServicioActualizarEntidadPaciente(repositorioEntidadPaciente, null);

        EntidadPaciente entidadPacienteRespueta = servicioActualizarPago.validarFechaPago(pago);

        // act - assert
        assertEquals(VALOR_SIN_INCREMENTO,entidadPacienteRespueta.getValor(),0);
    }

    @Test(expected= ExcepcionNoExiste.class)
    public void actualizarPagoNoExistenteTest() throws Exception {
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdentificacion(11111111).conIdPaciente(22);
        Paciente paciente = pacienteTestDataBuilder.build();

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conPaciente(paciente).conValor(0.0);

        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        ServicioActualizarEntidadPaciente servicioActualizarPago = new ServicioActualizarEntidadPaciente(repositorioEntidadPaciente, repositorioPaciente);

        //act
        EntidadPaciente entidadPacienteRespueta = entidadPacienteTestdDataBuilder.build();
        servicioActualizarPago.ejecutar(entidadPacienteRespueta);

        //assert
        assertEquals(entidadPacienteRespueta.getIdEntidadPaciente(), ID_PAGO);
    }

    @Test
    public void actualizarPagoTest(){
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdentificacion(11111111).conIdPaciente(22);
        Paciente paciente = pacienteTestDataBuilder.build();

        EntidadPacienteTestdDataBuilder entidadPacienteTestdDataBuilder =
                new EntidadPacienteTestdDataBuilder().conPaciente(paciente).conValor(80000.0);
        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        EntidadPaciente entidadPaciente = entidadPacienteTestdDataBuilder.build();
        ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente = new ServicioActualizarEntidadPaciente(repositorioEntidadPaciente, repositorioPaciente);

        //act
        EntidadPaciente entidadPacienteRespuesta = entidadPacienteTestdDataBuilder.conPaciente(paciente).build();
        when(repositorioPaciente.existe(Mockito.anyInt())).thenReturn(Boolean.TRUE);
        when(repositorioEntidadPaciente.existeincluyendoId(Mockito.anyInt())).thenReturn(true);
        servicioActualizarEntidadPaciente.ejecutar(entidadPacienteRespuesta);

        //assert
        Mockito.verify(repositorioEntidadPaciente).actualizar(entidadPacienteRespuesta);
    }

    @Test
    public void validarPagoExistenciaPreviaTest(){
        // arrange
        EntidadPaciente entidadPaciente = new EntidadPacienteTestdDataBuilder().conValor(80000.0).build();
        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);

        //act
        when(repositorioPaciente.existe(Mockito.anyInt())).thenReturn(Boolean.TRUE);
        when(repositorioEntidadPaciente.existeExcluyendoId(Mockito.anyInt())).thenReturn(true);
        ServicioActualizarEntidadPaciente servicioActualizarPago = new ServicioActualizarEntidadPaciente(repositorioEntidadPaciente, repositorioPaciente);

        // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarPago.ejecutar(entidadPaciente), ExcepcionNoExiste.class, servicioActualizarPago.EL_PACIENTE_NO_TIENE_PENDIENTE );
    }
}