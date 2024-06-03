/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber2_;

/**
 *
 * @author felix
 */
public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        setNumPuertas(numPuertas);
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    private void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void mostrarDetalles(){
        detalles();
        System.out.println(marca+" modelo "+modelo+" puertas "+numPuertas);
    }
    
}
