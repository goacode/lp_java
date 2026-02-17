/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class EST_SEQ_03 {
    
    public static void main(String args[]) {
    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base do Triangulo"));
    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura do Triangulo"));
    double area = base * altura;
    
    JOptionPane.showMessageDialog(null, "A area do triangulo é igual a " + area);
    
}

}