package edu.programacion.ejercicio2404;

public abstract class Figuras {
    private String color;

    public Figuras(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double calcularArea();

    public void Pintar(){
        System.out.println("Pintando una figura " + color);
    }
}
