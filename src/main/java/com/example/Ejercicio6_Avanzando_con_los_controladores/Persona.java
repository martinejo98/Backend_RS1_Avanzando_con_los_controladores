package com.example.Ejercicio6_Avanzando_con_los_controladores;

import org.springframework.stereotype.Component;

@Component
public class Persona {

    protected int id;
    protected String nombre;
    protected int edad;

    public Persona() {}

    public int getId() {
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", edad: "+edad;
    }
}
