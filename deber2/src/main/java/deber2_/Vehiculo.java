/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber2_;

/**
 *
 * @author felix
 */
public class Vehiculo {
    /*Crea una clase base llamada Vehiculo con los siguientes atributos públicos:
•	marca (tipo String)
•	modelo (tipo String)

La clase Vehiculo debe tener los siguientes métodos:
•	detalles(): que imprima un mensaje con la marca y el modelo del vehículo.*/
    public String marca;
    public String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void detalles(){
        System.out.println("Marca "+marca+" modelo"+modelo);
    }
}
