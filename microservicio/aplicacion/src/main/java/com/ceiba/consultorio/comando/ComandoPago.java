package com.ceiba.consultorio.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPago {

    private Long idPago;
    private String documentoIdentificacionDeudor;
    private String codigoFactura;
    private String tipoExamen;
    private double valorAdeudado;
    private double valorPagado;
    private String fechaVencimientoPago;
    private String fechaPago;

    @Override
    public String toString() {
        return "ComandoPago{" +
                "idPago=" + idPago +
                ", documentoIdentificacionDeudor='" + documentoIdentificacionDeudor + '\'' +
                ", codigoFactura='" + codigoFactura + '\'' +
                ", tipoExamen='" + tipoExamen + '\'' +
                ", valorAdeudado=" + valorAdeudado +
                ", valorPagado=" + valorPagado +
                ", fechaVencimientoPago='" + fechaVencimientoPago + '\'' +
                ", fechaPago='" + fechaPago + '\'' +
                '}';
    }
}
