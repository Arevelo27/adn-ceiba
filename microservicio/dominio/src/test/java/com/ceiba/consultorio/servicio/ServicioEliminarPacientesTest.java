package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.servicio.testdatabuilder.PacienteTestDataBuilder;
import com.ceiba.core.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ServicioEliminarPacientesTest {

    private static final Long ID_PACIENTE =  99l;

    @Test
    public void eliminarPacienteTest() throws Exception {
        // arrange
        PacienteTestDataBuilder PagoTestDataBuilder = new PacienteTestDataBuilder().conIdPaciente(99);

        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        ServicioCrearPaciente servicioCrearPaciente = new ServicioCrearPaciente(repositorioPaciente);
        ServicioEliminarPaciente servicioEliminarPaciente = new ServicioEliminarPaciente(repositorioPaciente, repositorioEntidadPaciente);

        //act
        Paciente paciente = PagoTestDataBuilder.build();
        Mockito.when(repositorioPaciente.crear(paciente)).thenReturn(ID_PACIENTE);
        servicioCrearPaciente.ejecutar(paciente);
        servicioEliminarPaciente.ejecutar(paciente.getIdentificacion());

        //assert
        Long idPaciente = Long.parseLong(paciente.getIdPaciente().toString());
        assertEquals(idPaciente, ID_PACIENTE);
    }

    @Test
    public  void validarExistenciaPreviaEntidadPacienteTest(){
        // arrange
        PacienteTestDataBuilder pacienteTestDataBuilder = new PacienteTestDataBuilder().conIdPaciente(22);

        RepositorioPaciente repositorioPaciente = Mockito.mock(RepositorioPaciente.class);
        RepositorioEntidadPaciente repositorioEntidadPaciente = Mockito.mock(RepositorioEntidadPaciente.class);
        ServicioCrearPaciente servicioCrearPaciente = new ServicioCrearPaciente(repositorioPaciente);
        ServicioEliminarPaciente servicioEliminarPaciente = new ServicioEliminarPaciente(repositorioPaciente, repositorioEntidadPaciente);

        //act
        Paciente paciente = pacienteTestDataBuilder.build();
        Mockito.when(repositorioPaciente.crear(paciente)).thenReturn(22L);
        servicioCrearPaciente.ejecutar(paciente);
        Mockito.when(repositorioEntidadPaciente.existeIncluyendoIdPaciente(paciente.getIdPaciente())).thenReturn(true);
        //servicioEliminarPaciente.ejecutar(paciente.getIdentificacion());

        //assert
        BasePrueba.assertThrows(() -> servicioEliminarPaciente.ejecutar(paciente.getIdPaciente()), ExcepcionValorObligatorio.class, servicioEliminarPaciente.EL_PACIENTE_EXISTE);
    }
}
