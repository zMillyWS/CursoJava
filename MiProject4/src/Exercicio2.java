import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
        int[] lista = new  int[valor];
        for (int i = 0; i < valor; i++){
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }
        for (int j = 0; j < valor; j++){
            if (lista[j] >= 10 & lista [j] <= 20){
                JOptionPane.showMessageDialog(null, lista[j] + " = in");
            } else {
                JOptionPane.showMessageDialog(null, lista[j] + " = out");
            }
        }
    }
}
