package Ejer_10_19;

import java.util.Scanner;

public class Ejer19 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Los empleados de una fábrica trabajan por turnos: diurno y nocturno. Se debe
	 * calcular el jornal diario de acuerdo con los siguientes puntos: • La tarifa
	 * por horas diurnas es de 20€ • La tarifa por horas nocturnas es de 35€ • Caso
	 * de ser domingo, la tarifa se incrementa en 10€ más para el turno diurno y 15€
	 * para el nocturno.
	 * 
	 */
	public static void main(String[] args) {

		int horasDiurnas, horasNocturnas, sueldo;
		String domingo;

		System.out.print("Dame las horas diurnas que trabajas: ");
		horasDiurnas = sc.nextInt();

		System.out.print("Dame las horas nocturnas que trabajas: ");
		horasNocturnas = sc.nextInt();

		System.out.print("¿Es domingo?(Si/No)");
		domingo = sc.next();

		sueldo = horasDiurnas * 20 + horasNocturnas * 35;

		if (domingo.equals("Si")) {

			sueldo += horasDiurnas * 10 + horasNocturnas * 15;
		}

		System.out.println("Tu sueldo será de " + sueldo);

	}
}
