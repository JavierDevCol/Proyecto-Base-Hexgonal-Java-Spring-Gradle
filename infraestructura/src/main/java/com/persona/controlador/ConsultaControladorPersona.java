package com.persona.controlador;


import com.persona.PersonaEntity;
import com.persona.RespuestaPersona;
import com.persona.consulta.ManejadorListarPersona;
import com.persona.consulta.consultaDomain.ConsultaPersonaDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaControladorPersona {

    private final ManejadorListarPersona manejadorLIstarPersona;

    public ConsultaControladorPersona(ManejadorListarPersona manejadorLIstarPersona) {
        this.manejadorLIstarPersona = manejadorLIstarPersona;
    }

    @GetMapping
    @ApiOperation("Permite listar todos las personas existentes")
    public RespuestaPersona list() {
        return manejadorLIstarPersona.ejecutar();
    }
}
