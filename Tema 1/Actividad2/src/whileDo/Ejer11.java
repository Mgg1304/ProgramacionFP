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
		
		int numeros = 0, positivos, num, numerosPositivos = 0;
		
		//Pido el numero de numeros
		numeros = sc.nextInt();
		while(numeros <= 0) {
			System.out.println("La cantidad debe de ser mayor que cero. Intentelo de nuevo: ");
		}
		while (numeros >= numerosPositivos) {
			System.out.println("Escriba un numero: ");
			num = sc.nextInt();
			
			if (num > 0) numerosPositivos++;
		}


		if (numerosPositivos == numeros) { 
			System.out.println("Se han introducido + " + numerosPositivos);
		}
		else {
			System.out.println("Se han introducido + " + numeros + " de los cuales eran positivos " + numerosPositivos);
		}
	}
}
