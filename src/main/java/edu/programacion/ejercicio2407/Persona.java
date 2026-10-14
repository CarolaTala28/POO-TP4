package edu.programacion.ejercicio2407;

import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Persona)) {
            return false;
        }

        Persona otra = (Persona) objeto;
        return Objects.equals(dni, otra.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni +")";
    }
}
