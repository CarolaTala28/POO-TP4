package edu.programacion.ejercicio2404;

import java.util.ArrayList;

public class EditorFiguras {
    private ArrayList<Figuras> figuras;

    public EditorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figuras figura) {
        figuras.add(figura);
    }

    public void borrarFigura(Figuras figura) {
        figuras.remove(figura);
    }

    public void Pintar() {
        for (Figuras figura : figuras) {
            figura.Pintar();
        }
    }

    public double calcularArea() {
        double areaTotal = 0;

        for (Figuras figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
