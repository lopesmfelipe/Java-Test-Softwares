package com.test_softwares.s35s2;

public class FibonacciSequence {

	public static int fibonacci(int n) {

		if (n < 2)return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

}
