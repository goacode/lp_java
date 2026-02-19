/*
Objetivo:Este programa deve receber 2 números INTEIROS, calcular e mostrar a soma de seus quadrados
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_09 {
    public static void main(String args[]){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número"));

        double somaQuadrado = Math.pow(numero1, 2) + Math.pow(numero2, 2);

        JOptionPane.showMessageDialog(null,"A soma do quadrado de ambos os números é " + somaQuadrado, "Soma Total", 2);
    }

}
