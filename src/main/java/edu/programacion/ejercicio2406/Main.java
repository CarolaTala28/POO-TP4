package edu.programacion.ejercicio2406;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Leonardo", "DiCaprio");
        Director director1 = new Director("Christopher", "Nolan");

        Pelicula pelicula = new Pelicula(
                "Origen",
                2010,
                148
        );

        pelicula.agregarActor(actor1);
        pelicula.agregarDirector(director1);

        Personaje personaje1 = new Personaje(
                "cobb",
                actor1,
                "Personaje principal de la pelicula"
        );

        pelicula.agregarPersonaje(personaje1);

        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Año: " + pelicula.getAnioEstreno());
        System.out.println("Duracion: " + pelicula.getDuracionMinutos());
        System.out.println("Personaje: " + pelicula.getPersonajes().get(0).getNombre());

        Serie serie = new Serie("Dark", 2017, 3);

        Capitulo capitulo1 = new Capitulo("Secretos", 1, 50);

        serie.agregarCapitulo(capitulo1);

        System.out.println("Serie: " + serie.getTitulo());
        System.out.println("Temporadas: " + serie.getTemporadas());
        System.out.println("Capitulo: " + serie.getCapitulos().size());


    }
}
