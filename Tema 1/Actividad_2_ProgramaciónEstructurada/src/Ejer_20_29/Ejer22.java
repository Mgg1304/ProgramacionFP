package Ejer_20_29;

import java.util.Scanner;

public class Ejer22 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Suma todos los números impares que hay entre 1 y 20 mostrando el resultado al
	 * final. Generaliza lueg este ejercicio para dos números cualquier pedidos por
	 * teclado, deberá ir de menor a mayor.
	 */
	public static void main(String[] args) {

		int total = 0;
		int menor = 0, mayor = 0;

		System.out.println("Dame el numero menor: ");
		menor = sc.nextInt();

		System.out.println("Dame el numero mayor: ");
		mayor = sc.nextInt();

		for (int i = menor; i < (mayor + 1); i++) {
			if (i % 2 != 0) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
