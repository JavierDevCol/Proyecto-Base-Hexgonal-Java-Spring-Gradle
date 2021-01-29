package com.persona.comando.manejador;

import com.modelo.entidades.Persona;
import com.persona.comando.ComandoPersona;
import com.persona.comando.FabricaPersona;
import com.servicio.persona.ServicioCrearPersona;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPersona {

    private final ServicioCrearPersona servicioCrearPersona;
    private final FabricaPersona fabricaPersona;

    public ManejadorCrearPersona(ServicioCrearPersona servicioCrearPersona, FabricaPersona fabricaPersona) {
        this.servicioCrearPersona = servicioCrearPersona;
        this.fabricaPersona = fabricaPersona;
    }

    public Long ejecutar(ComandoPersona comandoPersona) {
        Persona persona = fabricaPersona.crear(comandoPersona);
        return servicioCrearPersona.ejecutar(persona);
    }
}
