package Ejer1_5;

import java.util.Scanner;

public class Ejer3 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 3 Escribir un programa que pida al usuario un número entero
	 * positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero
	 * separados por comas
	 */
	public static void main(String[] args) {
		
		System.out.print("Dame un numero entero positivo: ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 0; i--) {
			System.out.print(i + ", ");
		}
	}

}
