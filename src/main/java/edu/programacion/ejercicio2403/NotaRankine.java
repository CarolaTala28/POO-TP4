package edu.programacion.ejercicio2403;

public class NotaRankine {

    public static double celsiusARankine(double celsius){
        return celsius * 9 / 5 + 491.64;
    }
    public static double rankineACelsius(double rankine){
        return (rankine - 491.67) * 5 / 9;
    }
}