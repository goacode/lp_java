/*
Objetivo: Receba uma quantidade xKg de alimentos e calcule quantos dias durará sabendo que são consumidos 50g por dia.
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_13 {
    public static void main(String args[]) {

        double comida = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos Kgs de alimentos há?"));
        double dias = comida / 0.05;

        JOptionPane.showMessageDialog(null, "Você possui mais " + dias + " dias de alimento!", "DIAS RESTANTES", 2);
    }
}
