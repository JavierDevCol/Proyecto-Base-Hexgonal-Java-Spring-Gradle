package com.modelo.entidades;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Persona {

    private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;

    public Persona(Long id, String nombre, String clave, LocalDateTime fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.fechaCreacion = fechaCreacion;
    }
}
