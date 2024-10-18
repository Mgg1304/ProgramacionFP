package Ejer6_10;

import java.util.Scanner;

public class Ejer08 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Leer por teclado un número entero N no negativo y mostrar el factorial de
	 * todos los números desde 0 hasta N
	 */
	public static void main(String[] args) {

		System.out.println("Dame el numero mayor que cero: ");
		int num = sc.nextInt();

		for (int i = 0; i < num + 1; i++) {
			if (i == 0) {
				System.out.println(i + "!= 1");
			} else {
				int factorial = 1;
				for (int j = i; j > 0; j--) {
					factorial = factorial * j;
				}
				System.out.println(i + "!=" + factorial);
			}
		}

	}

}
