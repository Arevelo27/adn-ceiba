package com.ceiba.consultorio.adaptador.dao;

import com.ceiba.consultorio.modelo.dto.DtoEntidadPaciente;
import com.ceiba.consultorio.modelo.dto.DtoPaciente;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class MapeoEntidadPaciente implements RowMapper<DtoEntidadPaciente>, MapperResult {

    @Override
    public DtoEntidadPaciente mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long idEntidadPaciente = resultSet.getLong("ID_ENTIDAD_PACIENTE");

        Integer idPaciente = resultSet.getInt("ID_PACIENTE");
        String nombres = resultSet.getString("NOMBRES");
        String apellidos = resultSet.getString("APELLIDOS");
        Integer identificacion = resultSet.getInt("IDENTIFICACION");
        String direccion = resultSet.getString("DIRECCION");
        String telefono = resultSet.getString("TELEFONO");
        String email = resultSet.getString("EMAIL");
        DtoPaciente paciente = new DtoPaciente(idPaciente, nombres, apellidos, identificacion, direccion, telefono, email);

//        String paciente2 = resultSet.getString("NOMBRES").concat(" " + resultSet.getString("APELLIDOS"));
        Integer idEntidad = resultSet.getInt("ID_ENTIDAD");
        String nombreEntidad = resultSet.getString("EPS");

        Double valor = resultSet.getDouble("valor");
        LocalDateTime fechaVinculacion = resultSet.getTimestamp("fecha_viculacion").toLocalDateTime();
        LocalDateTime fechaPago = resultSet.getTimestamp("fecha_Pago").toLocalDateTime();
        Integer activo = resultSet.getInt("activo");


        return new DtoEntidadPaciente(idEntidadPaciente, paciente,
                nombreEntidad, valor, fechaVinculacion, fechaPago, activo);
    }

}
