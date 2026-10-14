package edu.programacion.ejercicio2406;

import java.util.ArrayList;

public abstract class ContenidoAudioVisual {
    private String titulo;
    private int anioEstreno;
    private ArrayList<Actor> actores;
    private ArrayList<Director> directores;
    private ArrayList<Personaje> personajes;

    public ContenidoAudioVisual(String titulo, int anioEstreno) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        actores = new ArrayList<>();
        directores = new ArrayList<>();
        personajes = new ArrayList<>();
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

     public void agregarActor(Actor actor) {
        actores.add(actor);
     }

     public void agregarDirector(Director director) {
        directores.add(director);
     }

     public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
     }

     public ArrayList<Actor> getActores() {
        return new ArrayList<>(actores);
     }

     public ArrayList<Director> getDirectores() {
        return new ArrayList<>(directores);

     }

     public ArrayList<Personaje> getPersonajes() {
        return new ArrayList<>(personajes);
     }
}
