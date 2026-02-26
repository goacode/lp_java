/*
Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_23 {
    public static void main(String args[]){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1º Valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2º Valor"));

        if(valor1 > valor2) {
            JOptionPane.showMessageDialog(null,"Valor não está em ordem crescente!");
        }else {
            int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 3º Valor"));

            if(valor2 > valor3){
                JOptionPane.showMessageDialog(null,"Valor não está em ordem crescente!");
            }else{
                int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 4º Valor"));

                if(valor4 > valor3){
                    JOptionPane.showMessageDialog(null, "Valores = " + valor1 + " " + valor2 + " " + valor3 + " " + valor4);
                }

                if(valor4 > valor2 && valor4 < valor3){
                    JOptionPane.showMessageDialog(null, "Valores = " + valor1 + " " + valor2 + " " + valor4 + " " + valor3);
                }

                if(valor4 > valor1 && valor4 < valor2){
                    JOptionPane.showMessageDialog(null, "Valores = " + valor1 + " " + valor4 + " " + valor2 + " " + valor3);
                }

                if(valor4 < valor1){
                    JOptionPane.showMessageDialog(null, "Valores = " + valor4 + " " + valor1 + " " + valor2 + " " + valor3);
                }
            }
        }





    }
}
