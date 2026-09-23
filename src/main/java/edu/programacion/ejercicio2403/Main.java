package edu.programacion.ejercicio2403;

public class Main {
    public static void main(String[] args){
        Temperature temperatura = new Temperature();

        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());

        temperatura.setCelsius(5);

        System.out.println("--------------------------");

        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());
    }
}
