package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;


public class ServicioCrearPaciente {

    public static final String EL_PACIENTE_YA_EXISTE_EN_EL_SISTEMA = "El paciente ya existe en el sistema";

    private final RepositorioPaciente repositorioPaciente;

    public ServicioCrearPaciente(RepositorioPaciente repositorioPaciente) {
        this.repositorioPaciente = repositorioPaciente;
    }

    public Long ejecutar(Paciente paciente) {
        validarExistenciaPrevia(paciente);
        return this.repositorioPaciente.crear(paciente);
    }

    private void validarExistenciaPrevia(Paciente pago) {
        boolean existe = this.repositorioPaciente.existe(pago.getIdentificacion());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_PACIENTE_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
