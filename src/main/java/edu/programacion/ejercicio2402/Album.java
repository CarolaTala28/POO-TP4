package edu.programacion.ejercicio2402;

import java.util.ArrayList;

    public class Album{
        private String Nombre;
        private ArrayList<Foto> fotos;

        public Album(String Nombre){
            this.Nombre = Nombre;
            this.fotos = new ArrayList<>();
        }

        public String getNombre(){
            return Nombre;
        }

        public void setNombre(String nombre) {
            this.Nombre = Nombre;
        }

        public void agregarFoto(Foto foto){
            fotos.add(foto);
        }

        public void agregarFotos(ArrayList<Foto> nuevasFotos){
            fotos.addAll(nuevasFotos);
        }

        public int cantidadFotos(){
            return fotos.size();
        }

        public void eliminarFoto(Foto foto){
            fotos.remove(foto);
        }

        public void limpiar(){
            fotos.clear();
        }
    }