/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class RaizCuadrada implements Operacion {

    private double numero;

    public RaizCuadrada(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {

        if (numero < 0) {
            throw new ArithmeticException(
                "No se puede calcular la raiz cuadrada de un numero negativo."
            );
        }

        return Math.sqrt(numero);
    }
}