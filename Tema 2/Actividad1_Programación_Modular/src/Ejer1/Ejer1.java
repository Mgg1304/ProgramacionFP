package Ejer1;

import java.util.Scanner;

public class Ejer1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 1 Realiza un programa modular que calcule la superficie y el
	 * perímetro de un cuadrado cuyo lado pediremos por teclado
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Dame el lado: ");
		int lado = sc.nextInt();
		
		Lib_ejer1.calcularPerimetroCuadrado(lado);
		Lib_ejer1.calcularSuperficie(lado);
	}

	

}
