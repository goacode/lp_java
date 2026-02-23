/*
Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_DEC_20 {
    public static void main(String args[]){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do coeficiente C"));
        double delta = (b * b) - (4 * a * c);
        if(delta < 0){
            JOptionPane.showMessageDialog(null, "Não existem raízes reais");

        }else if(delta == 0) {
            double x = (b * (-1)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Uma raiz real igual a " + x);

        }else if(delta > 0) {
            double raizDelta = Math.sqrt(delta);
            double x1 = ((b * (-1)) + raizDelta) / (2 * a);
            double x2 = ((b * (-1)) - raizDelta) / (2 * a);
            JOptionPane.showMessageDialog(null,"Duas raizes reais x' = " + x1 + " e x'' = " + x2);

        }

    }

}
