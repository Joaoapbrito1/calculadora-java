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
}