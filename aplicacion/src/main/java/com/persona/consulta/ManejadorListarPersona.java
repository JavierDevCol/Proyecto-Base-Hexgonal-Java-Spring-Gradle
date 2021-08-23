package com.persona.consulta;

import com.modelo.entidades.Persona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import com.puerto.repositorio.RepositorioConsultaPersona;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPersona {

    private final RepositorioConsultaPersona repositorioConsultaPersona;
    private final FabricaPersonaConsulta fabricaPersonaConsulta;

    public ManejadorListarPersona(RepositorioConsultaPersona repositorioConsultaPersona, FabricaPersonaConsulta fabricaPersonaConsulta) {
        this.repositorioConsultaPersona = repositorioConsultaPersona;
        this.fabricaPersonaConsulta = fabricaPersonaConsulta;
    }

    public List<ConsultaPersonaDto> ejecutar() {
        List<Persona> personaList = repositorioConsultaPersona.listar();
        return fabricaPersonaConsulta.crearLista(personaList);
    }
}
