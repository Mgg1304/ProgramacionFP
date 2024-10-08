package Ejer_20_29;

import java.util.Scanner;

public class Ejer24 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula la media de diez números que pedimos por teclado,. Generaliza la
	 * solución para una cantidad cualquiera de números que pediremos al principio.
	 */
	public static void main(String[] args) {

		int numDeNumeros, num;
		double total = 0;

		System.out.println("Cuantos numeros vas a introduccir: ");
		numDeNumeros = sc.nextInt();

		for (int i = 0; i < numDeNumeros; i++) {
			System.out.print("Dame el numero: ");
			num = sc.nextInt();
			total += num;
		}

		total = total / numDeNumeros;

		System.out.println("La media es " + total);

	}

}
