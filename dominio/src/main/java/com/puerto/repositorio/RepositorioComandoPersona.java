package com.puerto.repositorio;

import com.modelo.entidades.Persona;

public interface RepositorioComandoPersona {

    Long crear(Persona persona);

    void actualizar(Persona persona);

    void eliminar(Persona persona);
}
