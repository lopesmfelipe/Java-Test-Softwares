package com.test_softwares.s35s2;

public class FibonacciSequenceTest {

	public static void main(String[] args) {

		int x = 1;
		int y = 0;
		int auxiliar;
		for (int i = 0; i < 30; i++) { // sequência de fibonacci usando um loop normal
			System.out.println(x);
			auxiliar = x;
			x = x + y;
			y = auxiliar;
		}

	}

}
