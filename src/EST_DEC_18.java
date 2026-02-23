/*
Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_18{
    public static void main(String args[]) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
        int diferenca = 0;
        if(valor1 == valor2){
            JOptionPane.showMessageDialog(null, "Os valores são iguais!");
        }else{
            if(valor1 > valor2){
                diferenca = valor1 - valor2;
            }else{
                diferenca = valor2 - valor1;
            }
            JOptionPane.showMessageDialog(null,"A diferença do menor valor para o menor valor é " + diferenca);
        }



    }
}
