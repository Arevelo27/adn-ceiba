package com.ceiba.consultorio.servicio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.dominio.excepcion.ExcepcionNoExiste;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;

public class ServicioActualizarEntidadPaciente {

    public static final String EL_PACIENTE_NO_EXISTE = "El Paciente no existe";
    public static final String EL_PACIENTE_NO_TIENE_PENDIENTE = "El Paciente no tiene pendientes";
    public static final String EL_VALOR_A_PAGAR = "El valor a pagar es inferior al valor del sistema, debe cancelar el valor de $80000.00";
    private static final int DIA_LIMITE = 5;
    private static final double VALOR_PAGO = 80000.00;
    private final RepositorioEntidadPaciente repositorioEntidadPaciente;
    private final RepositorioPaciente repositorioPaciente;

    public ServicioActualizarEntidadPaciente(RepositorioEntidadPaciente repositorioEntidadPaciente, RepositorioPaciente repositorioPaciente) {
        this.repositorioEntidadPaciente = repositorioEntidadPaciente;
        this.repositorioPaciente = repositorioPaciente;
    }

    public void ejecutar(EntidadPaciente pago) {
        validarExistenciaPreviaPaciente(pago);
        pago = validarIdPaciente(pago);
        validarExistenciaPreviaPago(pago);
        validarValorPago(pago);
        pago = validarFechaPago(pago);
        this.repositorioEntidadPaciente.actualizar(pago);
    }

    public boolean validarExistenciaPreviaPaciente(EntidadPaciente pago) {
        boolean existe = this.repositorioPaciente.existe(pago.getPaciente().getIdentificacion());
        if (!existe) {
            throw new ExcepcionNoExiste(EL_PACIENTE_NO_EXISTE);
        }
        return true;
    }

    public EntidadPaciente validarIdPaciente(EntidadPaciente pago) {
        Integer id = this.repositorioPaciente.existePorCedula(pago.getPaciente().getIdentificacion());
        if (id == null) {
            throw new ExcepcionDuplicidad(EL_PACIENTE_NO_EXISTE);
        } else {
            Paciente p = pago.getPaciente();
            p.setIdPaciente(id);
            pago.setPaciente(p);
        }
        return pago;
    }

    public boolean validarExistenciaPreviaPago(EntidadPaciente pago) {
        boolean existe = this.repositorioEntidadPaciente.existeincluyendoId(pago.getPaciente().getIdPaciente());
        if (!existe) {
            throw new ExcepcionNoExiste(EL_PACIENTE_NO_TIENE_PENDIENTE);
        }
        return true;
    }

    public void validarValorPago(EntidadPaciente pago) {
        if (Double.compare(pago.getValor(), VALOR_PAGO) != 0) {
            throw new ExcepcionValorInvalido(EL_VALOR_A_PAGAR);
        }
    }

    public EntidadPaciente validarFechaPago(EntidadPaciente pago) {
        int dia = pago.getFechaPago().getDayOfMonth();
        if (dia > DIA_LIMITE) {
            pago.setValor(pago.getValor() + VALOR_PAGO * 0.1);
        }
        return pago;
    }
}
