package com.ceiba.consultorio.controlador;

import com.ceiba.consultorio.consulta.ManejadorListarPagos;
import com.ceiba.consultorio.modelo.dto.DtoPago;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
@Api(tags={"Controlador consulta pagos"})
public class ConsultaControladorPago {

    private final ManejadorListarPagos manejadorListarPagos;

    public ConsultaControladorPago(ManejadorListarPagos manejadorListarPagos) {
        this.manejadorListarPagos = manejadorListarPagos;
    }

    @GetMapping
    @ApiOperation("Listar Pagos")
    public List<DtoPago> listar() {
        return this.manejadorListarPagos.ejecutar();
    }

    @GetMapping("/id")
    @ApiOperation("Listar Pagos identificacion")
    public List<DtoPago> listarPorCedula(@RequestParam("identificacion") String identificacion) {
        return this.manejadorListarPagos.ejecutar(identificacion);
    }
}
