package edu.programacion.ejercicio2406;

public class Personaje {
    private String nombre;
    private Actor actor;
    private String descripcion;

    public Personaje(String nombre, Actor actor, String descripcion) {
        this.nombre = nombre;
        this.actor = actor;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public Actor getActor() {
        return actor;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
