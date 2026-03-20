/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class EST_SEQ_08 {
    public static void main(String args[]) {
        
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do depósito"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira os meses de rendimento"));
        
        double montante = deposito * (Math.pow(1.013, meses));
        
        JOptionPane.showMessageDialog(null, "O rendimento total foi de " + montante, "Rendimento Total em " + meses + " meses", 2);
    }
}
