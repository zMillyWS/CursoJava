import java.util.Scanner;

// Exercicio 5
public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Qual seu nome?");
        Scanner nome = new Scanner(System.in);
        String nomedocara = nome.nextLine();

        System.out.println("Qual seu peso?");
        Scanner peso = new Scanner(System.in);
        double pesodocara = peso.nextDouble();

        System.out.println("Qual sua altura?");
        Scanner altura = new Scanner(System.in);
        double alturadocara = altura.nextDouble();

        double imc = pesodocara / (alturadocara * alturadocara);


        System.out.printf( nomedocara + ", seu IMC é " + "%.2f", imc);

    }
}
