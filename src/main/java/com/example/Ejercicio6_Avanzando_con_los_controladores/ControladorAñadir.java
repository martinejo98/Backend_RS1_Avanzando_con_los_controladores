package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/persona")
public class ControladorAñadir {

    @Autowired
    ServicioPersona persona;

    @PostMapping
    public String añadir(@RequestBody Persona pers){
        persona.añadir(pers);
        return "OK";
    }

}
