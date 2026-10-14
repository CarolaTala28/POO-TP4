package edu.programacion.ejercicio2403;

public class Main {
    public static void main(String[] args){
        Temperature temperatura = new Temperature();

        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());
        System.out.println("Nota Rankine: " + temperatura.getRankine());
        System.out.println("Nota Reaumur: " + temperatura.getReaumur());

        temperatura.setCelsius(5);

        System.out.println("--------------------------");

        System.out.println("Celsius: " + temperatura.getCelsius());
        System.out.println("Fahrenheit: " + temperatura.getFahrenheit());
        System.out.println("Kelvin: " + temperatura.getKelvin());
        System.out.println("Nota Rankine: " + temperatura.getRankine());
        System.out.println("Nota Reaumur: " + temperatura.getReaumur());
    }
}
