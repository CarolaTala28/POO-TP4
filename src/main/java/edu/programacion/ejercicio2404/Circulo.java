package edu.programacion.ejercicio2404;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    @Override
    public void Pintar() {
        System.out.println("Pintando un circulo " + getColor());
    }
}
