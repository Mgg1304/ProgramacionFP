package Ejer_1_9;

import java.util.Scanner;

public class Ejer4 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseña un algoritmo que calcule la media de tres números que pediremos al
	 * usuario. Se deben dar como resultado la media con decimales y redondeada
	 */

	public static void main(String[] args) {

		int num1, num2, num3;
		float media;

		System.out.println("Dame el primer numero: ");
		num1 = sc.nextInt();

		System.out.println("Dame el segundo numero: ");
		num2 = sc.nextInt();

		System.out.println("Dame el tercer numero: ");
		num3 = sc.nextInt();

		media = (num1 + num2 + num3) / 3;

		System.out.println("La media es " + media + ".");
	}

}
