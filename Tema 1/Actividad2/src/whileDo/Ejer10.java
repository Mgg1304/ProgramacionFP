package whileDo;

import java.util.Scanner;

public class Ejer10 {
	
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 10: Escribe un programa que pida numeros cada vez mas grandes.
	 * Si el numero es mas pequeño, se acaba el programa
	 */
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		//Pedimos el primer numero
				System.out.println("Dame el numero: ");
				num1 = sc.nextInt();
				
				//Pedimos el segundo numero
				System.out.println("Escribe un numero mayor que " + num1 + ": ");
				num2 = sc.nextInt();
				
				//Mientras el segundo numero sea mayor que el primero, se ejecuta el bucle
				while (num2 > num1) {
					//Pasas el valor de num2 a num1 para tener referencia
					num1 = num2;
					
					//Pides el nuevo numero
					System.out.println("Escribe un numero mayor que " + num1 + ": ");
					num2 = sc.nextInt();
				}
				
				System.out.println(num2 + " no es mayor que " + num1);
				
	}
	
}
