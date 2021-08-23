package com.persona;

import com.modelo.entidades.Persona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConverterPersona {

    Persona personaEntityToPErsona(PersonaEntity personaEntity);

    List<Persona> personaEntityToPErsona(List<PersonaEntity> personaEntity);

    PersonaEntity personaToPersonaEntity(Persona persona);

    ConsultaPersonaDto personaEntityToPersonaDto(PersonaEntity personaEntity);

    List<ConsultaPersonaDto> personaEntityToPersonaDto(List<PersonaEntity> personaEntity);

    PersonaEntity personaDtoToPerosnaEntity(ConsultaPersonaDto consultaPersonaDto);
}
