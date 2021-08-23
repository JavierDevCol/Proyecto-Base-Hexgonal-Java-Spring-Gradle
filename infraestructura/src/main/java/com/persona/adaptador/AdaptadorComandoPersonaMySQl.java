package com.persona.adaptador;

import com.modelo.entidades.Persona;
import com.persona.ConverterPersona;
import com.persona.PersonaEntity;
import com.persona.dao.PersonaDao;
import com.puerto.repositorio.RepositorioComandoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdaptadorComandoPersonaMySQl implements RepositorioComandoPersona {
    @Autowired
    private PersonaDao personaDao;

    @Autowired
    private ConverterPersona converterPersona;

    @Override
    public Long crear(Persona persona) {
        PersonaEntity personaEntity = converterPersona.personaToPersonaEntity(persona);
        Long id = personaDao.save(personaEntity).getId();
        return id;
    }

    @Override
    public void actualizar(Persona persona) {

    }

    @Override
    public void eliminar(Persona persona) {

    }
}
