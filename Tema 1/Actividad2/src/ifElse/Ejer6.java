package ifElse;

import java.util.Scanner;

public class Ejer6 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 6: Pide dos numeros reales por pantalla y determina cual es mayor o si son iguales
	 */
	public static void main(String[] args) {
		float num1, num2;
		
		//Pido el primer numero
		System.out.println("Dame el primer numero");
		num1 = sc.nextFloat();
		
		//Pido el segundo numero
		System.out.println("Dame el segundo numero");
		num2 = sc.nextFloat();
		
		if(num1 == num2) {
			System.out.println("Son iguales");
		} else if (num1>num2) {
			System.out.println("Mayor: " + num1 + " Menor: " + num2);
		} else {
			System.out.println("Mayor: " + num2 + " Menor: " + num1);
		}
	}
}
