/*
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
Calcule o salário que serão as horas trabalhadas x o valor por hora.
Calcule o salário líquido (= Salário Bruto – desconto).
A cada dependente será acrescido R$ 100 no Salário Líquido.
Exiba o salário a receber.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */

import javax.swing.JOptionPane;
public class EST_SEQ_16 {
    public static void main(String args[]){
        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhda"));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor percentual do desconto (%)"));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de dependentes"));

        double salarioBruto = horasTrabalhadas * valorHora;
        double salarioLiquido = salarioBruto - (salarioBruto * (percentualDesconto / 100));
        double salarioTotal = salarioLiquido + (dependentes * 100);

        JOptionPane.showMessageDialog(null, "Você tem a receber um total de R$" + salarioTotal);
    }
}
