package com.persona;

import com.modelo.entidades.Persona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConverterPersona {

    PersonaEntity personaToPersonaEntity(Persona persona);

    Persona personaEntityToPersona(PersonaEntity personaEntity);
}
