/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class EST_SEQ_05 {
    public static void main(String args[]) {
        
        int A = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A", 1));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B", 1));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C", 1));
        
        double delta = (Math.pow(B, 2)) - (4 * A * C);
        double raizDelta = Math.sqrt(delta);
        
        double x1 = ((B * -1) + raizDelta) /(2 * A);
        double x2 = ((B * -1) - raizDelta) / (2 * A);
        
        JOptionPane.showMessageDialog(null, x1, "Raiz Real x'", 1);
        JOptionPane.showMessageDialog(null, x2, "Raiz Real x''", 1);
        
    }
}
