import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int qtd = 0;
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                JOptionPane.showMessageDialog(null, i);
                qtd += 1;
            }

        }
        JOptionPane.showMessageDialog(null, "O número " + N + " contém " + qtd + " divisores.");

    }
}
