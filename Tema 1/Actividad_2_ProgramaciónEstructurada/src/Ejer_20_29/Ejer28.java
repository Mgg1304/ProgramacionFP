package Ejer_20_29;

import java.util.Scanner;

public class Ejer28 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Implementar un algoritmo que pida números hasta que el número leído este
	 * entre 1 y 5, en ese momento se debe salir.
	 */
	public static void main(String[] args) {

		int x = 0;

		while ((x < 1) || (x > 5)) {

			System.out.print("Dame un numero: ");
			x = sc.nextInt();
		}

		System.out.print("Fin");

	}

}
