package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorBorrar {

    @Autowired
    ArrayList <Persona> listaPersonas;

    @DeleteMapping("/persona/{id}")
    public String eliminar(@PathVariable int id){
        int pos=0;
        for(Persona p: listaPersonas){
            if(p.getId()==id){
                listaPersonas.remove(pos);
            }
            pos++;
        }
        return "Persona eliminada";
    }
}
