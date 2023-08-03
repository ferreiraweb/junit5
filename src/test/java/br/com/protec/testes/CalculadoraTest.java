package br.com.protec.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.protec.Calculadora;

public class CalculadoraTest {

	
	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		calc.soma(2, 3);
		
		Assertions.assertTrue(calc.soma(2, 3) == 5);
		Assertions.assertEquals(5,  calc.soma(2,3));
	}
	
	@Test
	public void deveRetornarNumeroInteiroNaDivisao() {
		Calculadora calc = new Calculadora();
		Assertions.assertEquals(3.33, calc.dividir(10, 3), 0.01);
	}
	
	@Test
	public void deveLancarExcecaoQuandoDividirPorZero_JUnit4() {
		try {
			float resultado = 10 / 0;
			Assertions.fail("Deveria ter sido lançado uma exceção na divisão");
		} catch (ArithmeticException e) {
			Assertions.assertEquals("/ by zero", e.getMessage());
		}
	}
	
	@Test
	public void deveLancarExcecaoQuandoDividirPorZero_JUnit5() {
		ArithmeticException assertThrows = Assertions.assertThrows(ArithmeticException.class, () -> {
			float resultado = 10 / 0;
		});
		
		Assertions.assertEquals("/ by zero", assertThrows.getMessage());
	}
	
}
