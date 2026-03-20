/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class EST_SEQ_06 {
    
    public static void main(String args[]) {
        
        double X = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de X"));
        double Y = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de Y"));
        double aux;
        
        aux = X;
        X = Y;
        Y = aux;
        
        JOptionPane.showMessageDialog(null, X, "Novo valor de X", 2);
        JOptionPane.showMessageDialog(null, Y, "Novo valor de Y", 2);
        
    }
}
