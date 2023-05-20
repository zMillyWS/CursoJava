import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null,"Esse número é par");
        }
        else {
            JOptionPane.showMessageDialog(null,"Esse número é ímpar");
        }
    }
}
