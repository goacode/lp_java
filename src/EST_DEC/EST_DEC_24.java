/*
Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_24 {
    public static void main(String args[]){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor"));

        if(valor % 2 == 0){
            JOptionPane.showMessageDialog(null, "É divisivel por 2");
        }else{
            JOptionPane.showMessageDialog(null, "Não é divisivel por 2");
        }

        if(valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "É divisivel por 3");
        }else{
            JOptionPane.showMessageDialog(null, "Não é divisivel por 3");
        }

    }

}
