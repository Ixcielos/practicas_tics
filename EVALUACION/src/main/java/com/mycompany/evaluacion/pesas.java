/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

/**
 *
 * @author felix
 */
public class pesas extends EquipoTrabajo {
    String peso;
    private String material;

    public pesas(int identificador, int cantidad,String peso, String material) {
        super(identificador, cantidad);
        this.peso = peso;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    //@Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(peso+" "+material);
    }
    
    public void descripcionPesas(){
        System.out.println(cantidad+" "+peso+" "+material);
    }
}
