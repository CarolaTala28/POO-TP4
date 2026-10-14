package edu.programacion.ejercicio2406;

public class Capitulo {
    private String titulo;
    private int numero;
    private int duracionMinutos;

    public Capitulo(String titulo, int numero, int duracionMinutos) {
        this.titulo = titulo;
        this.numero = numero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
}

