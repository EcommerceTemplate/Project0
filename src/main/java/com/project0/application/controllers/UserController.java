package com.project0.application.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String miMetodo() {
        return "¡Hola desde mi nueva ruta!";
    }
}
