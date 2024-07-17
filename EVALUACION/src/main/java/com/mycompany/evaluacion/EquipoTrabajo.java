/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author felix
 */
public class EquipoTrabajo {
    int identificador;
    int cantidad;

    public EquipoTrabajo(int identificador, int cantidad) {
        this.identificador = identificador;
        this.cantidad = cantidad;
    }
    
    public void mostrarInformacion(){
        System.out.print(identificador+" "+cantidad);
    }
    
}
