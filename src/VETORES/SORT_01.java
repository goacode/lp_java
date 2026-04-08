package VETORES;

import java.util.Random;
public class SORT_01 {
    public static void main(String args[]){

        Random random = new Random();

        int vetor[] = new int[100];

        for(int i = 0; i < 100; i++){
            vetor[i] = random.nextInt(1000);
        }

        for(int i = 0; i < 99; i++){
            for(int j = 0; j < 99 - i; j++){

                if(vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        for(int i = 0; i < 100; i++){
            System.out.printf(vetor[i] + " ");
        }
    }
}
