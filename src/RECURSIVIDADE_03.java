/*
Objetivo: Retorne a Serie = ( (1/1) + (1/2) + (1/3) + ... + (1/N) )
Dev: Gustavo O. Andrade
Data: 12/03/2026
 */
import javax.swing.JOptionPane;
public class RECURSIVIDADE_03 {

    public static double soma_serie(double num){
        double soma;
        if(num > 1){
            soma = (1/num) + soma_serie(num - 1);
            return soma;
        }else{
            return 1;
        }

    }

    public static void main(String args[]) {

        double valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do denominador final"));
        double resultado = soma_serie(valor);
        System.out.println(resultado);

    }
}
