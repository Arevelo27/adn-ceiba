package com.ceiba.consultorio.adaptador.repositorio;

import com.ceiba.consultorio.modelo.entidad.Paciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioPacienteMysql implements RepositorioPaciente {
    private static final String NAMESPACE = "paciente";
    private static final String CREAR = "crear";
    private static final String ACTUALIZAR = "actualizar";
    private static final String ELIMINAR = "eliminar";
    private static final String EXISTE = "existe";
    private static final String EXISTE_INCLUYE_ID = "existePorCedula";
    private static final String CAMPO_IDENT = "identificacion";
    private static final String CAMPO_NOMBRE = "nombres";
    private static final String CAMPO_APELLIDO = "apellidos";
    private static final String CAMPO_DIRECCION = "direccion";
    private static final String CAMPO_TELEFONO = "telefono";
    private static final String CAMPO_EMAIL = "email";

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= NAMESPACE, value=CREAR)
    private static String sqlCrear;

    @SqlStatement(namespace= NAMESPACE, value=ACTUALIZAR)
    private static String sqlActualizar;

    @SqlStatement(namespace= NAMESPACE, value=ELIMINAR)
    private static String sqlEliminar;

    @SqlStatement(namespace = NAMESPACE, value = EXISTE_INCLUYE_ID)
    private static String sqlExisteIncluyendoId;

    @SqlStatement(namespace= NAMESPACE, value=EXISTE)
    private static String sqlExiste;

    public RepositorioPacienteMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Paciente paciente) {
        return this.customNamedParameterJdbcTemplate.crear(paciente, sqlCrear);
    }

    @Override
    public void actualizar(Paciente paciente) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, paciente.getIdentificacion());
        paramSource.addValue(CAMPO_NOMBRE, paciente.getNombres());
        paramSource.addValue(CAMPO_APELLIDO, paciente.getApellidos());
        paramSource.addValue(CAMPO_DIRECCION, paciente.getDireccion());
        paramSource.addValue(CAMPO_TELEFONO, paciente.getTelefono());
        paramSource.addValue(CAMPO_EMAIL, paciente.getEmail());
        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlActualizar, paramSource);
    }

    @Override
    public void eliminar(Integer id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
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

    @Override
    public boolean existeincluyendoId(Integer identificacion) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENT, identificacion);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);
    }
}
