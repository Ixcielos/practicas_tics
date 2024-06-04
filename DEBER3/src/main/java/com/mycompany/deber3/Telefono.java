/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber3;

/**
 *
 * @author felix
 */
public class Telefono extends Electronico {
    private String numeroTelefono;

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void mostrarInformacionCompleta() {
        mostrarInformacion();
        System.out.println("Número de teléfono: " + numeroTelefono);
    }
}
