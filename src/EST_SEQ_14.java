/*
Objetivo:
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_14 {
    public static void main(String args[]){
        double angulo1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor em graus do primeiro angulo", "Primeiro Angulo", 1));
        double angulo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor em graus do segundo angulo", "Segundo Angulo", 1));

        double angulo3 = 180 - (angulo1 + angulo2);

        JOptionPane.showMessageDialog(null, "O terceiro angulo tem " + (int) angulo3 + " graus");

    }
}
