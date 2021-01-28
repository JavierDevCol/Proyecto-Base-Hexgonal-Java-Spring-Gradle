package com.servicio.persona;

import com.modelo.entidades.Persona;
import com.puerto.repositorio.RepositorioPersona;

public class ServicioCrearPersona {

    private final RepositorioPersona repositorioPersona;

    public ServicioCrearPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    public void ejecutar(Persona persona) {

    }
}
