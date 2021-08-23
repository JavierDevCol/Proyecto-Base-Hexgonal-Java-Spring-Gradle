package com.persona.adaptador;

import com.modelo.entidades.Persona;
import com.persona.ConverterPersona;
import com.persona.PersonaEntity;
import com.persona.dao.PersonaDao;
import com.puerto.repositorio.RepositorioConsultaPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdaptadorConsultaPersonaMySQl implements RepositorioConsultaPersona {

    @Autowired
    private PersonaDao personaDao;

    @Autowired
    private ConverterPersona converterPersona;

    @Override
    public List<Persona> listar() {
        List<PersonaEntity> listPersonaEntity = personaDao.findAll();
        List<Persona> personaDtoList = converterPersona.personaEntityToPErsona(listPersonaEntity);
        return personaDtoList;
    }

    @Override
    public Persona buscarPorId(Long id) {
        return null;
    }

    @Override
    public Persona buscarNombre(String nombre) {
        return null;
    }

    @Override
    public boolean existePorNombre(String nombre) {
        return personaDao.existsByNombre(nombre);
    }
}
