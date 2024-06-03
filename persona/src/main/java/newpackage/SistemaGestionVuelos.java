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



public class SistemaGestionVuelos {
    private List<Vuelo> vuelos;

    public SistemaGestionVuelos() {
        this.vuelos = new ArrayList<>();
    }

    public void registrarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public Vuelo buscarVuelo(String codigo) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getCodigo().equals(codigo)) {
                return vuelo;
            }
        }
        return null;
    }

    public void reservarVuelo(Vuelo vuelo, Pasajero pasajero) {
        vuelo.agregarPasajero(pasajero);
    }

    public void cancelarReserva(Vuelo vuelo, Pasajero pasajero) {
        vuelo.eliminarPasajero(pasajero);
    }

    public void registrarPasajero(Pasajero pasajero) {
        // No es necesario implementar este método ya que el pasajero se registra al momento de reservar un vuelo
    }
}
