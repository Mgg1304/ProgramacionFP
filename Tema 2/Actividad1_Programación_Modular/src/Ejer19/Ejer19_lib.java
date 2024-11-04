package Ejer19;

import java.util.Scanner;

public class Ejer19_lib {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Pide la fecha de hoy y la fecha de nacimiento de alguien para calcular la
	 * edad que tiene. Tiene en cuenta el dia y mes de nacimiento.
	 * 
	 * @return int
	 */
	public static int edad() {

		System.out.print("Introduce la fecha de hoy separada por espacios: ");
		int dia_actual = sc.nextInt();
		int mes_actual = sc.nextInt();
		int year_actual = sc.nextInt();

		System.out.print("Introduce la fecha de nacimiento separada por espacios: ");
		int dia_nacimiento = sc.nextInt();
		int mes_nacimiento = sc.nextInt();
		int year_nacimiento = sc.nextInt();

		int edad = year_actual - year_nacimiento;

		if (mes_actual > mes_nacimiento)
			return edad;
		else if ((mes_actual == mes_nacimiento)) {
			if (dia_actual > dia_nacimiento)
				return edad;
			else if (dia_actual == dia_nacimiento)
				return edad;
			else
				return edad--;
		} else {
			return edad--;
		}
	}
}
