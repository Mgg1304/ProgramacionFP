package Ejer_30_35;

import java.util.Scanner;

public class Ejer30_1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseñar el algoritmo que indique el mayor de una serie de números que
	 * introducimos por teclado. Crea dos versiones: en la primera la cantidad está
	 * definida en la segunda será indefinida.
	 */
	public static void main(String[] args) {

		int num, max = 0, min = 0, numElementos;

		System.out.print("Dame el numero de elementos: ");
		numElementos = sc.nextInt();

		for (int i = 0; i < numElementos; i++) {

			System.out.print("Dame el siguiente numero: ");
			num = sc.nextInt();

			if (num > max) {
				max = num;
			} else if (num < min) {
				min = num;
			}
		}

		System.out.println("Max: " + max + ". Min: " + min + ".");
	}

}
