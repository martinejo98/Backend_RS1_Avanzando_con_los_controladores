package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorModificar {

    @Autowired
    ArrayList <Persona> listaPersonas;

    @PutMapping("/persona/{id}")
    @RequestMapping(value = "/persona/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public String modificar(@PathVariable int id, @RequestBody Persona pers){
        Persona pers1=null;
        int aux=0;
        int pos=0;

        for(Persona p: listaPersonas){
                if(p.getId()==id){
                    pers1=p;
                    aux=pos;
                }
                pos++;
            }

            pers1.setNombre(pers.getNombre());
            pers1.setEdad(pers.getEdad());

            listaPersonas.remove(aux);
            listaPersonas.add(aux, pers1);

        return "OK";
    }

}
