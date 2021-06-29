package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;

import static com.ceiba.dominio.ValidadorArgumento.*;

@Getter
@Setter
public class Paciente {

    private static final String MENSAJES_CAMPO_OBLIGATORIO_ID_PACIENTE = "Se debe ingresar el ID del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_NOMBRES = "Se debe ingresar el nombre del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_APELLIDOS = "Se debe ingresar el apellido del paciente";
    public static final String MENSAJES_CAMPO_OBLIGATORIO_DOC_IDENTIFICACION = "Se debe ingresar el documento de identificación del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_DIRECCION = "Se debe ingresar la dirección  del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_TELEFONO = "Se debe ingresar el telefono  del paciente";
    private static final String MENSAJES_CAMPO_OBLIGATORIO_EMAIL = "Se debe ingresar el email del paciente";
    private static final String MENSAJES_VALIDATOR_EMAIL = "Debe ingresar un email valido";
    private static final String VALIDATOR_REGEX = "(^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$)?";

    private static final int LONGITUD_MINIMA_IDENTIFICACION = 8;
    private static final int LONGITUD_MINIMA_NOMBRE = 4;
    private static final int LONGITUD_MINIMA_APELLIDOS = 4;
    private static final int LONGITUD_MINIMA_DIRECCION = 7;
    private static final int LONGITUD_MINIMA_TELEFONO = 7;

    public static final String MENSAJES_CAMPO_LONGITUD_IDENTIFICACION = "EL documento de identificación debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_NOMBRES = "EL nombre debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_APELLIDOS = "EL apellido debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_DIRECCION = "La direccion debe tener una longitud mayor o igual a %s";
    public static final String MENSAJES_CAMPO_LONGITUD_TELEFONO = "EL telefono debe tener una longitud mayor o igual a %s";

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

    public Paciente(Integer idPaciente, String nombres, String apellidos, Integer identificacion, String direccion, String telefono, String email) {

        validarObligatorio(nombres, MENSAJES_CAMPO_OBLIGATORIO_NOMBRES);
        validarObligatorio(apellidos, MENSAJES_CAMPO_OBLIGATORIO_APELLIDOS);
        validarObligatorio(identificacion, MENSAJES_CAMPO_OBLIGATORIO_DOC_IDENTIFICACION);
        validarObligatorio(direccion, MENSAJES_CAMPO_OBLIGATORIO_DIRECCION);
        validarObligatorio(telefono, MENSAJES_CAMPO_OBLIGATORIO_TELEFONO);
        validarObligatorio(email, MENSAJES_CAMPO_OBLIGATORIO_EMAIL);
        validarRegex(email, VALIDATOR_REGEX, MENSAJES_VALIDATOR_EMAIL);

        validarLongitud(identificacion.toString(), LONGITUD_MINIMA_IDENTIFICACION, String.format(MENSAJES_CAMPO_LONGITUD_IDENTIFICACION, LONGITUD_MINIMA_IDENTIFICACION));
        validarLongitud(nombres, LONGITUD_MINIMA_NOMBRE, String.format(MENSAJES_CAMPO_LONGITUD_NOMBRES, LONGITUD_MINIMA_NOMBRE));
        validarLongitud(apellidos, LONGITUD_MINIMA_APELLIDOS, String.format(MENSAJES_CAMPO_LONGITUD_APELLIDOS, LONGITUD_MINIMA_APELLIDOS));
        validarLongitud(direccion, LONGITUD_MINIMA_DIRECCION, String.format(MENSAJES_CAMPO_LONGITUD_DIRECCION, LONGITUD_MINIMA_DIRECCION));
        validarLongitud(telefono, LONGITUD_MINIMA_TELEFONO, String.format(MENSAJES_CAMPO_LONGITUD_TELEFONO, LONGITUD_MINIMA_TELEFONO));

        this.idPaciente = idPaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Paciente(Integer identificacion, String nombres, String apellidos, String direccion, String telefono, String email) {

        validarObligatorio(nombres, MENSAJES_CAMPO_OBLIGATORIO_NOMBRES);
        validarObligatorio(apellidos, MENSAJES_CAMPO_OBLIGATORIO_APELLIDOS);
        validarObligatorio(direccion, MENSAJES_CAMPO_OBLIGATORIO_DIRECCION);
        validarObligatorio(telefono, MENSAJES_CAMPO_OBLIGATORIO_TELEFONO);
        validarObligatorio(email, MENSAJES_CAMPO_OBLIGATORIO_EMAIL);
        validarRegex(email, VALIDATOR_REGEX, MENSAJES_VALIDATOR_EMAIL);

        validarLongitud(nombres, LONGITUD_MINIMA_NOMBRE, String.format(MENSAJES_CAMPO_LONGITUD_NOMBRES, LONGITUD_MINIMA_NOMBRE));
        validarLongitud(apellidos, LONGITUD_MINIMA_APELLIDOS, String.format(MENSAJES_CAMPO_LONGITUD_APELLIDOS, LONGITUD_MINIMA_APELLIDOS));
        validarLongitud(direccion, LONGITUD_MINIMA_DIRECCION, String.format(MENSAJES_CAMPO_LONGITUD_DIRECCION, LONGITUD_MINIMA_DIRECCION));
        validarLongitud(telefono, LONGITUD_MINIMA_TELEFONO, String.format(MENSAJES_CAMPO_LONGITUD_TELEFONO, LONGITUD_MINIMA_TELEFONO));

        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Paciente() {
    }
}
