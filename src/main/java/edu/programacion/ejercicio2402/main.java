package edu.programacion.ejercicio2402;

public class Main {
    public static void main(String[] args){
        Album album = new Album("Mis vacaciones");
        Foto Foto1 = new Foto("Playa");
        Foto Foto2 = new Foto("Montaña");
        Foto Foto3 = new Foto("Atardecer");

        album.agregarFoto(Foto1);

        System.out.println("Cantidad de fotos: " + album.cantidadFotos());

        album.eliminarFoto(Foto2);

        System.out.println("Despues de eliminar una foto: " + album.cantidadFotos());

        album.limpiar();

        System.out.println("Despues de limpiar: " + album.cantidadFotos());
    }
}
