/*
Objetivo: Retorne a Serie = (1 + 2 + 3 + ... + 100)
Dev: Gustavo O. Andrade
Data: 12/03/2026
 */
public class RECURSIVIDADE_01 {

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

        int resultado = soma_serie(100);
        System.out.println(resultado);

    }
}


