package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import com.ceiba.core.BasePrueba;
import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.EntidadPacienteTestdDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;
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
        assertTrue(entidadPacienteRespuesta.getPaciente().getIdentificacion().equals(IDENTIFICACION));
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
        assertTrue(entidadPacienteRespuesta.getIdEntidadPaciente().equals(ID_PAGO));
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

        EntidadPacienteTestdDataBuilder pagoTestDataBuilder =
                new EntidadPacienteTestdDataBuilder().conFechaPago(localdatetime).conValor(80000.0);
        EntidadPaciente pago = pagoTestDataBuilder.build();

        RepositorioEntidadPaciente repositorioPago = Mockito.mock(RepositorioEntidadPaciente.class);
        when(repositorioPago.existeincluyendoId(Mockito.anyInt())).thenReturn(true);
        ServicioActualizarEntidadPaciente servicioActualizarPago = new ServicioActualizarEntidadPaciente(repositorioPago, null);

        EntidadPaciente pagoRespueta = servicioActualizarPago.validarFechaPago(pago);

        // act - assert
        assertEquals(VALOR_SIN_INCREMENTO,pagoRespueta.getValor(),0);
    }
}