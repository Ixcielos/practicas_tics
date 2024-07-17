/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

public class maquina extends EquipoTrabajo{
    String nombre;
    private String estado;
    
    public maquina(int identificador, int cantidad, String nombre, String estado) {
        super(identificador, cantidad);
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" "+nombre+" "+estado); 
    }
    
    public void verificarEstado(){
        if (!"BUENO".equals(estado)){
            System.out.println("La maquina nececita reparacion");
        }else{
            System.out.println("La maquina esta en buen estado");
        }
    }
}
