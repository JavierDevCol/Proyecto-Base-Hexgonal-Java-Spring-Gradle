package com.persona.consulta;

import com.modelo.entidades.Persona;
import com.persona.RespuestaPersona;

import java.util.List;

public interface ProductorListarPersona {

    RespuestaPersona ejecutar(List<Persona> personaList);

}
