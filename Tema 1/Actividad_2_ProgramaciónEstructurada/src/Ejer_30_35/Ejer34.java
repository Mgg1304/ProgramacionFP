package Ejer_30_35;

import java.util.Scanner;

public class Ejer34 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Genera combinaciones al azar para una quiniela de futbol. Recordemos que son
	 * 15 resultados : 1, X y 2.
	 * 
	 */

	public static void main(String[] args) {

		for (int i = 1; i < 15; i++) {

			int valor = ((int) (Math.random() * 3) + 1);

			if (valor == 3) {
				System.out.println("[" + i + "]:X");
			} else {
				System.out.println("[" + i + "]: " + valor);
			}
		}
	}
}
