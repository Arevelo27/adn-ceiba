package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.consultorio.puerto.dao.DaoEntidadPaciente;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoEntidadPacienteMysql implements DaoEntidadPaciente {
    private static final String CAMPO_IDENTIFICACION = "docIdentificacionPaciente";
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace= "entidad_paciente", value="listarPorCedula")
    private static String sqlListarPorCedula;

    public DaoEntidadPacienteMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoEntidadPaciente> listarPorCedula(String docIdentificacionPaciente) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue(CAMPO_IDENTIFICACION, docIdentificacionPaciente);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListarPorCedula,paramSource, new MapeoEntidadPaciente());
    }
}
