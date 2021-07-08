package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;

public class ServicioEliminarPaciente {

    public static final String EL_PACIENTE_EXISTE = "El Paciente esta relacionado con el pago de la entidad";
    private final RepositorioPaciente repositorioPaciente;
    private final RepositorioEntidadPaciente repositorioEntidadPaciente;

    public ServicioEliminarPaciente(RepositorioPaciente repositorioPaciente, RepositorioEntidadPaciente repositorioEntidadPaciente) {
        this.repositorioPaciente = repositorioPaciente;
        this.repositorioEntidadPaciente = repositorioEntidadPaciente;
    }

    public void ejecutar(Integer id) {
        validarExistenciaPreviaEntidadPaciente(id);
        this.repositorioPaciente.eliminar(id);
    }

    public boolean validarExistenciaPreviaEntidadPaciente(Integer idPaciente) {
        boolean existe = this.repositorioEntidadPaciente.existeIncluyendoIdPaciente(idPaciente);
        if (existe) {
            throw new ExcepcionValorObligatorio(EL_PACIENTE_EXISTE);
        }
        return true;
    }
}
