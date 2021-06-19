package com.ceiba.consultorio.controlador;

import com.ceiba.consultorio.comando.ComandoEntidadPaciente;
import com.ceiba.consultorio.comando.manejador.ManejadorActualizarEntidadPaciente;
import com.ceiba.consultorio.excepcion.ComandoControladorExcepcion;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entidad_paciente")
@Api(tags = {"Controlador comando entidad_paciente"})
public class ComandoControladorEntidadPaciente {
    private final ManejadorActualizarEntidadPaciente manejadorActualizarEntidadPaciente;

    @Autowired
    public ComandoControladorEntidadPaciente(ManejadorActualizarEntidadPaciente manejadorActualizarEntidadPaciente) {
        this.manejadorActualizarEntidadPaciente = manejadorActualizarEntidadPaciente;
    }

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Pago")
    public boolean actualizar(@RequestBody ComandoEntidadPaciente comandoEntidadPaciente, @PathVariable Integer id) {
        Paciente p = new Paciente();
        p.setIdentificacion(id);
        comandoEntidadPaciente.setPaciente(p);
        manejadorActualizarEntidadPaciente.ejecutar(comandoEntidadPaciente);
        return true;
    }
}
