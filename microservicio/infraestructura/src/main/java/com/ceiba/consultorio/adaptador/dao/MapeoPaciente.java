package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.consultorio.modelo.dto.DtoPaciente;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoPaciente implements RowMapper<DtoPaciente>, MapperResult {

    @Override
    public DtoPaciente mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Integer idPaciente = resultSet.getInt("id_paciente");
        String nombres = resultSet.getString("nombres");
        String apellidos = resultSet.getString("apellidos");
        Integer identificacion = resultSet.getInt("identificacion");
        String direccion = resultSet.getString("direccion");
        String telefono = resultSet.getString("telefono");
        String email = resultSet.getString("email");

        return new DtoPaciente(idPaciente, nombres, apellidos, identificacion, direccion, telefono, email);
    }

}
