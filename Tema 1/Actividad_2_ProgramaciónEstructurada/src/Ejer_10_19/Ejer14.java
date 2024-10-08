package Ejer_10_19;

import java.util.Scanner;

public class Ejer14 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar el número de cifras de un número
	 */

	public static void main(String[] args) {

		int num, cifras = 1;

		System.out.println("Dame el numero: ");
		num = sc.nextInt();

		while (true) {
			if (num / 10 != 0) {
				cifras++;
				num = num / 10;
			} else {
				break;
			}
		}
		System.out.println("El numero introducido tiene " + cifras + " cifras.");
	}
}
