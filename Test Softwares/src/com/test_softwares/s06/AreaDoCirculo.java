package com.test_softwares.s06;

import java.util.Scanner;
import java.lang.Math;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Para calcular a área do círculo, informe o valor do raio em centímetros: ");
		
		double raio = scanner.nextDouble();
		double area = 3.14 * (Math.pow(raio, 2));
		
		System.out.println("A área do círculo é: " + area + "cm²");
		
	}

}
