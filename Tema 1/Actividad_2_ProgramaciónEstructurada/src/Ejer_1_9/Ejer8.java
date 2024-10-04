package Ejer_1_9;

import java.util.Scanner;

public class Ejer8 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar si un número real pedido por teclado tiene o no decimales
	 */
	public static void main(String[] args) {
		
		double num;
		
		System.out.println("Dame el numero: ");
		num = sc.nextDouble();
		
		if(num%1 == 0) {
			System.out.println("El numero no tiene decimales");
		} else {
			System.out.println("El numero tiene decimales");
		}
	}
}
