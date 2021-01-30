package com.persona.productorIml;

import com.modelo.entidades.Persona;
import com.persona.RespuestaPersona;
import com.persona.consulta.FabricaPersonaConsulta;
import com.persona.consulta.ProductorListarPersona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductorListaPersonaImpl implements ProductorListarPersona {

    @Autowired
    private FabricaPersonaConsulta fabricaPersonaConsulta;

    @Override
    public RespuestaPersona ejecutar(List<Persona> personaList) {
        List<ConsultaPersonaDto> consultaPersonaDtoList = fabricaPersonaConsulta.crearLista(personaList);
        return new RespuestaPersona(consultaPersonaDtoList);
    }
}
