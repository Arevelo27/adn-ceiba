package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.consultorio.modelo.dto.DtoPaciente;
import com.ceiba.consultorio.puerto.dao.DaoPaciente;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoPacienteMysql implements DaoPaciente {
    private static final String CAMPO_IDENTIFICACION = "docIdentificacion";
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "paciente", value="listar")
    private static String sqlListar;

    @SqlStatement(namespace= "paciente", value="listarPorCedula")
    private static String sqlListarPorCedula;

    public DaoPacienteMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoPaciente> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoPaciente());
    }

    @Override
    public List<DtoPaciente> listarPorCedula(String docIdentificacion) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENTIFICACION, docIdentificacion);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorCedula,paramSource, new MapeoPaciente());
    }
}
