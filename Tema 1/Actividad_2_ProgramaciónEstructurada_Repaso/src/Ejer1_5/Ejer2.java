package Ejer1_5;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 2 Escribir un programa que pida al usuario un número entero
	 * positivo y muestre por pantalla todos los números impares desde 1 hasta ese
	 * número separados por comas
	 */

	public static void main(String[] args) {

		System.out.print("Dame el numero limite: ");
		int num = sc.nextInt();

		for (int i = 1; i < num + 1; i++) {

			if (i % 2 != 0) {
				System.out.print(i + ", S");
			}
		}
	}

}
