package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.consultorio.modelo.dto.DtoPago;
import com.ceiba.consultorio.puerto.dao.DaoPago;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoPagoMysql implements DaoPago {
    private static final String CAMPO_IDENTIFICACION = "documentoIdentificacionDeudor";
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "pago", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "pago", value="listarPorCedula")
    private static String sqlListarPorCedula;

    public DaoPagoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoPago> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoPago());
    }

    @Override
    public List<DtoPago> listarPorCedula(String documentoIdentificacionDeudor) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENTIFICACION, documentoIdentificacionDeudor);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorCedula,paramSource, new MapeoPago());
    }
}
