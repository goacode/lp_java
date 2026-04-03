/*
Criar e carregar uma matriz [4][4] com valores aleatórios,
sendo que a diagonal principal terá seus dados 4 ^ n.
 */
package MATRIZES;

import java.util.Random;

public class MATRIZES_01 {
    public static void main(String args[]){

        Random gera = new Random();
        int matriz[][] = new int[4][4];
        String mostra = "";
        for(int i = 0; i < 4;i++){
            for(int u = 0; u < 4;u++){
                if(u == i){
                    int e = (int)(Math.pow(4, u));
                    matriz[i][u] = e;
                }else{
                    matriz[i][u] = gera.nextInt(100);
                }
                System.out.printf("%3d ", matriz[i][u]);
                mostra += (matriz[i][u] + " ");
            }
            System.out.print("\n");
            mostra += ("\n");
        }
        System.out.print("\n");
        System.out.print(mostra);

    }
}