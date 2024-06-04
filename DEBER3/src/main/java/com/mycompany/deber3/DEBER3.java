/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deber3;

/**
 *
 * @author felix
 */
public class DEBER3 {

    public static void main(String[] args) {
        Telefono telefono1 = new Telefono();
        telefono1.setNombre("iPhone 12");
        telefono1.setPrecio(999.99);
        telefono1.setGarantia(24);
        telefono1.setNumeroTelefono("+593982032819");

        telefono1.mostrarInformacionCompleta();
    }
}
