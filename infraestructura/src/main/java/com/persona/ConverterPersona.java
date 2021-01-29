package com.persona;

import com.modelo.entidades.Persona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConverterPersona {

    Persona personaEntityToPErsona(PersonaEntity personaEntity);

    PersonaEntity personaToPersonaEntity(Persona persona);
}
