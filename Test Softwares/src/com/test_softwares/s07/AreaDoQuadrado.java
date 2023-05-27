package com.test_softwares.s07;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Para calcular a área do quadrado, informe o tamanho de seus lados: ");

		double ladoDoQuadrado = scan.nextDouble();
		double area = Math.pow(ladoDoQuadrado, 2);
		double dobroDaArea = area * 2;

		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro dessa área é: " + dobroDaArea);

	}

}
