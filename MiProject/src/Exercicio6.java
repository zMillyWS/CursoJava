import java.util.Scanner;

// Exercicio 6
public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Digite o valor em graus Fahrenheit:");
        Scanner fahrenheit = new Scanner(System.in);
        int fah = fahrenheit.nextInt();

        int calculo = ((fah - 32) * 5) / 9;

        System.out.println(fah + " graus Fahrenheit equivale a " + calculo + " graus Celsius");
    }
}
