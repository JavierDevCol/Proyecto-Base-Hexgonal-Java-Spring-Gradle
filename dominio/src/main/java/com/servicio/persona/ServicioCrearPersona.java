package com.servicio.persona;

import com.excepcion.ExcepcionValorInvalido;
import com.modelo.entidades.Persona;
import com.puerto.repositorio.RepositorioComandoPersona;
import com.puerto.repositorio.RepositorioConsultaPersona;

public class ServicioCrearPersona {

    private static final String PEROSNA_YA_EXISTE = "Esta persona ya existe.";

    private final RepositorioConsultaPersona repositorioConsultaPersona;
    private final RepositorioComandoPersona repositorioComandoPersona;

    public ServicioCrearPersona(RepositorioConsultaPersona repositorioConsultaPersona, RepositorioComandoPersona repositorioComandoPersona) {
        this.repositorioConsultaPersona = repositorioConsultaPersona;
        this.repositorioComandoPersona = repositorioComandoPersona;
    }

    public Long ejecutar(Persona persona) {
        validarSiExiste(persona.getNombre());
        return repositorioComandoPersona.crear(persona);
    }

    private void validarSiExiste(String nombre) {
        Boolean existe = repositorioConsultaPersona.existePorNombre(nombre);
        if (existe) {
            throw new ExcepcionValorInvalido(PEROSNA_YA_EXISTE);
        }
    }
}
