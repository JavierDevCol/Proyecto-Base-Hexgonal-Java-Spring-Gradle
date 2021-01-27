package com.persona;

import com.modelo.dto.Persona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface Converter {

    PersonaEntity personaToPersonaEntity(Persona persona);

    Persona personaEntityToPersona(PersonaEntity personaEntity);
}
