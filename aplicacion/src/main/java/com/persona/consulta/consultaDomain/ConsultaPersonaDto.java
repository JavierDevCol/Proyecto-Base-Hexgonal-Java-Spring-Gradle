package com.persona.consulta.consultaDomain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaPersonaDto {
    private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;
}
