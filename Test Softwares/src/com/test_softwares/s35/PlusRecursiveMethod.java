package com.test_softwares.s35;

public class PlusRecursiveMethod {

	public static int somatorioRecursivo(int n) {
		
		int soma = n;
		if (soma == 1) {
			return soma;
		}
		return soma + somatorioRecursivo(n - 1);
		
	}
	
}
