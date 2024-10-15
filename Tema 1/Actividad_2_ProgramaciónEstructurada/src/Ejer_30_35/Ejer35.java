package Ejer_30_35;

import java.util.Scanner;

public class Ejer35 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Reutiliza el ejercicio anterior: Genera una apuesta al azar y unos resultados
	 * también al azar; después indica cuantos aciertos se han producido.
	 */

	public static void main(String[] args) {

		System.out.println("pos\tApuesta\tresult");

		for (int i = 1; i < 15; i++) {

			int valor = ((int) (Math.random() * 3) + 1);
			int result = ((int) (Math.random() * 3) + 1);

			if (valor == 3) {
				System.out.print("[" + i + "]:\tX");
			} else {
				System.out.print("[" + i + "]\t: " + valor);
			}

			if (result == 3) {
				System.out.println("\tX");
			} else {
				System.out.println("\t" + result);
			}

		}
	}
}
