package com.persona.adaptador;

import com.modelo.dto.Persona;
import com.persona.Converter;
import com.persona.PersonaEntity;
import com.persona.dao.PersonaDao;
import com.puerto.repositorio.RepositorioPersona;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonaRepositorioImpl implements RepositorioPersona {

    private final PersonaDao personaDao;
    private final Converter converter;

    public PersonaRepositorioImpl(PersonaDao personaDao, Converter converter) {
        this.personaDao = personaDao;
        this.converter = converter;
    }

    @Override
    public List<Persona> listar() {
        List<PersonaEntity> list = (List<PersonaEntity>) personaDao.findAll();
        return list
                .stream()
                .map(
                p -> converter.personaEntityToPersona(p)
        )
                .collect(Collectors.toList());
    }
}
