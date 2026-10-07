/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajo;
import Vista.VentanaCalculadora;
import Controlador.ControladorCalculadora;
/**
 *
 * @author emanu
 */
public class Trabajo {

    public static void main(String[] args) {

        VentanaCalculadora ventana =
                new VentanaCalculadora();

        new ControladorCalculadora(ventana);

        ventana.setVisible(true);
    }
}