/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author felix
 */
// Clase hija: Guitarra
public class Guitarra extends InstrumentoMusical {
    // Atributos específicos de la guitarra
    String modelo;
    private String estado;

    // Constructor
    public Guitarra(int identificador, int cantidad, String modelo, String estado) {
        super(identificador, cantidad);
        this.modelo = modelo;
        this.estado = estado;
    }

    //Método getter y setter
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para verificar el estado de la guitarra
    public void verificarEstado() {
        System.out.println("Estado: " + estado);
        System.out.println("Modelo: " + modelo);
    }
}
