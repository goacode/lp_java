/*
Objetivo: Este programa deve receber 2 números reais, calcular e mostrar a diferença desses valores.
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_10 {

    public static void main(String args[]) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do primeiro número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do segundo número"));

        double diferenca = numero1 - numero2;

        System.out.println("A diferença entre " + numero1 + " e " + numero2 + " é igual a " + diferenca);
    }
}
