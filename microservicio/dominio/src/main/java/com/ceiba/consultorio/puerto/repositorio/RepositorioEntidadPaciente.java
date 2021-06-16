package com.ceiba.consultorio.puerto.repositorio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;

public interface RepositorioEntidadPaciente {
    /**
     * Permite crear un Pago
     * @param pago
     * @return el id generado
     */
    Long crear(EntidadPaciente pago);

    /**
     * Permite actualizar un Pago
     * @param pago
     */
    void actualizar(EntidadPaciente pago);

    /**
     * Permite eliminar un Pago
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un Pago con un nombre
     * @param nombre
     * @return si existe o no
     */
    boolean existe(String nombre);

    /**
     * Permite validar si existe un Pago con un codigo de factura excluyendo un id
     * @param codigoFactura
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id,String codigoFactura);

    /**
     * Permite validar si existe un Pago con un nombre excluyendo un id
     * @param codigoFactura
     * @return si existe o no
     */
    boolean existeincluyendoId(Long id,String codigoFactura);

}
