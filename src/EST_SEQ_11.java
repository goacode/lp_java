/*
Objetivo: Receba o valor do raio de uma circunferencia e calcule o comprimento
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_11 {

    public static void main(String args[]) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da circunferência em centímetros"));
        double comprimento = (raio * Math.PI);

        System.out.println("A circunferência tem um comprimento total de " + comprimento + "cm");
    }
}
