package bucleFor;

import java.util.Scanner;

public class Ejer16 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 16: Escribe un programa que pida un numero entero y te de sus
	 * divisores
	 */
	public static void main(String[] args) {

		int num;

		// Pido el numero
		System.out.println("Dame el numero del que quieras saber sus divisores: ");
		num = sc.nextInt();

		System.out.print("Los divisores de " + num + " son: ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
