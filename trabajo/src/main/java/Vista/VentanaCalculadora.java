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

public class VentanaCalculadora extends JFrame {
    public JTextField campoPrimerNumero;
    public JTextField campoSegundoNumero;
    public JTextField campoResultado;

    public VentanaCalculadora() {

        setTitle("Calculadora MVC");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        campoPrimerNumero = new JTextField();
        campoSegundoNumero = new JTextField();
        campoResultado = new JTextField();
        
        campoResultado.setEditable(false);
    }
}
