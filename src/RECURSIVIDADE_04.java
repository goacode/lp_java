/*
Objetivo: Retorne a Serie = ( (N/1) + (N-1/2) + (N-2/3) + ... + (1/N) )
Dev: Gustavo O. Andrade
Data: 12/03/2026
 */
import javax.swing.JOptionPane;
public class RECURSIVIDADE_04 {

    public static double soma_serie(double num, double divisor){
        double soma;
        if(num > 1){
            soma = (num/divisor) + soma_serie(num - 1, divisor + 1);
            return soma;
        }else{
            return (1/divisor);
        }

    }

    public static void main(String args[]) {

        double valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do denominador final"));
        double resultado = soma_serie(valor, 1);
        System.out.println(resultado);

    }
}
