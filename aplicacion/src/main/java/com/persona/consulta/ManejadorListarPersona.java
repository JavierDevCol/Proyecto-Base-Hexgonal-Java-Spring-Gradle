package com.persona.consulta;

import com.modelo.entidades.Persona;
import com.persona.RespuestaPersona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import com.puerto.repositorio.RepositorioConsultaPersona;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarPersona {

    private final RepositorioConsultaPersona repositorioConsultaPersona;
    private final ProductorListarPersona productorListarPersona;

    public ManejadorListarPersona(RepositorioConsultaPersona repositorioConsultaPersona, ProductorListarPersona productorListarPersona) {
        this.repositorioConsultaPersona = repositorioConsultaPersona;
        this.productorListarPersona = productorListarPersona;
    }

    public RespuestaPersona ejecutar() {
        List<Persona> personaList = repositorioConsultaPersona.listar();
        return productorListarPersona.ejecutar(personaList);
    }
}
