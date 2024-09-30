package bucleFor;

import java.util.Scanner;

public class Ejer19 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 18: Escribe un programa que pregunte cuantos numeros se van a
	 * introducir, los pida y diga cuales son pares y cuales impares
	 */
	public static void main(String[] args) {

		int numerosTotales, num, numerosPares = 0, numerosImpares = 0;

		// Pido cuantos numeros van a haber
		System.out.println("¿Cuantos valores vas a introducir?");
		numerosTotales = sc.nextInt();

		if (numerosTotales <= 0) {
			System.out.println("El numero de elementos tiene que ser mayor o igual que cero");
		} else {
			for (int i = 0; i < numerosTotales; i++) {
				System.out.println("Escriba el valor " + (i+1) + ": ");
				num = sc.nextInt();
				
				if (num % 2 == 0) {
					numerosPares++;
				} else {
					numerosImpares++;
				}
			}
			System.out.println("Has introducido " + numerosPares + " numeros pares y " + numerosImpares + " numeros impares");
		}
	}

}
