package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.comando.ComandoPago;

public class ComandoPagoTestDataBuilder {

    private Long idPago;
    private String documentoIdentificacionDeudor;
    private String codigoFactura;
    private double valorAdeudado;
    private double valorPagado;
    private String fechaVencimientoPago;
    private String fechaPago;

    public ComandoPagoTestDataBuilder() {
        this.idPago = 99999L;
        this.documentoIdentificacionDeudor = "123456789";
        this.codigoFactura = "FV-9898";
        this.valorAdeudado = 1000000;
        this.valorPagado = 0;
        this.fechaVencimientoPago = "2020-03-30";
        this.fechaPago = "2020-03-30";
    }

    public ComandoPagoTestDataBuilder conIdPago(Long id) {
        this.idPago = idPago;
        return this;
    }

    public ComandoPagoTestDataBuilder conCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
        return this;
    }

    public ComandoPagoTestDataBuilder conValorAdeudado(double valorAdeudado) {
        this.valorAdeudado = valorAdeudado;
        return this;
    }

    public ComandoPagoTestDataBuilder conValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
        return this;
    }

    public ComandoPagoTestDataBuilder conFechaVencimientoPago(String fechaVencimientoPago) {
        this.fechaVencimientoPago = fechaVencimientoPago;
        return this;
    }

    public ComandoPagoTestDataBuilder conFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
        return this;
    }

    public ComandoPagoTestDataBuilder conDocumentoIdentificacionDeudor(String documentoIdentificacionDeudor) {
        this.documentoIdentificacionDeudor = documentoIdentificacionDeudor;
        return this;
    }

    public ComandoPago build() {
        return new ComandoPago(this.idPago,this.documentoIdentificacionDeudor,
                this.codigoFactura,this.valorAdeudado,
                this.valorPagado,this.fechaVencimientoPago,
                this.fechaPago);
    }

}
