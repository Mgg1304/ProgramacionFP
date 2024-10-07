package Ejer_10_19;

import java.util.Scanner;

public class Ejer12 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseña un algoritmo que determine si 5 números pedidos por teclado son
	 * consecutivos o no.
	 */
	public static void main(String[] args) {

		int num1, num2, num3, num4, num5;

		System.out.println("Dame un numero: ");
		num1 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num2 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num3 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num4 = sc.nextInt();

		System.out.println("Dame un numero: ");
		num5 = sc.nextInt();

		if ((num2 == num1 + 1) && (num3 == num2 + 1) && (num4 == num3 + 1) && (num5 == num4 + 1)) {
			System.out.println("Todos los numeros son consecutivos");
		} else {
			System.out.println("Los numeros no son consecutivos");
		}
	}

}
