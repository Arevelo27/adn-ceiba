package com.ceiba.consultorio.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.consultorio.modelo.entidad.Pago;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioPagoMysql implements RepositorioPago {
    private static final String NAMESPACE = "pago";
    private static final String CREAR = "crear";
    private static final String ACTUALIZAR = "actualizar";
    private static final String ELIMINAR = "eliminar";
    private static final String EXISTE = "existe";
    private static final String EXISTE_EXCLUYE_ID = "existeExcluyendoId";
    private static final String EXISTE_INCLUYE_ID = "existeIncluyendoId";
    private static final String CAMPO_ID_PAGO = "idPago";
    private static final String CAMPO_CODIGO_FACTURA = "codigoFactura";

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = NAMESPACE, value = CREAR)
    private static String sqlCrear;

    @SqlStatement(namespace = NAMESPACE, value = ACTUALIZAR)
    private static String sqlActualizar;

    @SqlStatement(namespace = NAMESPACE, value = ELIMINAR)
    private static String sqlEliminar;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE)
    private static String sqlExiste;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE_EXCLUYE_ID)
    private static String sqlExisteExcluyendoId;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE_INCLUYE_ID)
    private static String sqlExisteIncluyendoId;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE_INCLUYE_ID)
    private static String sqlExisteId;

    public RepositorioPagoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Pago pago) {
        return this.customNamedParameterJdbcTemplate.crear(pago, sqlCrear);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_ID_PAGO, id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }

    @Override
    public boolean existe(String codigoFactura) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_CODIGO_FACTURA, codigoFactura);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste, paramSource, Boolean.class);
    }

    @Override
    public void actualizar(Pago pago) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_ID_PAGO, pago.getIdPago());
        paramSource.addValue("valorPagado", pago.getValorPagado());
        paramSource.addValue("valorAdeudado", pago.getValorAdeudado());
        paramSource.addValue("fechaPago", pago.getFechaPago());
        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlActualizar, paramSource);
    }

    @Override
    public boolean existeExcluyendoId(Long id, String codigoFactura) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_ID_PAGO, id);
        paramSource.addValue(CAMPO_CODIGO_FACTURA, codigoFactura);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteExcluyendoId, paramSource, Boolean.class);
    }

    @Override
    public boolean existeincluyendoId(Long id, String codigoFactura) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_ID_PAGO, id);
        paramSource.addValue(CAMPO_CODIGO_FACTURA, codigoFactura);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteIncluyendoId, paramSource, Boolean.class);
    }
}
