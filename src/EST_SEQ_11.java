/*
Objetivo: Receba o valor do raio de uma circunferencia e calcule o comprimento
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_11 {

    public static void main(String args[]) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio em centímetros"));
        double comprimento = (raio * Math.PI);

        System.out.printf("A circunferencia mede ");
        System.out.printf("%.2f", comprimento);
        System.out.println(" centímetros");
    }
}
