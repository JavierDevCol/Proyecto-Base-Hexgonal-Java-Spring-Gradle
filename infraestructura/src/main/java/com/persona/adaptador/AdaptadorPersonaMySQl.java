package com.persona.adaptador;

import com.modelo.entidades.Persona;
import com.puerto.repositorio.RepositorioPersona;

import java.util.List;

public class AdaptadorPersonaMySQl implements RepositorioPersona {

    @Override
    public List<Persona> listar() {
        return null;
    }
}
