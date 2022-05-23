package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorAñadir {

    @Autowired
    ArrayList <Persona> listaPersonas;

    @PostMapping("/persona")
    @RequestMapping(value = "/persona", method = RequestMethod.POST, consumes = "application/json")
    public String añadir(@RequestBody Persona pers){
        listaPersonas.add(pers);
        return "OK";
    }

}
