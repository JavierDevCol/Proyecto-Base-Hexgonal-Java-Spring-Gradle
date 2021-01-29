package com.persona.comando;

import com.modelo.entidades.Persona;
import org.springframework.stereotype.Component;

@Component
public class FabricaPersona {

    public Persona crear(ComandoPersona persona) {
        return new Persona(
                persona.getId(),
                persona.getNombre(),
                persona.getClave(),
                persona.getFechaCreacion()
        );
    }
}
