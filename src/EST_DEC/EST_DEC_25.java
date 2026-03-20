/*
Objetivo: Receba a hora de início e de final de um jogo (HH,MM)
sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
Dev: Gustavo O. Andrade
Data: 26/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_25 {
    public static void main(String args[]) {

        int tempoHora = 0;
        int tempoMinuto = 0;

        int horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de inicio"));
        int minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de inicio"));

        int horaFim = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora do fim"));
        int minutoFim = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto do fim"));

        if(minutoFim < minutoInicio){
            minutoFim += 60;
            if(horaInicio == 23){
                horaInicio = 0;
            }else{
                horaInicio +=1;
            }
        }

        if(horaFim < horaInicio){
            tempoHora = (24 - horaInicio) + horaFim;
        }else{
            tempoHora = horaFim - horaInicio;
        }

        tempoMinuto = minutoFim - minutoInicio;

        if(tempoMinuto == 0 && tempoHora == 0){
            JOptionPane.showMessageDialog(null, "O jogo teve um total de 24 horas");
        }else{
            JOptionPane.showMessageDialog(null, "O jogo teve um total de " + tempoHora + " horas e " + tempoMinuto + " minutos");
        }

    }
}
