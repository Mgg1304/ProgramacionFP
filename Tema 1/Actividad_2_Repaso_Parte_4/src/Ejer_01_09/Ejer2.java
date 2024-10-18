package Ejer_01_09;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escribe el codigo para generar la siguiente tabla
	 * 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 
	 * 1 2 3 
	 * 1 2 
	 * 1
	 */

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 1; j < 4-i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
