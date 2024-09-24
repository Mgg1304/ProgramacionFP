package ifElse;

import java.util.Scanner;

public class Ejer7 {
	public static Scanner sc = new Scanner(System.in);
	/*
	 * Ejercicio 7: Pide dos años y di cuantos años quedan, cuantos años han pasado o si son el mismo
	 */
	public static void main(String[] args) {
		
		int añoActual, añoObjetivo;
		
		//Pido el año actual
		System.out.println("En que año estamos: ");
		añoActual = sc.nextInt();
		
		//Pido el año objetivo
		System.out.println("Escribe un año cualquiera: ");
		añoObjetivo = sc.nextInt();
		
		if (añoActual > añoObjetivo) {
			System.out.println("Han pasado "+ (añoActual-añoObjetivo) + " años.");
		} else if (añoActual == añoObjetivo){
			System.out.println("Es el mismo año.");
		} else {
			System.out.println("Faltan " + (añoObjetivo-añoActual) + " años.");
		}
	}
}
