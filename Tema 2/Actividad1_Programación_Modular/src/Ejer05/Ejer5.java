package Ejer05;

import java.util.Scanner;

public class Ejer5 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 5 Implementar un función que determine si un año es bisiesto o no
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Dame el dia: ");
		int dia = sc.nextInt();
		
		System.out.print("Dame el mes: ");
		int mes = sc.nextInt();
		
		System.out.print("Dame el año: ");
		int anyo = sc.nextInt();
		
		if (Lib_ejer5.fechaCorrecta(dia, mes, anyo)) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha no es correcta");
		}
		
	}

}
