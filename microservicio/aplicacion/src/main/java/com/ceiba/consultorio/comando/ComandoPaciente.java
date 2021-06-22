package com.ceiba.consultorio.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPaciente {

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private Integer identificacion;
    private String direccion;
    private String telefono;
    private String email;

    @Override
    public String toString() {
        return "ComandoPaciente{" +
                "idPaciente=" + idPaciente +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion=" + identificacion +
                ", direccion=" + direccion +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public ComandoPaciente(Integer identificacion, String nombres, String apellidos, String direccion, String telefono, String email) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
