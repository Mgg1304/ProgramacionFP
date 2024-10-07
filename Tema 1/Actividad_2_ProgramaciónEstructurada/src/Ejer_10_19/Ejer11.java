package Ejer_10_19;

import java.util.Scanner;

public class Ejer11 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseña un algoritmo que determine si tres números que pedimos por teclado
	 * están ordenados de mayor a menor ( NO consiste en ordenar, solo indicar si
	 * están ordenados o no)
	 */

	public static void main(String[] args) {

		int num1, num2, num3;

		System.out.println("Dame el primer numero: ");
		num1 = sc.nextInt();

		System.out.println("Dame el segundo numero: ");
		num2 = sc.nextInt();

		System.out.println("Dame el tercer numero: ");
		num3 = sc.nextInt();

		if ((num1 > num2) && (num2 > num3)) {
			System.out.println("Los numeros estan ordenados de mayor a menor");
		} else {
			System.out.println("Los numeros no estan ordenados de mayor a menor");
			if (num1 < num2) {
				System.out.println("El primer numero no es mayor que el segundo");
			}
			if (num2 < num3) {
				System.out.println("El segundo numero no es mayor que el tercero");
			}
		}
	}
}
