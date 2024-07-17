/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author felix
 */
// Clase principal para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases hijas
        Guitarra guitarra1 = new Guitarra(1, 5, "Acustica", "nueva");
        Guitarra guitarra2 = new Guitarra(2, 3, "Electrica", "usada");
        Piano piano1 = new Piano(3, 2, "de cola", "Yamaha");
        Piano piano2 = new Piano(4, 1, "vertical", "Steinway");

        // Ejecutar métodos de las clases hijas
        guitarra1.mostrarInformacion();
        guitarra1.verificarEstado();
        System.out.println();

        guitarra2.mostrarInformacion();
        guitarra2.verificarEstado();
        System.out.println();

        piano1.mostrarInformacion();
        piano1.descripcionPiano();
        System.out.println();

        piano2.mostrarInformacion();
        piano2.descripcionPiano();
    }
}