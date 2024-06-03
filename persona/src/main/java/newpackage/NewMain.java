/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

/**
 *
 * @author felix
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto SistemaGestionVuelos
        SistemaGestionVuelos sistema = new SistemaGestionVuelos();

        // Creamos algunos objetos Pasajero
        Pasajero pasajero1 = new Pasajero("P001", "Juan Pérez");
        Pasajero pasajero2 = new Pasajero("P002", "María Rodríguez");
        Pasajero pasajero3 = new Pasajero("P003", "Carlos Gómez");

        // Creamos algunos objetos Vuelo
        Vuelo vuelo1 = new Vuelo("V001", "Madrid", "Barcelona", "2023-02-15");
        Vuelo vuelo2 = new Vuelo("V002", "Barcelona", "Madrid", "2023-02-20");
        Vuelo vuelo3 = new Vuelo("V003", "Madrid", "Sevilla", "2023-03-01");

        // Registramos los vuelos en el sistema
        sistema.registrarVuelo(vuelo1);
        sistema.registrarVuelo(vuelo2);
        sistema.registrarVuelo(vuelo3);

        // Reservamos algunos vuelos
        sistema.reservarVuelo(vuelo1, pasajero1);
        sistema.reservarVuelo(vuelo1, pasajero2);
        sistema.reservarVuelo(vuelo2, pasajero3);

        // Imprimimos la lista de pasajeros de un vuelo
        Vuelo vuelo = sistema.buscarVuelo("V001");
        if (vuelo!= null) {
            System.out.println("Pasajeros del vuelo " + vuelo.getCodigo() + ":");
            for (Pasajero pasajero : vuelo.getPasajeros()) {
                System.out.println("  " + pasajero.getNombre());
            }
        } else {
            System.out.println("Vuelo no encontrado");
        }
    }
    
}
