package Ejer_1_9;

import java.util.Scanner;

public class Ejer3 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcular el area y circunferencia de un circulo cuyo radio hay que pedir al
	 * usuario
	 */
	public static void main(String[] args) {

		double area;
		float radio;
		double circunferencia;

		System.out.print("Dame el radio: ");
		radio = sc.nextFloat();
		
		circunferencia = 2*Math.PI*radio;
		area = Math.PI*radio;
		
		System.out.println("Radio: " + radio + ". Circunferencia: " + circunferencia + ". Area: " + area + ".");
	}

}
