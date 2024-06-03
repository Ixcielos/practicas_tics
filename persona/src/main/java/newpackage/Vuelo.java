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

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private String fecha;
    private List<Pasajero> pasajeros;

    public Vuelo(String codigo, String origen, String destino, String fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.pasajeros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void eliminarPasajero(Pasajero pasajero) {
        pasajeros.remove(pasajero);
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
