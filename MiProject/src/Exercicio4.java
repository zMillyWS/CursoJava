import java.util.Scanner;

//Exercicio4
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Digite o número de horas trabalhadas:"); // Pede um número
        Scanner number1 = new Scanner(System.in); // Faz input do número
        int horas = number1.nextInt(); // Converte o Scan para int

        System.out.println("Digite o valor que recebe por horas trabalhadas:"); // Pede um número
        Scanner number2 = new Scanner(System.in); // Faz input do número
        double valor = number2.nextDouble(); // Converte o Scan para int

        double calculo = horas * valor;

        System.out.printf("Este funcionário trabalho "+ horas + "horas e deve receber um salário de R$" + "%.2f",
                calculo);
        // Printa o resultado
    }
}
