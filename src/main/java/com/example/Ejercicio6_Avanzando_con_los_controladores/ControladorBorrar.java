package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/persona")
public class ControladorBorrar {

    @Autowired
    ServicioPersona persona;

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id){
        persona.eliminar(id);
        return "Persona eliminada";
    }

}
