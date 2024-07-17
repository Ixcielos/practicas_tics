/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion1;

/**
 *
 * @author felix
 */
// Clase hija: Piano
public class Piano extends InstrumentoMusical {
    // Atributos específicos del piano
    String tipo;
    private String marca;

    // Constructor
    public Piano(int identificador, int cantidad, String tipo, String marca) {
        super(identificador, cantidad);
        this.tipo = tipo;
        this.marca = marca;
    }

    //Métodos getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Método específico para describir el piano
    public void descripcionPiano() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}