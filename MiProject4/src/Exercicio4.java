import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        char resposta = 's';
        do {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
            resposta = JOptionPane.showInputDialog("Quer adicionar mais um número?").toLowerCase().charAt(0);
        } while (resposta != 'n');

        numeros.remove(1);

        int total = 0;
        for (Integer numero : numeros) {
            total += numero;
        }
        JOptionPane.showMessageDialog(null, "A soma desses números é: " + total);
    }
}
