package edu.programacion.ejercicio2404;

public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public void Pintar(){
        System.out.println("Pintando un cuadrado " + getColor());
    }
}
