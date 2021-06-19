package com.ceiba.consultorio.excepcion;

public class ComandoControladorExcepcion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ComandoControladorExcepcion(String message) {
        super(message);
    }
	
	public ComandoControladorExcepcion(String message, Exception e) {
		super(message,e);
	}
}
