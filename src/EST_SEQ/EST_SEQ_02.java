/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;

public class EST_SEQ_02 {
    public static void main(String args[]) {
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário"));
        double salarioReajustado = salario * 1.15;
                
        JOptionPane.showMessageDialog(null, "Salário reajustado é igual a " + salarioReajustado);
        
    }
}
