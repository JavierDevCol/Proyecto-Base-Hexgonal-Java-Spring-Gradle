package com.persona;

import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespuestaPersona {
    private List<ConsultaPersonaDto> consultaPersonaDtos;
}
