/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libro;

/**
 *
 * @author felix
 */
public class main{

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Libro libro1=new Libro("Elguerra","tzun zu",100);
        libro1.abrir();
        libro1.leer();
        libro1.cerrar();
        
        Libro libro2=new Libro("Algebramoderna","baldor",150);
        libro2.abrir();
        libro2.leer();
        libro2.cerrar();
    }
}
