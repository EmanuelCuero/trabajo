/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class Division extends OperacionBinaria {

    public Division(double primerNumero, double segundoNumero) {
        super(primerNumero, segundoNumero);
    }

    @Override
    public double calcular() {

        if (segundoNumero == 0) {
            throw new ArithmeticException(
                "No se puede dividir entre cero."
            );
        }

        return primerNumero / segundoNumero;
    }
}