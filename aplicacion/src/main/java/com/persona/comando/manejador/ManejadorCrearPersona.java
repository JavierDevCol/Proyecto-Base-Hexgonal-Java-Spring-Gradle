package com.persona.comando.manejador;

import com.modelo.entidades.Persona;
import com.persona.comando.ComandoPersona;
import com.persona.comando.FabricaPersonaComando;
import com.servicio.persona.ServicioCrearPersona;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPersona {

    private final ServicioCrearPersona servicioCrearPersona;
    private final FabricaPersonaComando fabricaPersonaComando;

    public ManejadorCrearPersona(ServicioCrearPersona servicioCrearPersona, FabricaPersonaComando fabricaPersonaComando) {
        this.servicioCrearPersona = servicioCrearPersona;
        this.fabricaPersonaComando = fabricaPersonaComando;
    }

    public Long ejecutar(ComandoPersona comandoPersona) {
        Persona persona = fabricaPersonaComando.crear(comandoPersona);
        return servicioCrearPersona.ejecutar(persona);
    }
}
