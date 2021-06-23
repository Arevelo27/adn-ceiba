package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MapeoEntidadPaciente implements RowMapper<DtoEntidadPaciente>, MapperResult {

    @Override
    public DtoEntidadPaciente mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long idEntidadPaciente = resultSet.getLong("id_entidad_paciente");
        String paciente = resultSet.getString("NOMBRES").concat(" " + resultSet.getString("APELLIDOS")) ;
        String entidad = resultSet.getString("EPS");
        Double valor = resultSet.getDouble("valor");
        LocalDateTime fechaVinculacion = resultSet.getTimestamp("fecha_viculacion").toLocalDateTime();
        LocalDateTime fechaPago = resultSet.getTimestamp("fecha_Pago").toLocalDateTime();
        String activo = resultSet.getInt("activo") == 1 ? "SI":"NO";



        return new DtoEntidadPaciente(idEntidadPaciente,paciente,
                entidad,valor,fechaVinculacion,fechaPago, activo);
    }

}
