package com.persona;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "persona")
public class PersonaEntity {

    @Id
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "clave")
    private String clave;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;


}
