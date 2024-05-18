/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author felix
 */
public class person {
    String name;
    int age;
    
    
    public person(String name, int age){
        this.name=name;
        this.age=age;        
    }

    public void Saludar(){
        System.out.println("Holaaa soy "+this.name);
    }
}
