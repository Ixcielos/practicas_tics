/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.evaluacion;

public class NewMain {

    public static void main(String[] args) {
        //INSTANCIAR CLASE HIJA 1
        maquina m1=new maquina(1,14,"CORREDORA","BUENO");
        maquina m2=new maquina(2,14,"CORREDORA","MALO");
        
        //INSTANCIAR CLASE HIJA 2
        pesas p1=new pesas(1,18,"10kg","hierro");
        pesas p2=new pesas(2,21,"50kg","acero");
        
        //LLAMADO A METODOS OBJETO 1
        m1.mostrarInformacion();
        m1.verificarEstado();
        
        System.out.println();
        
        //LLAMADO A METODOS OBJETO M2
        m2.mostrarInformacion();
        m2.verificarEstado();
        
        System.out.println();
        
        //LLAMADO A METODOS OBJETO P1 
        p1.mostrarInformacion();
        p1.descripcionPesas();
        
        System.out.println();
        
        //LLAMADO A METODOS OBJETO P2
        p2.mostrarInformacion();
        p2.descripcionPesas();  
    }
}
