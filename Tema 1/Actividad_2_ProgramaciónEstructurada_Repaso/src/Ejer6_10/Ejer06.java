package Ejer6_10;

import java.util.Scanner;

public class Ejer06 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 6 Escribir un programa que pida al usuario un número entero y
	 * muestre por pantalla un triángulo rectángulo como el de más abajo.
	 */
	public static void main(String[] args) {

		System.out.print("Dame el numero de la altura del triangunlo: ");
		int altura = sc.nextInt(), unidad = 1, temp = unidad;

		for (int i = 1; i < altura + 1; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(temp + " ");
				temp -= 2;
			}
			System.out.println();
			unidad += 2;
			temp = unidad;
		}
	}
}
