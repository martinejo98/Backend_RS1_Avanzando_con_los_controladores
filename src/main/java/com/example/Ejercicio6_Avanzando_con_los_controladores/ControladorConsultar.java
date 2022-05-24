package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class ControladorConsultar {

    @Autowired
    ServicioPersona persona;

    @GetMapping("/{id}")
    public String consultar(@PathVariable int id){
        return persona.consultar(id);
    }

    @GetMapping("/nombre/{nombre}")
    public String consultar(@PathVariable String nombre){
        return persona.consultar(nombre);
    }
}
