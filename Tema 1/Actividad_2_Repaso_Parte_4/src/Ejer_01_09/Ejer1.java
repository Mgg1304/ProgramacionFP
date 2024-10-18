package Ejer_01_09;

import java.util.Scanner;

public class Ejer1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Escribe un programa que imprima este patron
	 * *********
	 *  *********
	 * *********
	 *  *********
	 * ********
	 *  ********
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			
			System.out.println("*");
			System.out.print(" ");
			
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			
			System.out.println("*");
		}
	}

}
