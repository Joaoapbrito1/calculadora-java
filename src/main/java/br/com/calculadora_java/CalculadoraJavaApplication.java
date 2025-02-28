package br.com.calculadora_java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraJavaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		double numero1 = scanner.nextDouble();

		System.out.println("Escolha a operação:");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Digite o número correspondente à operação:");
		int operacao = scanner.nextInt();

		System.out.println("Digite o segundo número:");
		double numero2 = scanner.nextDouble();

		double resultado;
		switch (operacao) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("Resultado da adição: " + resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("Resultado da subtração: " + resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("Resultado da multiplicação: " + resultado);
				break;
			case 4:
				if (numero2 == 0) {
					System.out.println("Erro: Não é possível dividir um número por zero.");
				} else {
					resultado = numero1 / numero2;
					System.out.println("Resultado da divisão: " + resultado);
				}
				break;
			default:
				System.out.println("Erro: Operação inválida.");
		}

		scanner.close();
	}
}
