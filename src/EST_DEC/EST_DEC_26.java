/*
Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_26 {
    public static void main(String args[]){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º número"));

        if(num1 == num2){
            JOptionPane.showMessageDialog(null,"Os números são iguais.");
        }else{
            if(num1 > num2){
                if(num1 % num2 == 0){
                    JOptionPane.showMessageDialog(null, num1 + " é multiplo de " + num2);
                }else{
                    JOptionPane.showMessageDialog(null, "Não são multiplos");
                }

            }else{
                if(num2 % num1 == 0){
                    JOptionPane.showMessageDialog(null, num2 + " é multiplo de " + num1);
                }else{
                    JOptionPane.showMessageDialog(null, "Não são multiplos");
                }
            }
        }
    }
}
