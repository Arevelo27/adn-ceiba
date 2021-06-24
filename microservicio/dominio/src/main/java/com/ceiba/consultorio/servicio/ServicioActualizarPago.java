package com.ceiba.consultorio.servicio;

import com.ceiba.dominio.excepcion.ExcepcionNoExiste;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ServicioActualizarPago {

    public static final String EL_PAGO_NO_EXISTE_EN_EL_SISTEMA = "El pago no se puede actualizar porque, no existe en el sistema";
    private static final String FORMATO_FECHA = "yyyy-MM-dd";
    private static final int HORA_LIMITE = 17;
    private static final int DIA_LIMITE = 15;
    private final RepositorioPago repositorioPago;

    public ServicioActualizarPago(RepositorioPago repositorioPago) {
        this.repositorioPago = repositorioPago;
    }

    public void ejecutar(Pago pago) {
        validarExistenciaPrevia(pago);
        pago = validarFechaPago(pago);
        pago = validarHoraPago(pago);
        this.repositorioPago.actualizar(pago);
    }

    public void validarExistenciaPrevia(Pago pago) {
        boolean existe = this.repositorioPago.existeincluyendoId(pago.getIdPago(), pago.getCodigoFactura());

        if (!existe) {
            throw new ExcepcionNoExiste(EL_PAGO_NO_EXISTE_EN_EL_SISTEMA);
        }
    }

    public Pago validarFechaPago(Pago pago) {
        LocalDate fechaPago = LocalDate.parse(pago.getFechaPago());
        int dia = fechaPago.getDayOfMonth();

        if (dia > DIA_LIMITE) {
            double incremento = Double.parseDouble(pago.getValorAdeudado()) + (Double.parseDouble(pago.getValorAdeudado())) * 0.1;
            pago.setValorPagado(incremento + "");
        }

        return pago;
    }

    public Pago validarHoraPago(Pago pago) {
        LocalTime horaActual = LocalTime.now();
        int hora = horaActual.getHour();

        if (hora >= HORA_LIMITE) {
            LocalDate fechaPago = LocalDate.parse(pago.getFechaPago());
            fechaPago = fechaPago.plusDays(1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATO_FECHA);
            pago.setFechaPago(formatter.format(fechaPago));
        }

        return pago;
    }
}
