package com.test_softwares.s35;

public class PlusRecursiveMethod {

	public static int somatorioRecursivo(int n) {
		
		if (n == 1) {
			return 1;
		}
		return n + somatorioRecursivo(n - 1);
		
	}
	
}
