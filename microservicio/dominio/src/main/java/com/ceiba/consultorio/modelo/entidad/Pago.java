package com.ceiba.consultorio.modelo.entidad;

import lombok.Getter;
import lombok.Setter;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
@Setter
public class Pago {

    public static final String SE_DEBE_INGRESAR_DOCUMENTO_IDENTIFICACION = "Se debe ingresar el documento de identificación";
    private static final String SE_DEBE_INGRESAR_CODIGO_FACTURA = "Se debe ingresar el codigo de la factura";
    private static final String SE_DEBE_INGRESAR_VALOR_ADEUDADO = "Se debe ingresar el codigo de la factura";
    private static final String SE_DEBE_INGRESAR_FECHA_VENCIMIENTO = "Se debe ingresar la fecha de vencimiento de pago";


    private Long idPago;
    private String documentoIdentificacionDeudor;
    private String codigoFactura;
    private String tipoExamen;
    private String valorAdeudado;
    private String valorPagado;
    private String fechaVencimientoPago;
    private String fechaPago;


    public Pago(Long idPago, String documentoIdentificacionDeudor, String codigoFactura, String tipoExamen, String valorAdeudado,
                String valorPagado, String fechaVencimientoPago, String fechaPago) {

        validarObligatorio(documentoIdentificacionDeudor, SE_DEBE_INGRESAR_DOCUMENTO_IDENTIFICACION);
        validarObligatorio(codigoFactura, SE_DEBE_INGRESAR_CODIGO_FACTURA);
        validarObligatorio(valorAdeudado, SE_DEBE_INGRESAR_VALOR_ADEUDADO);
        validarObligatorio(fechaVencimientoPago, SE_DEBE_INGRESAR_FECHA_VENCIMIENTO);

        this.idPago = idPago;
        this.documentoIdentificacionDeudor = documentoIdentificacionDeudor;
        this.codigoFactura = codigoFactura;
        this.tipoExamen = tipoExamen;
        this.valorAdeudado = valorAdeudado;
        this.valorPagado = valorPagado;
        this.fechaVencimientoPago = fechaVencimientoPago;
        this.fechaPago = fechaPago;
    }

}