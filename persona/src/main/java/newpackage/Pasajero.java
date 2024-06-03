/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author felix
 */
import java.util.ArrayList;
import java.util.List;

public class Pasajero {
    //class Pasajero {
    private String id_pasajero;
    private String nombre;

    public Pasajero(String id_pasajero, String nombre) {
        this.id_pasajero = id_pasajero;
        this.nombre = nombre;
    }

    public String getId_pasajero() {
        return id_pasajero;
    }

    public String getNombre() {
        return nombre;
    }
}

