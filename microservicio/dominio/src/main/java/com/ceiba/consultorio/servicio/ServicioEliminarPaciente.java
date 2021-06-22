package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;

public class ServicioEliminarPaciente {

    private final RepositorioPaciente repositorioPaciente;

    public ServicioEliminarPaciente(RepositorioPaciente repositorioPaciente) {
        this.repositorioPaciente = repositorioPaciente;
    }

    public void ejecutar(Integer id) {
        this.repositorioPaciente.eliminar(id);
    }
}
