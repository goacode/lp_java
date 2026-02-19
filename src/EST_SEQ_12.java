/*
Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a idade e quantos anos terá daqui a 17 anos.
Dev: Gustavo O. Andrade
Data: 19/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_12 {

    public static void main(String args[]) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de nascimento"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano atual"));

        int idade = anoAtual - anoNascimento;
        int idadeFutura = idade + 17;

        JOptionPane.showMessageDialog(null, "Você possui " + idade + " ano(s) e tera " + idadeFutura + " daqui 17 anos!");

    }
}
