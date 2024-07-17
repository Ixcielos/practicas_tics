/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author felix
 */
// Clase padre: InstrumentoMusical
public class InstrumentoMusical {
    // Atributos comunes a todos los instrumentos
    int identificador;
    int cantidad;

    // Constructor
    public InstrumentoMusical(int identificador, int cantidad) {
        this.identificador = identificador;
        this.cantidad = cantidad;
    }

    // Método común para mostrar información
    public void mostrarInformacion() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Cantidad: " + cantidad);
    }
}