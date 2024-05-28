/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libro;

/**
 *
 * @author felix
 */
public class Libro {
    
    //atributos
    public String titulo;
    public String autor;
    public int paginas;
    
    //constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    //metodos
    public void abrir(){
        System.out.println("El libro se encuentra abierto");
    }
    
    public void leer(){
        System.out.println("El libro esta siendo leido");
    }
    public void cerrar(){
        System.out.println("El libro esta cerrado");
    }
        
}
