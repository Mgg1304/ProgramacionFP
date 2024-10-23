package Ejer2;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 2 Diseña un programa modular que calcule el área y la
	 * circunferencia de un circulo cuyo radio se debe preguntar al usuario.
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Dame el radio: ");
		int radio = sc.nextInt();
		
		Lib_ejer2.calcularArea(radio);
		Lib_ejer2.calcularPerimetro(radio);
	}

	 

}
