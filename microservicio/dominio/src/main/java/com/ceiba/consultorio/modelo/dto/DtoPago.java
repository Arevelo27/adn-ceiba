package com.ceiba.consultorio.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoPago {
    private Long idPago;
    private String documentoIdentificacionDeudor;
    private String codigoFactura;
    private String tipoExamen;
    private String valorAdeudado;
    private String valorPagado;
    private String fechaVencimientoPago;
    private String fechaPago;

}
