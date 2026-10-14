package edu.programacion.ejercicio2406;

import java.util.ArrayList;

public class Serie extends ContenidoAudioVisual {
    private ArrayList<Capitulo> capitulos;

    public Serie(String titulo, int anioEstreno) {
        super(titulo, anioEstreno);
        capitulos = new ArrayList<>();
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public int cantidadCapitulos() {
        return capitulos.size();
    }

    public ArrayList<Capitulo> getCapitulos() {
        return new ArrayList<>(capitulos);
    }
}
