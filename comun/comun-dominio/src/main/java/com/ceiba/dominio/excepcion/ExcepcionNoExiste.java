package com.ceiba.dominio.excepcion;

public class ExcepcionNoExiste extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionNoExiste(String mensaje) {
        super(mensaje);
    }
}
