package Ejer06;

import java.util.Scanner;

public class Ejer6 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 6 Determinar, con un programa modular, si un número real pedido por
	 * teclado tiene decimales o no.
	 */
	public static void main(String[] args) {
		
		System.out.println("Dame un numero para comprobar si tiene decimales: ");
		double x = sc.nextDouble();
		
		if(Lib_ejer6.comprobarDecimales(x)) {
			System.out.println("El numero tiene decimales");
		} else {
			System.out.println("El numero no tiene decimales");
		}
	}

}
