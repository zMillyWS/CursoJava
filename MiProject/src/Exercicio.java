//Exercício 1
import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Digite um número:"); // Pede um número
        Scanner number1 = new Scanner(System.in); // Faz input do número
        int num1 = number1.nextInt(); // Converte o Scan para int


        System.out.println("Digite outro número:"); // Pede outro número
        Scanner number2 = new Scanner(System.in); // Faz input do número
        int num2 = number2.nextInt(); // Converte o Scan para int

        System.out.println("A soma desses dois números é: "+ (num1 + num2)); // Printa o resultado
    }
}
