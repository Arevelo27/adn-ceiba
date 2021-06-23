package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.dominio.excepcion.ExcepcionNoExiste;


public class ServicioActualizarPaciente {

    public static final String EL_PACIENTE_NO_EXISTE_EN_EL_SISTEMA = "El paciente no se puede actualizar porque, no existe en el sistema";

    private final RepositorioPaciente repositorioPaciente;

    public ServicioActualizarPaciente(RepositorioPaciente repositorioPaciente) {
        this.repositorioPaciente = repositorioPaciente;
    }

    public void ejecutar(Paciente paciente) {
        validarExistenciaPrevia(paciente);
        this.repositorioPaciente.actualizar(paciente);
    }

    private void validarExistenciaPrevia(Paciente pago) {
        boolean existe = this.repositorioPaciente.existeincluyendoId(pago.getIdentificacion());
        if(!existe) {
            throw new ExcepcionNoExiste(EL_PACIENTE_NO_EXISTE_EN_EL_SISTEMA);
        }
    }
}
