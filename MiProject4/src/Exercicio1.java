import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 1000"));
        if (valor >= 1 & valor <= 1000) {
            for (int i = 1; i <= valor; i++) {
                if (!(i % 2 == 0)) {
                    JOptionPane.showMessageDialog(null, i);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Valor não está entre 1 e 1000, tente novamente");
        }
    }
}
