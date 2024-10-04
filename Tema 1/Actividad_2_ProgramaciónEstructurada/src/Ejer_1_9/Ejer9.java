package Ejer_1_9;

import java.util.Scanner;

public class Ejer9 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Leídos dos números por teclado, restar al mayor el menor. Por ejemplo , si A
	 * = 9 y B = 3 entonces se debe mostrar “ el primero es mayor y la resta es 6 "
	 */
	public static void main(String[] args) {

		int num1, num2;

		System.out.println("Dame el primer numero: ");
		num1 = sc.nextInt();

		System.out.println("Dame el segundo numero: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El primer numero es mayor que el segundo y la resta da " + (num1 - num2));
		} else {
			System.out.println("El segundo numero es mayor que el primero y la resta da " + (num2 - num1));
		}
	}
}
