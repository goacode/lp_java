/*
Criar uma matriz [8][8] inteiro e o programa irá carregar segundo em camdas começando com 1

 */
package MATRIZES;

public class MATRIZES_03 {
    public static void main(String args[]){

        int matriz[][] = new int[8][8];

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                //Distancias para saída da matriz
                int saidas[] = {i + 1, j + 1, 8 - i, 8 - j};


                //Calcula qual a menor distancia para saída da matriz
                int menor_saida = saidas[0];
                for(int k = 0; k < 4; k ++){
                    if(saidas[k] < menor_saida){
                        menor_saida = saidas[k];
                    }
                }

            matriz[i][j] = menor_saida;

            }
        }

        //Imprime a Matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%1d ", matriz[i][j]);

            }
            System.out.println();
        }
    }
}
