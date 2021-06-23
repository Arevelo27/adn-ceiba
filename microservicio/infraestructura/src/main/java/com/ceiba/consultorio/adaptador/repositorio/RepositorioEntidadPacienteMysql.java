package com.ceiba.consultorio.adaptador.repositorio;

import com.ceiba.consultorio.modelo.entidad.EntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioEntidadPacienteMysql implements RepositorioEntidadPaciente {
    private static final String NAMESPACE = "entidad_paciente";
    private static final String ACTUALIZAR = "actualizar";
    private static final String EXISTE_INCLUYE_ID = "existeIncluyendoId";
    private static final String EXISTE_EXCLUYE_ID = "existeExcluyendoId";
    private static final String CAMPO_IDENT = "idPaciente";
    private static final String CAMPO_VALOR = "valor";
    private static final String CAMPO_FECHA_PAGO = "fechaPago";
    private static final String CAMPO_ACTIVO = "activo";

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= NAMESPACE, value=ACTUALIZAR)
    private static String sqlActualizar;

    @SqlStatement(namespace= NAMESPACE, value=EXISTE_INCLUYE_ID)
    private static String sqlExisteIncluyendoId;

    @SqlStatement(namespace= NAMESPACE, value=EXISTE_EXCLUYE_ID)
    private static String sqlExisteExcluyendoId;

    @SqlStatement(namespace= NAMESPACE, value=EXISTE_INCLUYE_ID)
    private static String sqlExisteId;

    public RepositorioEntidadPacienteMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public void actualizar(EntidadPaciente entidadPaciente) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_VALOR, entidadPaciente.getValor());
        paramSource.addValue(CAMPO_FECHA_PAGO, entidadPaciente.getFechaPago());
        paramSource.addValue(CAMPO_ACTIVO, entidadPaciente.getActivo());
        paramSource.addValue(CAMPO_IDENT, entidadPaciente.getPaciente().getIdPaciente());

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlActualizar, paramSource);
    }

    @Override
    public boolean existeincluyendoId(Integer idPaciente) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, idPaciente);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteIncluyendoId,paramSource, Boolean.class);
    }

    @Override
    public boolean existeExcluyendoId(Integer idPaciente) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, idPaciente);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteExcluyendoId,paramSource, Boolean.class);
    }
}
