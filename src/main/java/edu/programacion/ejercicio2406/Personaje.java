package edu.programacion.ejercicio2406;

public class Personaje {
    private String nombre;
    private Actor actor;

    public Personaje(String nombre, Actor actor) {
        this.nombre = nombre;
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public Actor getActor() {
        return actor;
    }
}
