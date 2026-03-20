package EST_DEC;/*
Objetivo: Receba o preço atual e a média mensal de um produto.
Calcule e mostre o novo Preço sabendo que:
Venda Mensal       Preço Atual      Preço Novo
< 500              < 30             +10%
>=500 e < 1000     >= 30 e < 80     +15%
>= 1000            >= 80            -5%
Dev: Gustavo O. Andrade
Data: 11/03/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_28 {
    public static void main(String args[]){
        double precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual."));
        double vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a média de venda mensal."));
        double precoNovo = precoAtual;
        if(vendaMensal < 500 && precoAtual < 30){
            precoNovo = precoAtual * 1.1;
        }else if(vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80){
            precoNovo = precoAtual * 1.15;
        }else if(vendaMensal >= 1000 && precoAtual >= 80){
            precoNovo = precoAtual * 0.95;
        }else{
            JOptionPane.showMessageDialog(null, "O preço se manterá o mesmo.");
        }
        JOptionPane.showMessageDialog(null, "Preço: R$" + precoNovo);
    }

}
