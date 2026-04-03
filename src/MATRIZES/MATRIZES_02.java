/*
10.	Criar uma matriz [8][8] onde o programa irá carregar segundo:
casa 1 = 1
casa 2 = 2
casa 3 = 4
casa 4 = 8...
 */
package MATRIZES;

public class MATRIZES_02 {

    public static void main(String args[]) {
        long matriz[][] = new long[8][8];
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = (long) Math.pow(2, cont);
                cont++;
            }
        }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.printf("%19d ", matriz[i][j]);

                }
               System.out.println();
            }

        }

    }