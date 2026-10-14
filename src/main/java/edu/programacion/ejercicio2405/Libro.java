package edu.programacion.ejercicio2405;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private int cantidadCopias;

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidadCopias = cantidadCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
}
