package com.ceiba.consultorio.adaptador.repositorio;

import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioPacienteMysql implements RepositorioPaciente {
    private static final String NAMESPACE = "paciente";
    private static final String EXISTE = "existe";
    private static final String EXISTE_INCLUYE_ID = "existePorCedula";
    private static final String CAMPO_IDENT = "identificacion";

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE_INCLUYE_ID)
    private static String sqlExisteIncluyendoId;

    @SqlStatement(namespace= NAMESPACE, value=EXISTE)
    private static String sqlExiste;

    public RepositorioPacienteMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Integer existePorCedula(Integer identificacion) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, identificacion);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteIncluyendoId, paramSource, Integer.class);
    }

    @Override
    public boolean existe(Integer identificacion) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, identificacion);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste, paramSource, Boolean.class);
    }
}
