package Barco;

import java.util.Scanner;

public class Barco {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Dibuja un barco. Pide un numero y haz un mastil de esa altura y una
	 * profundidad de esa profundidad
	 * 
	 * n = 5
	 * 
	 *      *
	 *      *
	 *      *
	 *      *
	 *      *
	 * ***********
	 *  *********
	 *   *******
	 *    *****
	 *     ***
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Dame la altura: ");
		int altura = sc.nextInt();
		
		//Mastil
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		//Cuerpo del barco
		for (int i = 0; i < altura; i++) {
			//Primera mitad del barco
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < altura - i; j++) {
				System.out.print("*");
			}
			//"Mastil interior"
			System.out.print("*");
			//Segunda mitad del barco
			for (int j = 0; j < altura - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
