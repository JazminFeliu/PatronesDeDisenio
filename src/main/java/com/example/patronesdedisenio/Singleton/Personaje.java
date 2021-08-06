package com.example.patronesdedisenio.Singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personaje {

    //forma lazy (lo instancio cuando lo necesito)
    private static Personaje personaje;

    private String nombre;
    private Integer puntaje;

    private Personaje(String nombre, Integer puntaje){
        this.nombre = nombre;
        this.puntaje = puntaje;

    }

    public static Personaje getPersonaje(){
        if(personaje == null)
            personaje = new Personaje("default", 0);
        return personaje;
    }

    public void sumarPuntos(Integer puntosNuevos){
        this.puntaje += puntosNuevos;

    }
}
