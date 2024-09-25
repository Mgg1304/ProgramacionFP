package whileDo;

import java.util.Scanner;

public class Ejer12 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 12: Escribe un programa que pida un numero limite y acabe cuando la suma de los numeros supere el valor limite
	 */
	public static void main(String[] args) {
		
		float limite, num = 0;
		
		//Pedimos el limite
		System.out.println("Dame el numero limite: ");
		limite = sc.nextFloat();
		
		while (limite < 0) {
			System.out.println("El limite tiene que ser mayor que cero, intentalo de nuevo: ");
			limite = sc.nextFloat();
		}
		
		while (limite > num) {
			System.out.println("Escriba un numero: ");
			num += sc.nextFloat();
		}
		
		System.out.println("Ha superado el limite. La suma de los numeros introducidos es: " + num);
	}
}
