package Ejer1_5;

import java.util.Scanner;

public class Ejer5 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 5 Escribir un programa que pida al usuario un número entero y
	 * muestre por pantalla un triángulo rectángulo como el de más abajo, de altura
	 * el número introducido.
	 */
	public static void main(String[] args) {
		
		System.out.print("Dame el numero para la altura del triangulo: ");
		int altura = sc.nextInt();
		
		for (int i = 1; i < altura+1; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
