package Ejer_10_19;

import java.util.Scanner;

public class Ejer15 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula cual es el mayor, mediano y menor de tres números que se piden por
	 * teclado
	 */
	public static void main(String[] args) {

		int num1, num2, num3;

		System.out.println("Dame un numero: ");
		num1 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num2 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num3 = sc.nextInt();

		if ((num1 > num2) && (num1 > num3)) {
			if (num2 > num3) {
				System.out.println("Mayor: " + num1 + ". Mediano: " + num2 + ". Pequeño: " + num3);
			} else {
				System.out.println("Mayor: " + num1 + ". Mediano: " + num3 + ". Pequeño: " + num2);
			}

		} else if ((num2 > num1) && (num2 > num3)) {
			if (num1 > num3) {
				System.out.println("Mayor: " + num2 + ". Mediano: " + num1 + ". Pequeño: " + num3);
			} else {
				System.out.println("Mayor: " + num2 + ". Mediano: " + num3 + ". Pequeño: " + num1);
			}
		} else {
			if (num1 > num2) {
				System.out.println("Mayor: " + num3 + ". Mediano: " + num1 + ". Pequeño: " + num2);
			} else {
				System.out.println("Mayor: " + num3 + ". Mediano: " + num2 + ". Pequeño: " + num1);
			}
		}
	}
}
