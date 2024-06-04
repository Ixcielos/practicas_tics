/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber2;

/**
 *
 * @author felix
 */
public class estudiante extends persona{
/*Luego, crea una clase derivada llamada Estudiante que herede de Persona y añada los siguientes atributos públicos:
•	- matricula (tipo String)
•	+carrera (tipo String)

La clase Estudiante debe tener los siguientes métodos:
•	+estudiar(): que imprima un mensaje indicando que el estudiante está estudiando.
*/
    private String matricula;
    public String carrera;
     
    public estudiante(String matricula, String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void estudiar(){
        System.out.println(nombre+" esta estudiando");
    }
}
