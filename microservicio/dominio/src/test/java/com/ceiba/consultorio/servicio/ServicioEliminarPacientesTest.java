package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.consultorio.servicio.testdatabuilder.PagoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ServicioEliminarPacientesTest {

    private static final Long ID_PACIENTE =  99l;

    @Test
    public void eliminarPagoTest() throws Exception {
        // arrange
        PacienteTestDataBuilder PagoTestDataBuilder = new PacienteTestDataBuilder().conIdPaciente(99);

        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        ServicioCrearPaciente servicioCrearPaciente = new ServicioCrearPaciente(repositorioPaciente);
        ServicioEliminarPaciente servicioEliminarPaciente = new ServicioEliminarPaciente(repositorioPaciente);

        //act
        Paciente paciente = PagoTestDataBuilder.build();
        Mockito.when(repositorioPaciente.crear(paciente)).thenReturn(ID_PACIENTE);
        servicioCrearPaciente.ejecutar(paciente);
        servicioEliminarPaciente.ejecutar(paciente.getIdentificacion());

        //assert
        Long idPaciente = Long.parseLong(paciente.getIdPaciente().toString());
        assertEquals(idPaciente, ID_PACIENTE);
    }
}
