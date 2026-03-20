package EST_REP;
/*
Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
Dev: Gustavo O. Andrade
Data: 19/03/2026
 */
import javax.swing.JOptionPane;
public class EST_REP_32 {
    public static void main(String args[]){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para calcular seu fatorial"));
        int resultado = 1;
        for(n = n; n > 1; n--){
            resultado = resultado * n;

        }
        JOptionPane.showMessageDialog(null, "O fatorial é " + resultado);
    }
}
