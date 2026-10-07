/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class Suma extends OperacionBinaria {

    public Suma(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {
        return primerNumero + segundoNumero;
    }
}