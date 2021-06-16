package com.ceiba.consultorio.modelo.entidad;

public class Paciente {

    private Integer idPaciente;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String email;

    public Paciente(Integer idPaciente, String nombres, String apellidos, String identificacion, String direccion, String telefono, String email) {
        this.idPaciente = idPaciente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
