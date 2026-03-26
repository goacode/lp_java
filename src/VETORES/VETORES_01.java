package VETORES;


import javax.swing.*;
public class VETORES_01 {
    public static void main(String args[]){
        int vetor[] = new int[50];
        int somaImpar = 0;
        int soma = 0;
        int cont = 0;
        for(int i = 0; i < 50; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição " + i));
            System.out.println(vetor[i]);
            if(vetor[i] % 2 != 0){
                somaImpar = somaImpar + vetor[i];
            }

            if(vetor[i] >= 10 && vetor[i] <= 200){
                soma = soma + vetor[i];
                cont++;
            }
        }

        double media = soma/cont;

        System.out.println("Soma Impares = " + somaImpar);
        System.out.println("Média entre 10 e 200 = " + media);
    }
}
