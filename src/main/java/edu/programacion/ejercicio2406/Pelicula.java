package edu.programacion.ejercicio2406;

public class Pelicula extends ContenidoAudioVisual {
    private int duracionMinutos;

    public Pelicula(String titulo, int anioEstreno, int duracionMinutos) {
        super(titulo, anioEstreno);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
}
