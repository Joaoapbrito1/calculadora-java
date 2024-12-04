import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite o número corresponde a operação");
        int operacao = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        double resultado;

        // Estrutura de controle usando if-else
        if (operacao == 1) {
            resultado = numero1 + numero2;
            System.out.println("Resultado da adição: " + resultado);
        } else if (operacao == 2) {
            resultado = numero1 - numero2;
            System.out.println("Resultado da subtração: " + resultado);
        } else {
            System.out.println("Erro: Operação inválida.");
        }
    }
}