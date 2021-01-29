package com.persona.controlador;

import com.persona.comando.ComandoPersona;
import com.persona.comando.manejador.ManejadorCrearPersona;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/persona")
public class ComandoControladorPersona {

    private final ManejadorCrearPersona manejadorCrearPersona;

    public ComandoControladorPersona(ManejadorCrearPersona manejadorCrearPersona) {
        this.manejadorCrearPersona = manejadorCrearPersona;
    }

    @PostMapping
    @ApiOperation("End-point para crear persona")
    public Long crear(@RequestBody ComandoPersona comandoPersona) {
        return manejadorCrearPersona.ejecutar(comandoPersona);
    }
}
