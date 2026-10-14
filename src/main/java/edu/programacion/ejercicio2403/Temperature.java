package edu.programacion.ejercicio2403;

public class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0;
    }
        public double getCelsius() {
        return celsius;
    }

    public void setCelsius (double value) {
        this.celsius = value;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public void setFahrenheit(double value){
        this.celsius = (value - 32) / 1.8;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }

    public void setKelvin(double value) {
        this.celsius = value - 273.15;
    }

    public double getRankine(){
        return celsius * 9 / 5 + 491.67;
    }

    public void setRankine(double value){
        this.celsius = (value - 491.67) * 9 / 5;
    }

    public double getReaumur(){
        return celsius * 4 / 5;
    }

    public void setReaumur(double value){
        this.celsius = value * 5 / 4;
    }

}
