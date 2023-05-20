import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        if (valor > 0 && valor <= 25){
            JOptionPane.showMessageDialog(null, "Primeiro intervalo [0-25]");
        } else if (valor > 25 && valor <= 50){
            JOptionPane.showMessageDialog(null, "Segundo intervalo [25-50]");
        }
        else if (valor > 50 && valor <= 75){
            JOptionPane.showMessageDialog(null, "Terceio intervalo [50-75]");
        }
        else if (valor > 75 && valor <= 100){
            JOptionPane.showMessageDialog(null, "Quarto intervalo [75-100]");
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor fora de intervalo");
        }
    }
}
