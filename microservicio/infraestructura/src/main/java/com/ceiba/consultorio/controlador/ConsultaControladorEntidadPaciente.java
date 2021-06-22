package com.ceiba.consultorio.controlador;

import com.ceiba.consultorio.consulta.ManejadorListarEntidadPaciente;
import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.consultorio.modelo.dto.DtoPago;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidad_paciente")
@Api(tags = { "Controlador comando Entida Paciente"})
public class ConsultaControladorEntidadPaciente {

    private final ManejadorListarEntidadPaciente manejadorListarEntidadPaciente;

    public ConsultaControladorEntidadPaciente(ManejadorListarEntidadPaciente manejadorListarEntidadPaciente) {
        this.manejadorListarEntidadPaciente = manejadorListarEntidadPaciente;
    }

    @GetMapping
    @ApiOperation("Listar Entidad Pacientes")
    public List<DtoEntidadPaciente> listar() {
        return this.manejadorListarEntidadPaciente.ejecutar();
    }

    @GetMapping("/{identificacion}")
    @ApiOperation("Listar Entidad Pacientes Por Identificacion")
    public List<DtoEntidadPaciente> listarPorCedula(@PathVariable("identificacion") String identificacion) {
        return this.manejadorListarEntidadPaciente.ejecutar(identificacion);
    }
}
