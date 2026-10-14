package edu.programacion.ejercicio2404;

public class Linea extends Figuras {
    private double longitud;

    public Linea(String color, double longitud) {
        super(color);
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public void Pintar() {
        System.out.println("Pintando una linea " + getColor());
    }
}
