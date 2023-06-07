package com.test_softwares.s09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversion {

	public static void convertToCelsius() {

		Scanner scanner01 = new Scanner(System.in);
		System.out.println("Report the temperature in degrees fahrenheit");
		
		DecimalFormat df = new DecimalFormat("###.##");
		double fahrenheit = scanner01.nextDouble();
		double celsius = 5 * (fahrenheit - 32) / 9;

		System.out.println("The temperature reported is " + df.format(celsius) + " degrees celsius");
	}

}
