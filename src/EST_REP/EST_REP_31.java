package EST_REP;
/*
Objetivo:Calcule e mostre o quadrado dos números entre 10 e 150.
Dev: Gustavo O. Andrade
Data: 19/03/2026
 */
public class EST_REP_31 {
    public static void main(String args[]){
        for(int num = 10; num < 151; num++){
            int quadrado = num * num;
            System.out.println("O quadrado de " + num + " é igual a " + quadrado);
        }
    }
}
