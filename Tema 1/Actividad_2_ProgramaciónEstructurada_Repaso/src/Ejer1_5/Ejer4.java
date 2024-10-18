package Ejer1_5;

import java.util.Scanner;

public class Ejer4 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Ejercicio 4 Escribir un programa que pregunte al usuario una cantidad a
	 * invertir, el interés anual y el número de años, y muestre por pantalla el
	 * capital obtenido en la inversión cada año que dura la inversión.
	 */
	public static void main(String[] args) {

		double dinero, interes;
		int años;

		System.out.print("Dame el dinero a invertir: ");
		dinero = sc.nextDouble();

		System.out.print("Dame el interes en decimales: ");
		interes = sc.nextDouble();

		System.out.print("Dame le numero de años: ");
		años = sc.nextInt();

		for (int i = 0; i < años; i++) {

			dinero += dinero * interes;
		}
		
		System.out.println("El dinero total sera " + dinero);
		
	}

}
