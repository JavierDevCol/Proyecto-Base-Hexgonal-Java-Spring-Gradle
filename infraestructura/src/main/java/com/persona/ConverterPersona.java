package com.persona;

import com.modelo.entidades.Persona;

public interface ConverterPersona {

    PersonaEntity personaToPersonaEntity(Persona persona);

    Persona personaEntityToPersona(PersonaEntity personaEntity);
}
