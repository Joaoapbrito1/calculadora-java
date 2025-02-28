package br.com.calculadora_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraJavaApplicationTests {

	private final CalculadoraJavaApplication calculadora = new CalculadoraJavaApplication();

	@Test
	void testSoma() {
		double resultado = calculadora.calcular(10.25, 5.75, 1);
		assertEquals(16.00, resultado, 0.01, "O resultado da soma está incorreto!");
	}

	@Test
	void testSubtracao() {
		double resultado = calculadora.calcular(10.25, 5.75, 2);
		assertEquals(4.50, resultado, 0.01, "O resultado da subtração está incorreto!");
	}

	@Test
	void testMultiplicacao() {
		double resultado = calculadora.calcular(4.35, 4.26, 3);
		assertEquals(18.52, resultado, 0.02, "O resultado da multiplicação está incorreto!");
	}

	@Test
	void testDivisao() {
		double resultado = calculadora.calcular(10.0, 4.0, 4);
		assertEquals(2.50, resultado, 0.01, "O resultado da divisão está incorreto!");
	}

	@Test
	void testDivisaoPorZero() {
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
				calculadora.calcular(10.0, 0.0, 4)
		);
		assertEquals("Não é possível dividir por zero.", exception.getMessage());
	}

	@Test
	void testOperacaoInvalida() {
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
				calculadora.calcular(10.0, 5.0, 99)
		);
		assertEquals("Operação inválida.", exception.getMessage());
	}
}