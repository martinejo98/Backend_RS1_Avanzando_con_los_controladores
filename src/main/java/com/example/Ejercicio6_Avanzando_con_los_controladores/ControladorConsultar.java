package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorConsultar {

    @Autowired
    ArrayList<Persona> listaPersonas;

    @GetMapping("/persona/{id}")
    public String consultar(@PathVariable int id){
        StringBuilder sb = new StringBuilder();
        for(Persona p: listaPersonas){
            if(p.getId()==id){
                sb.append(p.getId());
                sb.append(", ");
                sb.append(p.getNombre());
                sb.append(", ");
                sb.append(p.getEdad());
                sb.append("\n");
            }
        }
        return sb+"";
    }

    @GetMapping("/persona/nombre/{nombre}")
    public String consultar(@PathVariable String nombre){
        StringBuilder sb = new StringBuilder();
        for(Persona p: listaPersonas){
            if(p.getNombre().equals(nombre)){
                sb.append(p.getId());
                sb.append(", ");
                sb.append(p.getNombre());
                sb.append(", ");
                sb.append(p.getEdad());
                sb.append("\n");
            }
        }
        return sb+"";
    }
}
