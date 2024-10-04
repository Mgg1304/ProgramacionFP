package Ejer_1_9;

import java.util.Scanner;

public class Ejer5 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar si un número leído por teclado es positivo o negativo
	 */

	public static void main(String[] args) {

		int num;

		System.out.println("Dame un numero: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + " es positivo");
		} else {
			System.out.println(num + " es negativo");
		}
	}
}
