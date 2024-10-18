package Ejer6_10;

import java.util.Scanner;

public class Ejer07 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 7 Escribir una función que muestre las permutaciones con repetición
	 * que pueden hacerse con los números 1,2,3 y 4. También que muestre el número
	 * de estas.
	 */
	public static void main(String[] args) {

		int permutaciones = 0;

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int j2 = 1; j2 < 5; j2++) {
					for (int k = 1; k < 5; k++) {
						System.out.println(i + "," + j + "," + j2 + "," + k);
						permutaciones++;
					}
				}
			}
		}
		System.out.println("Habremos hecho " + permutaciones + " permutaciones");
	}

}
