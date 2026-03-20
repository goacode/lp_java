/*
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Dev: Gustavo O. Andrade
Data: 23/02/2026
 */
import javax.swing.JOptionPane;
public class EST_SEQ_15 {
    public static void main(String args[]){
        int catetoadj = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do Cateto Adjacente"));
        int catetoopo = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do Cateto Oposto"));
        double catetoquadrado = Math.pow(catetoadj, 2) + Math.pow(catetoopo, 2);
        double hipotenusa = Math.sqrt(catetoquadrado);

        JOptionPane.showMessageDialog(null, "A hipotenusa vale " + hipotenusa);
    }
}
