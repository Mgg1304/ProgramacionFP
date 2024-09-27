package whileDo;

import java.util.Scanner;

public class Ejer13 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Escriba un programa que pida dos numeros, minimo y maximo. El programa
	 * terminara cuando se introduzca un numero que no este en ese intervalo. Al
	 * final devolvera el numero de numeros
	 */

	public static void main(String[] args) {
		
		
		int min, max, num = 0, numTemp;
		
		//Pido el primer numero
		System.out.println("Escribe un numero: ");
		min = sc.nextInt();
		
		//Pido el segundo numero
		System.out.println("Escribe el segundo numero: ");
		max = sc.nextInt();
		
		//Me aseguro de que max es mayor que min, y sino pido el nuevo numero
		while (min > max) {
			System.out.println(max + " no es mayor que " + min);
			System.out.println("Dame el nuevo numero: ");
			max = sc.nextInt();
		}
		
		System.out.println("Dame un numero entre " + min + " y " + max + ": ");
		numTemp = sc.nextInt();
		
		if ((numTemp < min) || numTemp > max) {
			System.out.println("Has escrito " +  num + "numeros validos entre " + min + " y " + max + ".");
		} else {
			while ((numTemp >= min) && numTemp <= max) {
				num++;
				System.out.println("Dame un numero entre " + min + " y " + max + ": ");
				numTemp = sc.nextInt();
				
			}
			System.out.println("Has escrito " +  num + " numeros validos entre " + min + " y " + max + ".");
		}
	}
}
