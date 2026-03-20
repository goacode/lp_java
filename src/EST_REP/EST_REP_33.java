package EST_REP;
/*
Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Dev: Gustavo O. Andrade
Data: 19/03/2026
 */
import javax.swing.JOptionPane;
public class EST_REP_33 {
    public static void main(String args[]){
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira o N da série"));
        double soma = 0;
        for(double i = 1; i <= n; i++){
            soma = soma + 1/i;
        }

        JOptionPane.showMessageDialog(null, "Total série = " + soma);
    }
}
