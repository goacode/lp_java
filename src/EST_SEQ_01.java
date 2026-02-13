/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class EST_SEQ_01 {
    
    public static void main(String args[]) {
        
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Qual o lado do quadrado? (cm)"));
        int area = lado * lado;
        
        JOptionPane.showConfirmDialog(null, "A área é igual a " + area);
    }
}
