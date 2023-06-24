import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        String horario = JOptionPane.showInputDialog("Digite um horário (hh:mm:ss): ");
        String[] listHora = (horario.split(":", 3));

        int hora = Integer.parseInt(listHora[0]);
        int min = Integer.parseInt(listHora[1]);
        int seg = Integer.parseInt(listHora[2]);

        int horaMin = hora * 60;
        int minSeg = (min + horaMin) * 60;
        int segTotal = seg + minSeg;

        JOptionPane.showMessageDialog(null, "Isso da " + segTotal + " segundos no total.");
    }
}
