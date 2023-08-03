package br.com.protec;

public class Calculadora {

	
	public int soma(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
	
	public float dividir(float numberOne, float numberTwo)  {
		
		return numberOne / numberTwo;
		
	}
	
	
	public static void main(String[] args) {
	
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma(2, 3) == 5);
		System.out.println(calc.soma(3, 3) == 7);
		System.out.println(calc.soma(5, 6) == 11);
	

	}

}
