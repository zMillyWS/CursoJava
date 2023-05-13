import java.util.Scanner;

//Exercicio3
public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite um número (A):"); // Pede um número
        Scanner number1 = new Scanner(System.in); // Faz input do número
        int a = number1.nextInt(); // Converte o Scan para int

        System.out.println("Digite um número (B):"); // Pede um número
        Scanner number2 = new Scanner(System.in); // Faz input do número
        int b = number2.nextInt(); // Converte o Scan para int

        System.out.println("Digite um número (C):"); // Pede um número
        Scanner number3 = new Scanner(System.in); // Faz input do número
        int c = number3.nextInt(); // Converte o Scan para int

        System.out.println("Digite um número (D):"); // Pede um número
        Scanner number4 = new Scanner(System.in); // Faz input do número
        int d = number4.nextInt(); // Converte o Scan para int

        int diferenca = a * b - c * d; // Faz o calculo

        System.out.println("A diferenca desses números é: "+ diferenca); // Printa o resultado
    }
}
