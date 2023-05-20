import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (num < 0){
            JOptionPane.showMessageDialog(null, "Esse número é negativo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Esse número é positivo");
        }
    }
}
