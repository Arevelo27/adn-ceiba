package com.ceiba.consultorio.comando.fabrica;

import com.ceiba.consultorio.comando.ComandoPaciente;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import org.springframework.stereotype.Component;

@Component
public class FabricaPaciente {
    public Paciente crear(ComandoPaciente comandoPaciente) {

        return new Paciente(comandoPaciente.getIdPaciente(), comandoPaciente.getNombres(),
                comandoPaciente.getApellidos(), comandoPaciente.getIdentificacion(),
                comandoPaciente.getDireccion(), comandoPaciente.getTelefono(),
                comandoPaciente.getEmail());
    }

    public Paciente actualizar(ComandoPaciente comandoPaciente) {

        return new Paciente(comandoPaciente.getIdentificacion(), comandoPaciente.getNombres(),
                comandoPaciente.getApellidos(), comandoPaciente.getDireccion(),
                comandoPaciente.getTelefono(), comandoPaciente.getEmail());
    }
}
