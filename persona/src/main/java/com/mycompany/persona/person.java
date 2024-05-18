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
    public String name;
    public int age=0;
    
    
    public person(String name, int age){
        this.name=name;
        this.age=age;        
    }

    public void saludar(){
        System.out.println("Holaaa soy "+this.name);
    }
}
