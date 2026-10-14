package edu.programacion.ejercicio2404;

public class Triangulo extends Figuras {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void Pintar() {
        System.out.println("Pintando un triángulo " + getColor());
    }

}
