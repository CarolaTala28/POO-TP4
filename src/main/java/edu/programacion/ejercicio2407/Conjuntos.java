package edu.programacion.ejercicio2407;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    private HashSet<Persona> personas;

    public Conjuntos() {
        personas = new HashSet<>();
    }

    public boolean add(Persona persona) {
        return personas.add(persona);
    }

    public boolean remove(Persona persona) {
        return personas.remove(persona);
    }
}
