/*
Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_21 {
    public static void main(String args[]){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota"));

        double media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 6){
            JOptionPane.showMessageDialog(null, "APROVADO!");
        }else if(media >= 3){
            JOptionPane.showMessageDialog(null, "EXAME!");
        }else if(media < 3){
            JOptionPane.showMessageDialog(null, "RETIDO!");
        }
    }
}
