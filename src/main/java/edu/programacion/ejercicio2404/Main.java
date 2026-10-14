package edu.programacion.ejercicio2404;

public class Main {
    public static  void main(String[] args) {
        EditorFiguras editor = new EditorFiguras();
        Cuadrado cuadrado = new Cuadrado("rojo", 4);
        Circulo circulo = new Circulo("azul", 2);
        Triangulo triangulo = new Triangulo("verde", 4, 3);
        Linea linea = new Linea("negro", 10);

        editor.agregarFigura(cuadrado);
        editor.agregarFigura(circulo);
        editor.agregarFigura(triangulo);
        editor.agregarFigura(linea);

        editor.Pintar();

        System.out.println("Area total: " + editor.calcularArea());

        editor.borrarFigura(circulo);
        System.out.println("Area total despues de borrar el circulo: " + editor.calcularArea());
    }
}
