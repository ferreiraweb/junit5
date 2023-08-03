package br.com.protec.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.protec.Calculadora;

public class CalculadoraTest {

	private Calculadora calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calculadora();
	}
	
	@AfterEach
	public void eachTest() {
	  System.out.println("each");
	  
	}
	
	@Test
	public void testSomar() {
		
		calc.soma(2, 3);
		
		Assertions.assertTrue(calc.soma(2, 3) == 5);
		Assertions.assertEquals(5,  calc.soma(2,3));
	}
	
	@Test
	public void deveRetornarNumeroInteiroNaDivisao() {
		
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
