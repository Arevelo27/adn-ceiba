package com.ceiba.consultorio.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.consultorio.comando.ComandoPaciente;
import com.ceiba.consultorio.comando.manejador.ManejadorActualizarPaciente;
import com.ceiba.consultorio.comando.manejador.ManejadorCrearPaciente;
import com.ceiba.consultorio.comando.manejador.ManejadorEliminarPaciente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
@Api(tags = {"Controlador comando Paciente"})
public class ComandoControladorPaciente {
    private final ManejadorCrearPaciente manejadorCrearPaciente;
    private final ManejadorEliminarPaciente manejadorEliminarPaciente;
    private final ManejadorActualizarPaciente manejadorActualizarPaciente;

    @Autowired
    public ComandoControladorPaciente(ManejadorCrearPaciente manejadorCrearPaciente,
                                      ManejadorEliminarPaciente manejadorEliminarPaciente,
                                      ManejadorActualizarPaciente manejadorActualizarPaciente) {
        this.manejadorCrearPaciente = manejadorCrearPaciente;
        this.manejadorEliminarPaciente = manejadorEliminarPaciente;
        this.manejadorActualizarPaciente = manejadorActualizarPaciente;
    }

    @PostMapping
    @ApiOperation("Crear Paciente")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoPaciente comandoPaciente) {
        return manejadorCrearPaciente.ejecutar(comandoPaciente);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation("Eliminar Paciente")
    public void eliminar(@PathVariable Integer id) {
        manejadorEliminarPaciente.ejecutar(id);
    }

    @PutMapping(value = "/{id}")
    @ApiOperation("Actualizar Paciente")
    public boolean actualizar(@RequestBody ComandoPaciente comandoPaciente, @PathVariable Integer id) {
        comandoPaciente.setIdentificacion(id);
        manejadorActualizarPaciente.ejecutar(comandoPaciente);
        return true;
    }
}
