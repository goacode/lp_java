package EST_REP;
/*
Objetivo:Receba a data de nascimento e atual em ano, mês e dia.
Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
Dev: Gustavo O. Andrade
Data: 19/03/2026
 */
import javax.swing.JOptionPane;
public class EST_REP_30 {
    public static void main(String args[]){
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento?"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de Nascimento?"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de Nascimento?"));

        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Ano de Atual?"));
        int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Mês de Atual?"));
        int diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Dia de Atual?"));

        while(ano != anoAtual){

        }

    }
}
