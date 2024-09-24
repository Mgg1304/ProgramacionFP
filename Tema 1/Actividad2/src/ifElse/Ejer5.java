package ifElse;

import java.util.Scanner;

public class Ejer5 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 5: Pide dos numeros para hacer la division y si el dividendo es cero, 
	 * pon el mensaje que no se puede dividir entre cero 
	 */
	
	public static void main(String[] args) {
		
int dividendo, divisor, id = 0, cociente, resto;
		
		//Pido el dividendo
		System.out.println("Dame el dividendo: ");
		dividendo = sc.nextInt();
		
		//Pido el divisor
		System.out.println("Dame el divisor: ");
		divisor = sc.nextInt();
		
		if(divisor != 0) {
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
		} else {
			
			System.out.println("El divisor es cero, no se puede dividir");
			
		}
		
		
		
	}
}
