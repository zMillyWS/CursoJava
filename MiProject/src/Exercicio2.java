//Exercício 2
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("Digite o valor do raio de um círculo:"); // Pede um número
        Scanner raio = new Scanner(System.in); // Faz input do número
        int raioint = raio.nextInt(); // Transforma em int
        double area = pi * (raioint * raioint); // Calculo do resultado

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        String roundOff = df.format(area); // Faz com que tenha apenas 2 casas após o ponto

        System.out.println("O valor da area deste circulo é: "+ roundOff); // Printa o resultado
    }
}
