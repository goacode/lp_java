/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
import javax.swing.JOptionPane;
public class EST_SEQ_04 {
    public static void main(String args[]) {
        
        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a temperatura em Celsius ºC"));
        double fahrenheit = ((celsius * 9) + 160) / 5;
        
        JOptionPane.showMessageDialog(null, fahrenheit + "ºF", "Graus Fahrenheit", 1);
        
    }
}
