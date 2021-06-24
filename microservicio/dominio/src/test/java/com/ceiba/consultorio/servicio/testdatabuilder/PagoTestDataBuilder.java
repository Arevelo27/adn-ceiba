package com.ceiba.consultorio.servicio.testdatabuilder;

import com.ceiba.consultorio.modelo.entidad.Pago;

public class PagoTestDataBuilder {

    private Long idPago;
    private String documentoIdentificacionDeudor;
    private String codigoFactura;
    private String tipoExamen;
    private String valorAdeudado;
    private String valorPagado;
    private String fechaVencimientoPago;
    private String fechaPago;

    public PagoTestDataBuilder() {
        this.idPago = 99999L;
        this.documentoIdentificacionDeudor = "123456789";
        this.codigoFactura = "FV-9898";
        this.tipoExamen = "Cardiología";
        this.valorAdeudado = "1000000";
        this.valorPagado = "";
        this.fechaVencimientoPago = "2020-03-30";
        this.fechaPago = "2020-03-30";
    }

    public PagoTestDataBuilder conIdPago(Long id) {
        this.idPago = idPago;
        return this;
    }

    public PagoTestDataBuilder conCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
        return this;
    }

    public PagoTestDataBuilder conValorAdeudado(String valorAdeudado) {
        this.valorAdeudado = valorAdeudado;
        return this;
    }

    public PagoTestDataBuilder conValorPagado(String valorPagado) {
        this.valorPagado = valorPagado;
        return this;
    }

    public PagoTestDataBuilder conFechaVencimientoPago(String fechaVencimientoPago) {
        this.fechaVencimientoPago = fechaVencimientoPago;
        return this;
    }

    public PagoTestDataBuilder conFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
        return this;
    }

    public PagoTestDataBuilder conDocumentoIdentificacionDeudor(String documentoIdentificacionDeudor) {
        this.documentoIdentificacionDeudor = documentoIdentificacionDeudor;
        return this;
    }

    public Pago build()
    {
        return new Pago(this.idPago,this.documentoIdentificacionDeudor,
                        this.codigoFactura,this.tipoExamen,this.valorAdeudado,
                        this.valorPagado,this.fechaVencimientoPago,
                        this.fechaPago);
    }
}
