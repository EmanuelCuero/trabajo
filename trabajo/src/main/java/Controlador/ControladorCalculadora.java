/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.VentanaCalculadora;
import modelo.Operacion;
import modelo.Suma;
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division;
/**
 *
 * @author emanu
 */
public class ControladorCalculadora {

    private VentanaCalculadora ventana;

    public ControladorCalculadora(VentanaCalculadora ventana) {
        this.ventana = ventana;

        configurarBotones();
    }

    private void configurarBotones() {

        ventana.botonSumar.addActionListener(
            e -> sumar()
        );

        ventana.botonRestar.addActionListener(
            e -> restar()
        );

        ventana.botonMultiplicar.addActionListener(
            e -> multiplicar()
        );

        ventana.botonDividir.addActionListener(
            e -> dividir()
        );
    }

    private void sumar() {

        double primerNumero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        double segundoNumero =
                Double.parseDouble(
                    ventana.campoSegundoNumero.getText()
                );

        Operacion operacion =
                new Suma(
                    primerNumero,
                    segundoNumero
                );

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }

    private void restar() {

        double primerNumero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        double segundoNumero =
                Double.parseDouble(
                    ventana.campoSegundoNumero.getText()
                );

        Operacion operacion =
                new Resta(
                    primerNumero,
                    segundoNumero
                );

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }

    private void multiplicar() {

        double primerNumero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        double segundoNumero =
                Double.parseDouble(
                    ventana.campoSegundoNumero.getText()
                );

        Operacion operacion =
                new Multiplicacion(
                    primerNumero,
                    segundoNumero
                );

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }

    private void dividir() {

        double primerNumero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        double segundoNumero =
                Double.parseDouble(
                    ventana.campoSegundoNumero.getText()
                );

        Operacion operacion =
                new Division(
                    primerNumero,
                    segundoNumero
                );

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }
}