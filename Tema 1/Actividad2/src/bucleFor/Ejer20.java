package bucleFor;

import java.util.Scanner;

public class Ejer20 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 20: Escribe un programa que pregunte cuantos numeros se van a
	 * introducir, los pida y devuelva la suma de ellos. Los numeros pueden ser
	 * decimales
	 */
	public static void main(String[] args) {

		int numerosTotales;
		double sum = 0;

		// Pido el numero de elementos
		System.out.println("¿Cuantos elementos vas a introdcir?");
		numerosTotales = sc.nextInt();

		if (numerosTotales < 0) {
			System.out.println("El numero de elementos tiene que ser mayor que cero");
		} else {
			for (int i = 0; i < numerosTotales; i++) {
				System.out.println("Escriba el valor " + (i+1) + ": ");
				sum += sc.nextDouble();
			}
			System.out.println("La suma de los errores es " + sum);
		}
	}

}
