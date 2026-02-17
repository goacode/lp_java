/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;

public class EST_SEQ_07 {
    public static void main(String args[]){
        
        int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a largura"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a altura"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o comprimento"));
        int volume = largura * comprimento * altura;
        
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é igual a " + volume, "Volume Total", 1);
    }
}
