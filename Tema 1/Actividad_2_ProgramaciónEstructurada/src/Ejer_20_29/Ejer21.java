package Ejer_20_29;

import java.util.Scanner;

public class Ejer21 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escribir todos los números pares entre 1 y 20
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
