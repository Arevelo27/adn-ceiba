package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;
import static com.ceiba.dominio.ValidadorArgumento.validarRegex;

@Getter
@Setter
public class Paciente {

    private static final String MENSAJES_CAMPO_OBLIGATORIO_NOMBRES = "Se debe ingresar el nombre del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_APELLIDOS = "Se debe ingresar el apellido del paciente";
    public static final String MENSAJES_CAMPO_OBLIGATORIO_DOC_IDENTIFICACION = "Se debe ingresar el documento de identificación del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_DIRECCION = "Se debe ingresar la dirección  del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_TELEFONO = "Se debe ingresar el telefono  del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_EMAIL = "Se debe ingresar el email del paciente";
    private static final String MENSAJES_VALIDATOR_EMAIL = "Debe ingresar un email valido";

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

    public Paciente(Integer idPaciente, String nombres, String apellidos, Integer identificacion, String direccion, String telefono, String email) {

        validarObligatorio(nombres, MENSAJES_CAMPO_OBLIGATORIO_NOMBRES);
        validarObligatorio(nombres, MENSAJES_CAMPO_OBLIGATORIO_NOMBRES);
        validarObligatorio(apellidos, MENSAJES_CAMPO_OBLIGATORIO_APELLIDOS);
        validarObligatorio(identificacion, MENSAJES_CAMPO_OBLIGATORIO_DOC_IDENTIFICACION);
        validarObligatorio(direccion, MENSAJES_CAMPO_OBLIGATORIO_DIRECCION);
        validarObligatorio(telefono, MENSAJES_CAMPO_OBLIGATORIO_TELEFONO);
        validarObligatorio(email, MENSAJES_CAMPO_OBLIGATORIO_EMAIL);
        validarRegex(email, "(^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$)?", MENSAJES_VALIDATOR_EMAIL);

        this.idPaciente = idPaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Paciente() {
    }
}
