/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author felix
 */

public class MAIN {
    public static void main (String[] args){

        //primera instancia
        Animal A1 = new Animal("perro",14,"ladrando");

        //llamado a metodos
        A1.comer();
        A1.dormir();
        A1.hacersonido();
        
        //segunda instancia
        Animal A2 = new Animal("gato",4,"aullando");

        //llamado a metodos
        A2.comer();
        A2.dormir();
        A2.hacersonido();
    }
}
