/*
Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_22 {
    public static void main(String args[]){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));

        if(num1 == num2){
            JOptionPane.showMessageDialog(null, "Os números são iguais!");
        }else{
            if(num1 > num2){
                System.out.println(num2);
                System.out.println(num1);
            }else{
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
