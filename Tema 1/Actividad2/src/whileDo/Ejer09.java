package whileDo;

import java.util.Scanner;

public class Ejer09 {
	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 9: El programa pedira dos numeros enteros y seguira hasta que el
	 * segundo sea mayor que el primero
	 */
	public static void main(String[] args) {

		int num1, num2;

		// Pedimos el primer numero
		System.out.println("Dame el primer numero: ");
		num1 = sc.nextInt();

		// Pedimos el segundo numero
		System.out.println("Dame el segundo numero: ");
		num2 = sc.nextInt();

		while (num2 <= num1) {

			System.out.println(num2 + " no es mayor que " + num1 + ". Intentelo de nuevo: ");
			num2 = sc.nextInt();

		}

		System.out.println("Los numeros que has escrito son " + num1 + " y " + num2);
	}
}
