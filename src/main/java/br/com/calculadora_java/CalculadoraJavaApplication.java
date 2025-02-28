package br.com.calculadora_java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

		try {
			double resultado = calcular(numero1, numero2, operacao);
			System.out.println("Resultado: " + String.format("%.2f", resultado));
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		scanner.close();
	}

	public double calcular(double numero1, double numero2, int operacao) {
		double resultado;
		switch (operacao) {
			case 1:
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3:
				resultado = numero1 * numero2;
				break;
			case 4:
				if (numero2 == 0) {
					throw new IllegalArgumentException("Não é possível dividir por zero.");
				}
				resultado = numero1 / numero2;
				break;
			default:
				throw new IllegalArgumentException("Operação inválida.");
		}

		return new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
