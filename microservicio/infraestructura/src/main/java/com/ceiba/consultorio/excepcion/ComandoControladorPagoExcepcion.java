package com.ceiba.consultorio.excepcion;

public class ComandoControladorPagoExcepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ComandoControladorPagoExcepcion(String message) {
        super(message);
    }
	
	public ComandoControladorPagoExcepcion(String message, Exception e) {
		super(message,e);
	}
}
