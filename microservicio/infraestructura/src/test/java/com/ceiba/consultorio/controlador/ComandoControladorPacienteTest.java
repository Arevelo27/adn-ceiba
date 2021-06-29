package com.ceiba.consultorio.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.consultorio.comando.ComandoPaciente;
import com.ceiba.consultorio.servicio.testdatabuilder.ComandoPacienteTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationMock.class)
@WebMvcTest(ComandoControladorPaciente.class)
public class ComandoControladorPacienteTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    public void crear() throws Exception {
        // arrange
        ComandoPaciente paciente = new ComandoPacienteTestDataBuilder().build();

        // act - assert
        mocMvc.perform(post("/paciente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(paciente)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.valor", is(4)));

        // act - assert
        String response = mocMvc.perform(get("/paciente/{identificacion}", paciente.getIdentificacion())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombres", is(paciente.getNombres())))
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void actualizar() throws Exception {
        Integer id = 11111111;
        // arrange
        ComandoPaciente paciente = new ComandoPacienteTestDataBuilder().conIdentificacion(id).buildActualizar();

        // act - assert
        mocMvc.perform(put("/paciente/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(paciente)))
                .andExpect(status().isOk());

        // act - assert
        String response = mocMvc.perform(get("/paciente/{identificacion}", paciente.getIdentificacion())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.direccion", is(paciente.getDireccion())))
                .andReturn().getResponse().getContentAsString();
    }

    @Test
    public void eliminar() throws Exception {
        // arrange
        Integer id = 11111113;

        // act - assert
        mocMvc.perform(delete("/paciente/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        // act - assert
        String response = mocMvc.perform(get("/paciente/{id}", id)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
    }
}
