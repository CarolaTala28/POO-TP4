package edu.programacion.ejercicio2406;

import java.util.ArrayList;

public class Serie extends ContenidoAudioVisual {
    private ArrayList<Capitulo> capitulos;
    private int temporadas;

    public Serie(String titulo, int anioEstreno, int temporadas) {
        super(titulo, anioEstreno);
        capitulos = new ArrayList<>();
        this.temporadas = temporadas;
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

    public int getTemporadas() {
        return temporadas;
    }
}
