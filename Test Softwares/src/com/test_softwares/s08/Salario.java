package com.test_softwares.s08;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		System.out.println("Quanto você faz por hora?");
		Scanner scan = new Scanner(System.in);
		int ganhoPorHora = scan.nextInt();

		System.out.println("Quantas horas você trabalha por mês?");
		Scanner scan2 = new Scanner(System.in);
		int horasPorMes = scan2.nextInt();

		int result = ganhoPorHora * horasPorMes;
		System.out.println("Você faz $" + result + " por mês");

	}

}
