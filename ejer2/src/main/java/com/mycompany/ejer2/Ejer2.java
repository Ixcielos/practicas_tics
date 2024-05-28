/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer2;

/**
 *
 * @author felix
 */
public class Ejer2 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //primera instancia
        Libro l1= new Libro("Elguerra","tzunzu",100);
        l1.abrir();
        l1.leer();
        l1.cerrar();
        //seugnda instancia
        Libro l2= new Libro("Algebramoderna","baldor",150);
        l2.abrir();
        l2.leer();
        l2.cerrar();
    }
}
