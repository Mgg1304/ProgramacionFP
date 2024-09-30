package bucleFor;

import java.util.Scanner;

public class Ejer18 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 18: Escribe un programa que te pida cuantos numeros vas a
	 * introducir, te los pida y te devuelva cuantos son negativos
	 */
	public static void main(String[] args) {

		int numerosTotales, num, numNegativos = 0;

		// Pido cuantos numeros van a haber
		System.out.println("¿Cuantos valores vas a introducir?");
		numerosTotales = sc.nextInt();

		if (numerosTotales <= 0) {
			System.out.println("El numero de elementos tiene que ser mayor o igual que cero");
		} else {
			for (int i = 0; i < numerosTotales; i++) {
				System.out.println("Escriba el numero " + (i + 1) + ": ");
				num = sc.nextInt();

				if (num < 0) {
					numNegativos++;
				}
			}
			System.out.println("Has escrito " + numNegativos + " numeros negativos.");
		}
	}
}
