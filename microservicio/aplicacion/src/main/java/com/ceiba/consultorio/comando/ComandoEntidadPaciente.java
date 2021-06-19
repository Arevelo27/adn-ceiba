package com.ceiba.consultorio.comando;

import com.ceiba.consultorio.modelo.entidad.Entidad;
import com.ceiba.consultorio.modelo.entidad.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoEntidadPaciente {

    private Long idEntidadPaciente;
    private Paciente paciente;
    private Integer entidad;
    private Double valor;
    private LocalDateTime fechaVinculacion;
    private LocalDateTime fechaPago;
    private Integer activo;

    @Override
    public String toString() {
        return "ComandoEntidadPaciente{" +
                "idEntidadPaciente=" + idEntidadPaciente +
                ", paciente='" + paciente + '\'' +
                ", entidad='" + entidad + '\'' +
                ", valor=" + valor +
                ", fechaVinculacion='" + fechaVinculacion + '\'' +
                ", fechaPago='" + fechaPago + '\'' +
                ", activo='" + activo + '\'' +
                '}';
    }
}
