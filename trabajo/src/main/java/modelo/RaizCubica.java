/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class RaizCubica implements Operacion {

    private double numero;

    public RaizCubica(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        return Math.cbrt(numero);
    }
}