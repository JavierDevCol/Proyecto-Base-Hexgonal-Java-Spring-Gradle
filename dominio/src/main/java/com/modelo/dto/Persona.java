package com.modelo.dto;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Persona {

    private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;
}
