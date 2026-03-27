package VETORES;

import javax.swing.*;

import java.util.Scanner;

public class VETORES_02 {

    public static int[] carregaVet(int n){
        int vetor[] = new int[n];
        for(int i = 0; i < n; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor: "));
        }
        return vetor;
    }

    public static double mediaVet(int[] vet){
        double soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }
        return soma/vet.length;
    }

    public static int menorValor(int[] vet){
        int menor = 0;
        for(int i = 0; i < vet.length; i++){
            if(i == 0){
                menor = vet[i];
            }else if(menor > vet[i]){
                menor = vet[i];
            }
        }
        return menor;
    }

    public static int maiorValor(int[] vet) {
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                maior = vet[i];
            } else if (maior < vet[i]) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static void main(String args[]){

        int[] vetor = carregaVet(100);

         System.out.println("Média = " + mediaVet(vetor));

         System.out.println("Menor valor = " + menorValor(vetor));
         System.out.println("Maior valor = " + maiorValor(vetor));
    }
}
                                         