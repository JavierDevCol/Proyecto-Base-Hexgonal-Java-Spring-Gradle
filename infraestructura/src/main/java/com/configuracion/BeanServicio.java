package com.configuracion;

import com.puerto.repositorio.RepositorioComandoPersona;
import com.puerto.repositorio.RepositorioConsultaPersona;
import com.servicio.persona.ServicioCrearPersona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicio {

    @Bean
    public ServicioCrearPersona servicioCrearPersona(RepositorioConsultaPersona repositorioConsultaPersona,
                                                     RepositorioComandoPersona repositorioComandoPersona) {
        return new ServicioCrearPersona(repositorioConsultaPersona, repositorioComandoPersona);
    }
}
