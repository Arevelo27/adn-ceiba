package com.ceiba.configuracion;

import com.ceiba.consultorio.puerto.repositorio.RepositorioEntidadPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPaciente;
import com.ceiba.consultorio.puerto.repositorio.RepositorioPago;
import com.ceiba.consultorio.servicio.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {
    @Bean
    public ServicioCrearPago servicioCrearPago(RepositorioPago repositorioPago) {
        return new ServicioCrearPago(repositorioPago);
    }

    @Bean
    public ServicioEliminarPago servicioEliminarPago(RepositorioPago repositorioPago) {
        return new ServicioEliminarPago(repositorioPago);
    }

    @Bean
    public ServicioActualizarPago servicioActualizarPago(RepositorioPago repositorioPago) {
        return new ServicioActualizarPago(repositorioPago);
    }

    @Bean
    public ServicioActualizarEntidadPaciente servicioActualizarEntidadPaciente(RepositorioEntidadPaciente repositorioEntidadPaciente, RepositorioPaciente repositorioPaciente) {
        return new ServicioActualizarEntidadPaciente(repositorioEntidadPaciente, repositorioPaciente);
    }

    @Bean
    public ServicioCrearPaciente servicioCrearPaciente(RepositorioPaciente repositorioPaciente) {
        return new ServicioCrearPaciente(repositorioPaciente);
    }

    @Bean
    public ServicioEliminarPaciente servicioEliminarPaciente(RepositorioPaciente repositorioPaciente) {
        return new ServicioEliminarPaciente(repositorioPaciente);
    }

    @Bean
    public ServicioActualizarPaciente servicioActualizarPaciente(RepositorioPaciente repositorioPaciente) {
        return new ServicioActualizarPaciente(repositorioPaciente);
    }

    
    
}
