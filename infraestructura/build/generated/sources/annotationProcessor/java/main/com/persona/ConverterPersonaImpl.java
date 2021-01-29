package com.persona;

import com.modelo.entidades.Persona;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-28T21:38:43-0500",
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
}
