package com.persona.adaptador;

import com.modelo.entidades.Persona;
import com.persona.ConverterPersona;
import com.persona.PersonaEntity;
import com.persona.dao.PersonaDao;
import com.puerto.repositorio.RepositorioPersona;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonaRepositorioImpl implements RepositorioPersona {

    private final PersonaDao personaDao;
    private final ConverterPersona converterPersona;

    public PersonaRepositorioImpl(PersonaDao personaDao, ConverterPersona converterPersona) {
        this.personaDao = personaDao;
        this.converterPersona = converterPersona;
    }

    @Override
    public List<Persona> listar() {
        List<PersonaEntity> list = (List<PersonaEntity>) personaDao.findAll();
        return list
                .stream()
                .map(
                p -> converterPersona.personaEntityToPersona(p)
        )
                .collect(Collectors.toList());
    }
}
