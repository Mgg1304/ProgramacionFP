package Ejer_20_29;

import java.util.Scanner;

public class Ejer27 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseña un algoritmo que pida números hasta que se le introduzca un número
	 * mayor que 100.
	 */
	public static void main(String[] args) {
		int x = 0;

		while (x < 100) {

			System.out.print("Dame un numero: ");
			x = sc.nextInt();
		}

		System.out.println("Fin");
	}

}
