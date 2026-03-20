/*
Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_27 {
    public static void main(String args[]){

        int numeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de voltas"));
        double extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em metros)"));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração (em minutos)"));

        double percursoTotal = numeroVoltas * extensaoCircuito;
        double percursoTotalkm = percursoTotal / 1000;
        double tempoHoras = tempo / 60;

        double velocidadeMedia = percursoTotalkm / tempoHoras;

        JOptionPane.showMessageDialog(null, "A velocidade média foi de " + velocidadeMedia + "km/h.");
    }

}
