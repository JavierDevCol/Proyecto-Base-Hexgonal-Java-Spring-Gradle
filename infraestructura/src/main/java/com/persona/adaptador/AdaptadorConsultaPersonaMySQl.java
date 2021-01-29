package com.persona.adaptador;

import com.modelo.entidades.Persona;
import com.persona.dao.PersonaDao;
import com.puerto.repositorio.RepositorioConsultaPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdaptadorConsultaPersonaMySQl implements RepositorioConsultaPersona {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> listar() {
        return null;
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
