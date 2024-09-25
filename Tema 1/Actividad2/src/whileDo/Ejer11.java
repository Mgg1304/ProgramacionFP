package whileDo;

import java.util.Scanner;

public class Ejer11 {
	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 11: Escribe un programa que te pida el numero de numeros positivos
	 * que se debe de escribir y a continuación, pida numeros hasta que se escriba
	 * la cantidad de numeros positivos indicados
	 */

	public static void main(String[] args) {

		int numeros = 0, positivos = 0, num, numerosIntroducidos = 0;

		// Pido el numero de numeros
		System.out.println("Dame la cantidad de numeros que se van a introducir: ");
		numeros = sc.nextInt();
		while (numeros <= 0) {
			System.out.println("La cantidad debe de ser mayor que cero. Intentelo de nuevo: ");
			numeros = sc.nextInt();
		}
		while (numeros > numerosIntroducidos) {
			System.out.println("Escriba un numero: ");
			num = sc.nextInt();

			if (num > 0) {
				positivos++;
			}
			numerosIntroducidos++;
		}

		if (positivos == numeros) {
			System.out.println("Se han introducido + " + positivos);
		} else {
			System.out.println("Se han introducido " + numeros + " numeros de los cuales eran positivos " + positivos);
		}
	}
}
