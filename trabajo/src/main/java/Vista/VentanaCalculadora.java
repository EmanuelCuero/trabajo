/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author emanu
 */

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.GridLayout;

public class VentanaCalculadora extends JFrame {

    // Campos de texto
    public JTextField campoPrimerNumero;
    public JTextField campoSegundoNumero;
    public JTextField campoResultado;

    // Operaciones básicas
    public JButton botonSumar;
    public JButton botonRestar;
    public JButton botonMultiplicar;
    public JButton botonDividir;

    // Operaciones especiales
    public JButton botonRaizCuadrada;
    public JButton botonRaizCubica;
    public JButton botonLogaritmoNatural;

    // Botón limpiar
    public JButton botonLimpiar;

    public VentanaCalculadora() {

        setTitle("Calculadora MVC");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        crearVentana();
    }

    private void crearVentana() {

        // Crear panel
        JPanel panel = new JPanel();

        panel.setLayout(
            new GridLayout(0, 1, 10, 10)
        );

        panel.setBorder(
            BorderFactory.createEmptyBorder(
                20, 20, 20, 20
            )
        );

        // Título
        JLabel titulo = new JLabel(
            "CALCULADORA",
            SwingConstants.CENTER
        );

        // Etiquetas
        JLabel etiquetaPrimerNumero =
                new JLabel("Primer numero:");

        JLabel etiquetaSegundoNumero =
                new JLabel("Segundo numero:");

        JLabel etiquetaResultado =
                new JLabel("Resultado:");

        // Crear campos
        campoPrimerNumero = new JTextField();
        campoSegundoNumero = new JTextField();
        campoResultado = new JTextField();

        campoResultado.setEditable(false);

        // Crear botones básicos
        botonSumar = new JButton("Sumar");
        botonRestar = new JButton("Restar");
        botonMultiplicar = new JButton("Multiplicar");
        botonDividir = new JButton("Dividir");

        // Crear botones especiales
        botonRaizCuadrada =
                new JButton("Raiz cuadrada");

        botonRaizCubica =
                new JButton("Raiz cubica");

        botonLogaritmoNatural =
                new JButton("Logaritmo natural");

        // Crear botón limpiar
        botonLimpiar =
                new JButton("Limpiar");

        // Agregar elementos al panel
        panel.add(titulo);

        panel.add(etiquetaPrimerNumero);
        panel.add(campoPrimerNumero);

        panel.add(etiquetaSegundoNumero);
        panel.add(campoSegundoNumero);

        panel.add(botonSumar);
        panel.add(botonRestar);
        panel.add(botonMultiplicar);
        panel.add(botonDividir);

        panel.add(botonRaizCuadrada);
        panel.add(botonRaizCubica);
        panel.add(botonLogaritmoNatural);

        panel.add(etiquetaResultado);
        panel.add(campoResultado);

        panel.add(botonLimpiar);

        // Agregar panel a la ventana
        add(panel);
    }
}