package com.ceiba.consultorio.controlador;

import com.ceiba.consultorio.consulta.ManejadorListarPaciente;
import com.ceiba.consultorio.modelo.dto.DtoPaciente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
@Api(tags={"Controlador consulta pacientes"})
public class ConsultaControladorPaciente {

    private final ManejadorListarPaciente manejadorListarPaciente;

    public ConsultaControladorPaciente(ManejadorListarPaciente manejadorListarPaciente) {
        this.manejadorListarPaciente = manejadorListarPaciente;
    }

    @GetMapping
    @ApiOperation("Listar Pacientes")
    public List<DtoPaciente> listar() {
        return this.manejadorListarPaciente.ejecutar();
    }

    @GetMapping("/{identificacion}")
    @ApiOperation("Listar Pacientes por identificacion")
    public DtoPaciente listarPorCedula(@PathVariable("identificacion") String identificacion) {
        return this.manejadorListarPaciente.ejecutar(identificacion);
    }
}
