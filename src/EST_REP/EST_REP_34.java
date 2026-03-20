package EST_REP;
/*
Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
Dev: Gustavo O. Andrade
Data: 19/03/2026
 */
import javax.swing.JOptionPane;
public class EST_REP_34 {
    public static void main(String args[]){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número para obter a tabuada"));
        for(int i = 1; i < 11; i++){
            int tabuada = n * i;
            System.out.println(n + " x " + i + " = " + tabuada);
        }
    }
}
