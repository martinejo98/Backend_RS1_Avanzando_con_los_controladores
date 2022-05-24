package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class ControladorModificar {

  @Autowired
  ServicioPersona personas;

  @PutMapping("/{id}")
  public String modificar(@PathVariable int id, @RequestBody Persona pers) {
    Persona pers1=null;
    int aux=0;
    int pos=0;

    if(pers.getNombre() != null && pers.getPoblacion() != null && pers.getId() != 0 && pers.getEdad() != 0){    //Pongo que el ID y la EDAD sean distintos de 0 ya que si pongo en el JSON como null, lo pasa con valor 0 en vez de null al ser un INT
      for(Persona p: personas.listaPersonas){
        if(p.getId()==id){
          pers1=p;
          aux=pos;
        }
        pos++;
      }

      pers1.setNombre(pers.getNombre());
      pers1.setEdad(pers.getEdad());
      pers1.setPoblacion(pers.getPoblacion());

      personas.listaPersonas.remove(aux);
      personas.listaPersonas.add(aux, pers1);

      return "OK";
    }else{
      return "KO";
    }
  }
}
