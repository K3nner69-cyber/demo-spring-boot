package com.ejemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String saludar() {
        return "¡Hola desde Spring Boot!";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludoPersonalizado(@PathVariable String nombre) {
        return "Hola, " + nombre + "!";
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
                "curso", "Java con Spring Boot",
                "sesion", 1,
                "activo", true
        );
    }
    // 1. Endpoint de despedida
    @GetMapping("/despedida/{nombre}")
    public String despedida(@PathVariable String nombre) {
        return "Hasta luego, " + nombre;
    }
    // 2. Endpoint de perfil
    @GetMapping("/perfil")
    public Map<String, String> perfil() {
        return Map.of(
                "nombre", "Kenner",
                "ciudad", "Bogotá",
                "lenguajeFavorito", "Java"
        );
    }
    // 3. Endpoint de suma
    @GetMapping("/suma/{a}/{b}")
    public int sumar(
            @PathVariable int a,
            @PathVariable int b) {
        return a + b;
    }
}
