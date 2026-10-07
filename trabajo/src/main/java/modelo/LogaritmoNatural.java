/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class LogaritmoNatural implements Operacion {

    private double numero;

    public LogaritmoNatural(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {

        if (numero <= 0) {
            throw new ArithmeticException(
                "El logaritmo natural requiere un numero mayor que cero."
            );
        }

        return Math.log(numero);
    }
}