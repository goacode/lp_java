/*
Objetivo: Receba o investimento (1 = Poupança e 2 = Renda Fixa) e o valor do investimento.
Calcule e mostre o valor corrigido em 30 dias sabendo que
Poupançã = 3% e Renda Fixa = 5%.
Demais tipos não serão considerados.
Dev: Gustavo O. Andrade
Data: 11/03/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_29 {
    public static void main(String args[]){
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Investimento\n1 - Poupança\n2 - Renda Fixa"));

        if(escolha != 1 && escolha != 2){
            JOptionPane.showMessageDialog(null,"Escolha invalida tente novamente.");

        }else{

            double aporte = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor investido"));
            double montante = aporte;

            if(escolha == 1){
                montante = montante * 1.03;
            }else if(escolha == 2){
                montante = montante * 1.05;
            }

            JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias é de R$" + montante);
        }





    }
}
