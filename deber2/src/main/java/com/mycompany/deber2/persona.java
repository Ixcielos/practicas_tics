/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber2;

/**
 *
 * @author felix
 */
public class persona {

    //ATRIBUTOS
    public String nombre;
    public int edad;

    //CONSTRUCTOR
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //METODOS
    public void presentarse(){
        System.out.println(nombre+" tiene "+edad+ " años");
    }
}
