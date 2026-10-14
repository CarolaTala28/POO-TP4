package edu.programacion.ejercicio2406;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Daniel", "Radcliffe");
        Director director1 = new Director("Chris", "Columbus");
        Personaje personaje1 = new Personaje("Harry Potter", actor1);

        Pelicula pelicula = new Pelicula(
                "Harry Potter y la piedra filosofal",
                2001,
                152
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarDirector(director1);
        pelicula.agregarPersonaje(personaje1);

        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Año: " + pelicula.getAnioEstreno());
        System.out.println("Duracion: " + pelicula.getDuracionMinutos());
        System.out.println("Personaje: " + pelicula.getPersonajes().get(0).getNombre());

        Serie serie = new Serie("Serie de prueba", 2025);

        Capitulo capitulo1 = new Capitulo("Primer capitulo", 1);
        Capitulo capitulo2 = new Capitulo("Segundo capitulo", 2);

        serie.agregarCapitulo(capitulo1);
        serie.agregarCapitulo(capitulo2);

        System.out.println("Serie: " + serie.getTitulo());
        System.out.println("Cantidad de capitulos: " + serie.cantidadCapitulos());


    }
}
