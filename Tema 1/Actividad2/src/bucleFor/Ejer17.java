package bucleFor;

import java.util.Scanner;

public class Ejer17 {
	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 17: Escriba un programa que pregunte cuantos numeros se van a
	 * introducir , pida esos numeros y muestre un mensaje cada vez que uno de ellos
	 * sea menor que el primero
	 */
	public static void main(String[] args) {

		int numerosTotales, priNum, num;

		// Pido el numero de numeros
		System.out.println("¿Cuantos valores vas a introducir?");
		numerosTotales = sc.nextInt();

		if (numerosTotales <= 0) {
			System.out.println("El numero de elementos tiene que ser mayor que 0");
		} else {
			System.out.println("Escribe un numero: ");
			priNum = sc.nextInt();

			for (int i = 0; i < numerosTotales - 1; i++) {
				System.out.println("Escribe un numero mayor que " + priNum + ": ");
				num = sc.nextInt();
				if (num < priNum) {
					System.out.println(num + " no es mayor que " + priNum);
				}
			}
			System.out.println("Fin");
		}
	}
}
