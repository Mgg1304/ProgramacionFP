package Bucles;

import java.util.Scanner;

public class Ejer3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Pido un numero y saco por pantalla los multiplos
	 */

	public static void main(String[] args) {

		int numInicial, numFinal;
		
		//Pido el numero tope
		System.out.println("Dame el numero tope: ");
		numFinal = sc.nextInt();
		
		int contador = 1;
		
		while(contador <= numFinal) {
			if(contador%7==0) {
				System.out.println(contador + " multiplo de 7");
			}
			contador++;
		}
	}

}
