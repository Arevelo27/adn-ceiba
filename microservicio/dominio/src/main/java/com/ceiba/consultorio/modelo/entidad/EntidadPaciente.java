package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class EntidadPaciente {

    public static final String MENSAJES_CAMPO_OBLIGATORIO_PACIENTE = "Se debe ingresar el paciente";
    public static final String MENSAJES_CAMPO_OBLIGATORIO_ENTIDAD = "Se debe ingresar la entidad de salud EPS";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_VALOR = "Se debe ingresar el codigo de la factura";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_FECHA_PAGO = "Se debe ingresar la fecha de pago";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_FECHA_VINCULACION = "Se debe ingresar la fecha de vinculación";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_ESTADO = "Se debe ingresar el estado del paciente";

    private Long idEntidadPaciente;
    private Paciente paciente;
    private Integer entidad;
    private Double valor;
    private LocalDateTime fechaVinculacion;
    private LocalDateTime fechaPago;
    private Integer activo;

    public EntidadPaciente(Long idEntidadPaciente, Paciente paciente, Integer entidad, Double valor, LocalDateTime fechaVinculacion, LocalDateTime fechaPago, Integer activo) {

        validarObligatorio(paciente, MENSAJES_CAMPO_OBLIGATORIO_PACIENTE);
        validarObligatorio(paciente, MENSAJES_CAMPO_OBLIGATORIO_ENTIDAD);
        validarObligatorio(valor, MENSAJES_CAMPO_OBLIGATORIO_VALOR);
        validarObligatorio(fechaPago, MENSAJES_CAMPO_OBLIGATORIO_FECHA_PAGO);
        validarObligatorio(fechaPago, MENSAJES_CAMPO_OBLIGATORIO_FECHA_VINCULACION);
        validarObligatorio(activo, MENSAJES_CAMPO_OBLIGATORIO_ESTADO);

        this.idEntidadPaciente = idEntidadPaciente;
        this.paciente = paciente;
        this.entidad = entidad;
        this.valor = valor;
        this.fechaVinculacion = fechaVinculacion;
        this.fechaPago = fechaPago;
        this.activo = activo;
    }

    public EntidadPaciente(Long idEntidadPaciente, Paciente paciente, Double valor, LocalDateTime fechaPago, Integer activo) {

        validarObligatorio(paciente, MENSAJES_CAMPO_OBLIGATORIO_PACIENTE);
        validarObligatorio(valor, MENSAJES_CAMPO_OBLIGATORIO_VALOR);
        validarObligatorio(fechaPago, MENSAJES_CAMPO_OBLIGATORIO_FECHA_PAGO);
        validarObligatorio(activo, MENSAJES_CAMPO_OBLIGATORIO_ESTADO);

        this.idEntidadPaciente = idEntidadPaciente;
        this.paciente = paciente;
        this.valor = valor;
        this.fechaPago = fechaPago;
        this.activo = activo;
    }

    public EntidadPaciente() {
    }
}
