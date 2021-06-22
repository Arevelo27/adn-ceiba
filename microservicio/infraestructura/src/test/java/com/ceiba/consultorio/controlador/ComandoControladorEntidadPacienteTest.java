package com.ceiba.consultorio.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.comando.ComandoPago;
import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.servicio.testdatabuilder.ComandoEntidadPacienteTestDataBuilder;
import com.ceiba.consultorio.servicio.testdatabuilder.ComandoPagoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationMock.class)
@WebMvcTest(ComandoControladorEntidadPaciente.class)
public class ComandoControladorEntidadPacienteTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    public void actualizar() throws Exception {
        // arrange
        ComandoEntidadPaciente entidadPaciente = new ComandoEntidadPacienteTestDataBuilder().build();

        // act - assert
        mocMvc.perform(put("/entidad_paciente/{id}", entidadPaciente.getPaciente().getIdentificacion())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(entidadPaciente)))
                .andExpect(status().isOk());
    }

}
