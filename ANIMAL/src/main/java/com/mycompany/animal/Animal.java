/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author felix
 */
public class Animal {
    //atributos
    public  String nombre;
    public int edad;
    public String tipo;
    
    //constructor
    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    //metodos
    public void comer(){
        System.out.println(nombre+" se encuentra comiendo");
    }
    
    public void dormir(){
        System.out.println(nombre+" se encuentra durmiendo");
    }
    
    public void hacersonido(){
        System.out.println(nombre+" hace esta "+tipo);
    } 
}
