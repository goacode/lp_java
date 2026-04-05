/*
Carregue uma matriz como tabuleiro de xadrez e faça a soma das peças
Peão = 1
Torre = 2
Bispo = 3
Cavalo = 4
Rainha = 5
Rei = 6
Vazio = 7

 */
package MATRIZES;

public class MATRIZES_04 {
    public static void main(String args[]) {


        int tabuleiro[][] = {
                {2, 4, 3, 5, 6, 3, 4, 2},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7, 7, 7, 7},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {2, 4, 3, 5, 6, 3, 4, 2}
        };

        int vetor_soma[] = {0, 1, 2, 3, 4, 5, 6, 0};
        int soma = 0;
        for(int i = 0; i < 8; i++) {
           for(int j = 0; j < 8; j++){
                soma += vetor_soma[tabuleiro[i][j]];
           }
        }
        System.out.println("Soma total das peças é " + soma);
    }

}