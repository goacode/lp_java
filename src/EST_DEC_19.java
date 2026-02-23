/*
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_19 {
    public static void main(String args[]){
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));

        if(valor1 > valor2){
            JOptionPane.showMessageDialog(null,"O maior valor é " + valor1);
        }else if(valor2 > valor1){
            JOptionPane.showMessageDialog(null, "O maior valor é " + valor2);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos valores são iguais.");
        }
    }
}
