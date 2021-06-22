package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;

public class ServicioEliminarPago {

    private final RepositorioPago repositorioPago;

    public ServicioEliminarPago(RepositorioPago repositorioPago) {
        this.repositorioPago = repositorioPago;
    }

    public void ejecutar(Long id) {
        this.repositorioPago.eliminar(id);
    }
}
