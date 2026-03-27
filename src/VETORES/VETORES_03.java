package VETORES;

import VETORES.VETORES_02;
public class VETORES_03 {

    public static void main(String args[]){
        int[] vetor1 = VETORES_02.carregaVet(3);
        int[] vetor2 = VETORES_02.carregaVet(3);

        int[] vetor3 = new int[6];

        for(int i = 0; i < 6; i++){
            if(i < 3) {
                vetor3[i] = vetor1[i];
            }else{
                vetor3[i] = vetor2[i-3];
            }
        }

        for(int i = 0; i < 6; i++){
                System.out.print(vetor3[i] + " ");
            }
        }

    }

