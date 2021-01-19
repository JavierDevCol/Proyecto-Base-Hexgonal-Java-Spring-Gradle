package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com"})
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("HOLA  PERRITOS, MI PRIMER PROYECTO DESDE CERO(O) CON GRADLE");
    }
}
