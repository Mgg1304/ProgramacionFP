package Ejer1_5;

import java.util.Scanner;

public class Ejer1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 1 Escribir un programa que pregunte al usuario su edad y muestre
	 * por pantalla todos los años que ha cumplido (desde 1 hasta su edad)
	 */

	public static void main(String[] args) {

		System.out.print("Dame tu edad: ");
		int edad = sc.nextInt();

		for (int i = 1; i < edad + 1; i++) {
			System.out.print(i + " ");
		}
	}

}
