/*
Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_SEQ_17 {
    public static void main(String args[]){
        double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de percurso em horas"));
        double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média em km/h"));
        double percursoTotal = tempoPercurso * velocidadeMedia;
        double litros = percursoTotal / 12;

        JOptionPane.showMessageDialog(null, "Foram gastos " + litros + " litros");

    }

}
