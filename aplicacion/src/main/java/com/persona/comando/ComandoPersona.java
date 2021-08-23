package com.persona.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoPersona {
    private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;
}
