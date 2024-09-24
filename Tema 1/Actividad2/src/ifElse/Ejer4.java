package ifElse;

import java.util.Scanner;

public class Ejer4 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 4: Pide dos numeros por pantalla, dividendo y divisor
	 * Escribe un mensaje si es exacto o no
	 */
	 
	public static void main(String[] args) {
		
		int dividendo, divisor, id = 0, cociente, resto;
		
		//Pido el dividendo
		System.out.println("Dame el dividendo: ");
		dividendo = sc.nextInt();
		
		//Pido el divisor
		System.out.println("Dame el divisor: ");
		divisor = sc.nextInt();
		
		//Hago la division con modulo, para saber si hay resto o es justo
		id = dividendo % divisor;
		
		
		//Elijo que camino seguir
		if (id != 0) {
			System.out.print("La division no es exacta. ");
		}
		else {
			System.out.print("La division es exacta. ");
		}
		
		//Calculo el cociente
		cociente = dividendo / divisor;
		
		System.out.print("Cociente: " + cociente);
		
		//Si la division no es exacta, muestra el resto
		if (id != 0) {
			resto = dividendo - cociente*divisor;
			System.out.println(" Resto: " + resto);
		}
	}
}
