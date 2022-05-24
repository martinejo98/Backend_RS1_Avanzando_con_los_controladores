package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioPersona {

    List<Persona> listaPersonas;

    ServicioPersona(){
        listaPersonas = new ArrayList<>();
    }

    public String añadir(Persona pers){
        listaPersonas.add(pers);
        return "OK";
    }

    public String eliminar(int id){
        int pos=0;
        for(Persona p: listaPersonas){
            if(p.getId()==id){
                listaPersonas.remove(pos);
            }
            pos++;
        }
        return "Persona eliminada";
    }

    public String consultar(int id){
        StringBuilder sb = new StringBuilder();
        for(Persona p: listaPersonas){
            if(p.getId()==id){
                sb.append(p.getId());
                sb.append(", ");
                sb.append(p.getNombre());
                sb.append(", ");
                sb.append(p.getEdad());
                sb.append(", ");
                sb.append(p.getPoblacion());
                sb.append("\n");
            }
        }
        return sb+"";
    }

    public String consultar(String nombre){
        StringBuilder sb = new StringBuilder();
        for(Persona p: listaPersonas){
            if(p.getNombre().equals(nombre)){
                sb.append(p.getId());
                sb.append(", ");
                sb.append(p.getNombre());
                sb.append(", ");
                sb.append(p.getEdad());
                sb.append(", ");
                sb.append(p.getPoblacion());
                sb.append("\n");
            }
        }
        return sb+"";
    }
}
