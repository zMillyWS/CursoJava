import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int num = 0;
        do {
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, num);
                //System.out.println(num);
            }
            num += 1;

        } while (num <= 22);
    }
}
