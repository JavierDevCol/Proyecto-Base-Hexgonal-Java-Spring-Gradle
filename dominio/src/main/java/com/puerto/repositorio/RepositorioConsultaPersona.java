package com.puerto.repositorio;

import com.modelo.entidades.Persona;

import java.util.List;

public interface RepositorioConsultaPersona {

    List<Persona> listar();

    Persona buscarPorId(Long id);

    Persona buscarNombre(String nombre);

    boolean existePorNombre(String nombre);
}
