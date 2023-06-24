import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota dessa aluno: "));
        }

        double media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5;

        JOptionPane.showMessageDialog(null, "A média das notas desses alunos é: " + media);
        JOptionPane.showMessageDialog(null, "Estes alunos tiraram nota maior que a média:");

        for (int j = 0; j < 5; j++){
            if( notas[j] > media) {
                JOptionPane.showMessageDialog(null, nomes[j]);
            }
        }
    }
}
