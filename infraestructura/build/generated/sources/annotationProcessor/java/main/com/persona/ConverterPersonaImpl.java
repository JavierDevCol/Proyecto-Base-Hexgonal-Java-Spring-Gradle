package com.persona;

import com.modelo.entidades.Persona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-29T22:11:38-0500",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.3.jar, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class ConverterPersonaImpl implements ConverterPersona {

    @Override
    public Persona personaEntityToPErsona(PersonaEntity personaEntity) {
        if ( personaEntity == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String clave = null;
        LocalDateTime fechaCreacion = null;

        id = personaEntity.getId();
        nombre = personaEntity.getNombre();
        clave = personaEntity.getClave();
        fechaCreacion = personaEntity.getFechaCreacion();

        Persona persona = new Persona( id, nombre, clave, fechaCreacion );

        return persona;
    }

    @Override
    public List<Persona> personaEntityToPErsona(List<PersonaEntity> personaEntity) {
        if ( personaEntity == null ) {
            return null;
        }

        List<Persona> list = new ArrayList<Persona>( personaEntity.size() );
        for ( PersonaEntity personaEntity1 : personaEntity ) {
            list.add( personaEntityToPErsona( personaEntity1 ) );
        }

        return list;
    }

    @Override
    public PersonaEntity personaToPersonaEntity(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaEntity personaEntity = new PersonaEntity();

        personaEntity.setId( persona.getId() );
        personaEntity.setNombre( persona.getNombre() );
        personaEntity.setClave( persona.getClave() );
        personaEntity.setFechaCreacion( persona.getFechaCreacion() );

        return personaEntity;
    }

    @Override
    public ConsultaPersonaDto personaEntityToPersonaDto(PersonaEntity personaEntity) {
        if ( personaEntity == null ) {
            return null;
        }

        ConsultaPersonaDto consultaPersonaDto = new ConsultaPersonaDto();

        consultaPersonaDto.setId( personaEntity.getId() );
        consultaPersonaDto.setNombre( personaEntity.getNombre() );
        consultaPersonaDto.setClave( personaEntity.getClave() );
        consultaPersonaDto.setFechaCreacion( personaEntity.getFechaCreacion() );

        return consultaPersonaDto;
    }

    @Override
    public List<ConsultaPersonaDto> personaEntityToPersonaDto(List<PersonaEntity> personaEntity) {
        if ( personaEntity == null ) {
            return null;
        }

        List<ConsultaPersonaDto> list = new ArrayList<ConsultaPersonaDto>( personaEntity.size() );
        for ( PersonaEntity personaEntity1 : personaEntity ) {
            list.add( personaEntityToPersonaDto( personaEntity1 ) );
        }

        return list;
    }

    @Override
    public PersonaEntity personaDtoToPerosnaEntity(ConsultaPersonaDto consultaPersonaDto) {
        if ( consultaPersonaDto == null ) {
            return null;
        }

        PersonaEntity personaEntity = new PersonaEntity();

        personaEntity.setId( consultaPersonaDto.getId() );
        personaEntity.setNombre( consultaPersonaDto.getNombre() );
        personaEntity.setClave( consultaPersonaDto.getClave() );
        personaEntity.setFechaCreacion( consultaPersonaDto.getFechaCreacion() );

        return personaEntity;
    }
}
