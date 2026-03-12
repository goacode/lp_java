/*
Objetivo: Retorne a Serie = (N + (N - 1) + (N - 2) + ... + 1)
Dev: Gustavo O. Andrade
Data: 12/03/2026
 */
import javax.swing.JOptionPane;
public class RECURSIVIDADE_02 {

    public static int soma_serie(int num){
        int soma;
        if(num > 1){
            soma = num + soma_serie(num - 1);
            return soma;
        }else{
            return 1;
        }

    }

    public static void main(String args[]) {

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor final da sequencia que deseja somar"));
        int resultado = soma_serie(valor);
        System.out.println(resultado);

    }
}
