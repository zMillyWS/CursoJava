import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (A): "));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (B)"));

        if ((numA % numB == 0) && (numB % numA == 0)){
            JOptionPane.showMessageDialog(null, "São múltiplos");
        }
        else {
            JOptionPane.showMessageDialog(null,"Não são núltiplos");
        }
    }
}
