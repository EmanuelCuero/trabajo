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

public class VentanaCalculadora extends JFrame {
    
    public JTextField campoPrimerNumero;
    public JTextField campoSegundoNumero;
    public JTextField campoResultado;
    
    public JButton botonSumar;
    public JButton botonRestar;
    public JButton botonMultiplicar;
    public JButton botonDividir;
    
    public JButton botonRaizCuadrada;
    public JButton botonRaizCubica;
    public JButton botonLogaritmoNatural;

    public VentanaCalculadora() {

        setTitle("Calculadora MVC");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        campoPrimerNumero = new JTextField();
        campoSegundoNumero = new JTextField();
        campoResultado = new JTextField();
        
        campoResultado.setEditable(false);
        
        botonSumar = new JButton("Sumar");
        botonRestar = new JButton("Restar");
        botonMultiplicar = new JButton("Multiplicar");
        botonDividir = new JButton("Dividir");
        
        botonRaizCuadrada =
        new JButton("Raiz cuadrada");

        botonRaizCubica =
        new JButton("Raiz cubica");

        botonLogaritmoNatural =
        new JButton("Logaritmo natural");
    }
}
