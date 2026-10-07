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
import modelo.RaizCuadrada;
import modelo.RaizCubica;
import modelo.LogaritmoNatural;
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

        ventana.botonRaizCuadrada.addActionListener(
            e -> raizCuadrada()
        );

        ventana.botonRaizCubica.addActionListener(
            e -> raizCubica()
        );

        ventana.botonLogaritmoNatural.addActionListener(
            e -> logaritmoNatural()
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

    private void raizCuadrada() {

        double numero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        Operacion operacion =
                new RaizCuadrada(numero);

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }

    private void raizCubica() {

        double numero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        Operacion operacion =
                new RaizCubica(numero);

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }

    private void logaritmoNatural() {

        double numero =
                Double.parseDouble(
                    ventana.campoPrimerNumero.getText()
                );

        Operacion operacion =
                new LogaritmoNatural(numero);

        ventana.campoResultado.setText(
            String.valueOf(
                operacion.calcular()
            )
        );
    }
}