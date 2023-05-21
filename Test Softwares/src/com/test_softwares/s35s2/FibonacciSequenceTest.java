package com.test_softwares.s35s2;

public class FibonacciSequenceTest {

	public static void main(String[] args) {

		// sequência de fibonacci usando um loop normal
		int x = 1;
		int y = 0;
		int auxiliar;
		for (int i = 0; i < 5; i++) {  
			System.out.println(x);
			auxiliar = x;
			x = x + y;
			y = auxiliar;
		}

		// sequência de fibonacci usando um método recursivo
		for (int i = 0; i < 5; i++) {
			System.out.print(FibonacciSequence.fibonacci(i) + " "); // sequência de fibonacci usando um método recursivo
		}
		
		
	}

}
