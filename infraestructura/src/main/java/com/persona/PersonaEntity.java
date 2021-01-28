package com.persona;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "persona")
public class PersonaEntity {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String clave;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
}
