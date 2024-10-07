package Ejer_10_19;

import java.util.Scanner;

public class Ejer10 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Realiza un conversor de grados centígrados a grados Farenheir. Nuestro
	 * algoritmo debe poder hacer la conversión en ambos sentidos
	 * 
	 * F=(9/5 * C) + 32
	 */

	public static void main(String[] args) {

		String origen;
		double temperatura;

		System.out.println("¿En que unidad esta la temperatura? ¿Celsius or Farenheir?: ");
		origen = sc.next();

		if (origen.equals("Celsius")) {
			System.out.println("Dame la temperatura en Celsius:");
			temperatura = sc.nextDouble();

			temperatura = ((9 / 5) * temperatura) + 32;

			System.out.println("La temperatura en Farenheir es: " + temperatura);

		} else if (origen.equals("Farenheir")) {
			System.out.println("Dame la temperatura en Farenheir: ");
			temperatura = sc.nextDouble();

			temperatura = (temperatura - 32) * 5 / 9;

			System.out.println("La temperatura en Celsius es: " + temperatura);

		} else {
			System.out.println("Unidad mal escrita");
		}
	}
}
