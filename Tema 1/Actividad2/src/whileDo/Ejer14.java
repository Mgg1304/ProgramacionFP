package whileDo;

import java.util.Scanner;

public class Ejer14 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 14: Escriba un programa que calcule la descomposición en factores
	 * primos de un numero
	 */
	public static void main(String[] args) {

		int num, mod = 2, x;

		// Pedimos el numero a descomponer
		System.out.println("Escribe un numero entero mayor que 1: ");
		num = sc.nextInt();

		// Divido el numero dado entre el primer numero primo distinto de 1.
		// Si es divisible, repetimos la división.
		// Si no es divisible, seguimos con el siguiente numero
		while (num != 1) {
			// Comprobamos el resto de la división
			x = num % mod;

			// Si es cero, es divisible
			if (x == 0) {
				System.out.print(mod + " ");
				num = num / mod;
				while (true) {
					x = num % mod;
					if (x != 0) {
						break;
					} else {
						System.out.print(mod + " ");
						num = num / mod;
					}
				}
				// Si da diferente, no es divisible
			} else {
				mod++;
			}

		}
	}
}
