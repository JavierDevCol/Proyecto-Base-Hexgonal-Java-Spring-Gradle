package com.modelo.entidades;


import com.ValidadorArgumento;
import com.excepcion.ExcepcionValorInvalido;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
public class Persona {

    private static final String NOMBRE_ES_REQUERIDO = "EL nombre de la persona es obligatorio para ser creado.";
    private static final String CLAVE_ES_REQUERIDA =  "La clave de la persona es obligatorio para ser creado.";
    private static final String CLAVE_NUEVA_ES_REQUERIDA =  "Se requiere una clave nueva para ser actualizada";
    private static final String CLAVE_ACTUAL_NO_CORRECTA = "La clave actual no es la correcta.";
    private static final String MAXIMO_DE_CLAVE_SUPERADO = "Longitud maxima de la clave no debe superar los 10 caracteres.";
    private static final String MINIMO_DE_CLAVE_ADMITIDO = "Longitud minima de la clave es de 6 caracteres.";
    private static final Integer MINUMO_CLAVE = 6;
    private static final Integer MAXIMO_CLAVE = 10;

    private Long id;
    private String nombre;
    private String clave;
    private LocalDateTime fechaCreacion;

    public Persona(Long id, String nombre, String clave, LocalDateTime fechaCreacion) {
        ValidadorArgumento.validarObligatorio(nombre, NOMBRE_ES_REQUERIDO);
        ValidadorArgumento.validarObligatorio(clave, CLAVE_ES_REQUERIDA);
        ValidadorArgumento.validarLongitudMaxima(clave, MAXIMO_CLAVE, MAXIMO_DE_CLAVE_SUPERADO);
        ValidadorArgumento.validarLongitudMinima(clave, MINUMO_CLAVE, MINIMO_DE_CLAVE_ADMITIDO);

        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.fechaCreacion = fechaCreacion;
    }

    public void actualizarClave(String claveNueva, String claveActual) {
        ValidadorArgumento.validarObligatorio(claveNueva, CLAVE_NUEVA_ES_REQUERIDA);
        ValidadorArgumento.validarObligatorio(claveActual, CLAVE_ES_REQUERIDA);
        if (Objects.equals(claveNueva, this.clave)) {
            ValidadorArgumento.validarLongitudMaxima(claveNueva, MAXIMO_CLAVE, MAXIMO_DE_CLAVE_SUPERADO);
            ValidadorArgumento.validarLongitudMinima(claveNueva, MINUMO_CLAVE, MINIMO_DE_CLAVE_ADMITIDO);
            this.clave = claveNueva;
        }
        throw new ExcepcionValorInvalido(CLAVE_ACTUAL_NO_CORRECTA);
    }
}
