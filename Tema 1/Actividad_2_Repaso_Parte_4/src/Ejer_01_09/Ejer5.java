package Ejer_01_09;

import java.util.Scanner;

public class Ejer5 {
	
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Crea un algoritmo para la sucesión de Fibonacci
	 */
	
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 1, temp;
		
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 0; i < 5; i++) {
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			
			
			System.out.print(num2 + " ");
			
		}
	}

}
