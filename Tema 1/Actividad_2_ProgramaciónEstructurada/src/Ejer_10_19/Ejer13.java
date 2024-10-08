package Ejer_10_19;

import java.util.Scanner;

public class Ejer13 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Dados 2 números enteros, implementar un algoritmo que calcule el cociente y
	 * el resto mediante restas sucesivas.
	 */
	public static void main(String[] args) {

		int dividendo, divisor, cociente = 0;

		System.out.println("Dame el dividendo: ");
		dividendo = sc.nextInt();
		int temp = dividendo;

		System.out.println("Dame el divisor: ");
		divisor = sc.nextInt();

		while (divisor < dividendo) {
			dividendo -= divisor;
			cociente++;
		}

		System.out.println("El resto es " + dividendo + " y el cociente es " + cociente + ".");
	}

}
