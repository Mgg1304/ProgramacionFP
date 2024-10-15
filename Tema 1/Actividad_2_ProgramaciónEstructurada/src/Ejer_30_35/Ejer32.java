package Ejer_30_35;

import java.util.Scanner;

public class Ejer32 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Reutiliza el ejercicio anterior para mostrar los números primos que hay del 1
	 * al 100
	 */
	public static void main(String[] args) {

		System.out.println(1 + " ");

		for (int i = 2; i < 101; i++) {

			int mod = 2, x;
			boolean esPrimo = false;

			for (int j = 2; j < i; j++) {

				x = i % j;

				if (x == 0) {
					esPrimo = false;
					break;
				} else {
					esPrimo = true;
				}
			}

			if (esPrimo) {
				System.out.println(" " + i);
			}
		}
	}
}
