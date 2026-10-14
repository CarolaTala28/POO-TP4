package edu.programacion.ejercicio2405;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Libro libro1 = new Libro(
                "El principito",
                "Antoine de Saint-Exupéry",
                LocalDate.of(1943, 4, 6),
                5
        );

        Libro libro2 = new Libro(
                "Harry Potter",
                "J. K. Rowling",
                LocalDate.of(1997, 6,26),
                8
        );

        Libro libro3 = new Libro(
                "Don Quijote",
                "Miguel de Cervantes",
                LocalDate.of(1605, 1, 16),
                3
        );

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        System.out.println("Cantidad de libros: " + libreria.cantidadDeLibros());
        System.out.println("Cantidad total de copias: " + libreria.cantidadTotalDeCopias());

        libreria.eliminarLibro(libro2);
        System.out.println("Despues de eliminar Harry Potter:");
        System.out.println("Cantidad de libros: " + libreria.cantidadDeLibros());

        System.out.println("Cantidad total de copias: " + libreria.cantidadTotalDeCopias());
    }
}
