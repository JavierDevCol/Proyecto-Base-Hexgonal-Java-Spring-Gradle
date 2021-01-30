package com.persona.consulta;

import com.modelo.entidades.Persona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;

import java.util.ArrayList;
import java.util.List;

public class FabricaPersonaConsulta {

    public Persona crear(ConsultaPersonaDto persona) {
        return new Persona(
                persona.getId(),
                persona.getNombre(),
                persona.getClave(),
                persona.getFechaCreacion()
        );
    }

    public ConsultaPersonaDto crear(Persona persona) {
        return new ConsultaPersonaDto(
                persona.getId(),
                persona.getNombre(),
                persona.getClave(),
                persona.getFechaCreacion()
        );
    }

    public List<ConsultaPersonaDto> crearLista(List<Persona> persona) {
        List<ConsultaPersonaDto> consultaPersonaDtos = new ArrayList<>();
        for (Persona persona1 : persona) {
            ConsultaPersonaDto cp  = new ConsultaPersonaDto(
                    persona1.getId(),
                    persona1.getNombre(),
                    persona1.getClave(),
                    persona1.getFechaCreacion()
            );
            consultaPersonaDtos.add(cp);
        }
        return consultaPersonaDtos;
    }

    public List<Persona> crearLIsta(List<ConsultaPersonaDto> persona) {
        List<Persona> consultaPersonaDtos = new ArrayList<>();
        for (ConsultaPersonaDto persona1 : persona) {
            Persona cp  = new Persona(
                    persona1.getId(),
                    persona1.getNombre(),
                    persona1.getClave(),
                    persona1.getFechaCreacion()
            );
            consultaPersonaDtos.add(cp);
        }
        return consultaPersonaDtos;
    }
}
