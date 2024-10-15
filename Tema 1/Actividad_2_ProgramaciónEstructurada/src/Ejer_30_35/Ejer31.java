package Ejer_30_35;

import java.util.Scanner;

public class Ejer31 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar si un número introducido por teclado es primo o no. Un número
	 * primo solo es divisible por él mismo y por la unidad.
	 */
	public static void main(String[] args) {

		int num, mod = 2, x;
		boolean esPrimo = true;

		System.out.println("Dame el numero: ");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			x = num % mod;

			if (x == 0) {
				esPrimo = false;
				break;
			}
		}
		System.out.println(esPrimo);
	}
}
