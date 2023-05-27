import javax.swing.*;
public class Exercicio4 {
    public static void main(String[] args) {

        boolean repetir = true;
        int alcool = 0, gasolina = 0, diesel = 0;

        while (repetir) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("""
                    Escolha de 1 a 4:\s
                    1. Alcool\s
                    2. Gasolina\s
                    3. Diesel\s
                    4. Sair"""));

            switch (menu) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                case 4 -> repetir = false;
            }
        }
        JOptionPane.showMessageDialog(null, "MUITO OBRIGADO \nAlcool: " + alcool +
                "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
}