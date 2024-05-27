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
    public  String nombre;
    public int edad;
    public String tipo;
    
    /*Crea una clase llamada Animal con los siguientes atributos públicos:
•	+nombre (tipo String)
•	+edad (tipo int)
•	+Tipo (tipo String)
La clase debe tener los siguientes métodos:
•	+comer(): que imprima un mensaje indicando que el animal está comiendo.
•	+dormir(): que imprima un mensaje indicando que el animal está durmiendo.
•	+hacerSonido(): que imprima un mensaje indicando el sonido que hace el animal.
*/

    public Animal(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
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
