package Ejer_1_9;

import java.util.Scanner;

public class Ejer7 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar si un año pedido por teclado es bisiesto o no
	 */

	public static void main(String[] args) {

		int año;

		System.out.println("Dame el año que quieres comprobar: ");
		año = sc.nextInt();

		if (año % 4 == 0) {
			System.out.println("El año " + año + "es bisiesto");
		} else {
			System.out.println("El año " + año + "no es bisiento");
		}
	}
}
