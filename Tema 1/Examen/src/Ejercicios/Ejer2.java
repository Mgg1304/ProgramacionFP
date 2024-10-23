package Ejercicios;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double numInicial, num;

		System.out.print("Dame el primer numero: ");
		numInicial = sc.nextDouble();

		num = numInicial + 1;

		while (num > numInicial) {
			System.out.print("Dame un numero mayor que " + numInicial + ": ");
			num = sc.nextDouble();
		}

		System.out.println("\n" + num + " no es mayor que " + numInicial);
	}

}
