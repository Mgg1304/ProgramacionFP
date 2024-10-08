package Ejer_20_29;

import java.util.Scanner;

public class Ejer20 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Dado el nombre o numero de mes y año comprobando si es bisiesto on o ,
	 * determinar el número de días del mes.
	 */

	public static void main(String[] args) {

		System.out.print("1. Elección en numero \n2. Elección en letra\n¿Como va a introducir la información?: ");
		int caso = sc.nextInt();

		if (caso == 1) {

			System.out.print("Deme el numero del mes: ");
			int mes = sc.nextInt();

			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("Tiene 31 dias");
				break;
			case 2:
				System.out.print("Deme el año: ");
				int anyo = sc.nextInt();

				if (anyo % 4 == 0) {
					System.out.println("Tiene 28 dias");
				} else {
					System.out.println("Tiene 27 dias");
				}

				break;
			default:
				System.out.println("Tiene 30 dias");
				break;
			}
		} else {

			System.out.print("Deme el nombre del mes en minusculas: ");
			String mes = sc.next();

			switch (mes) {
			case "enero", "marzo", "mayo", "julio", "agosto", "diciembre":
				System.out.println("Tiene 31 dias");
				break;

			case "febrero":
				System.out.print("Deme el año: ");
				int anyo = sc.nextInt();

				if (anyo % 4 == 0) {
					System.out.println("Tiene 28 dias");
				} else {
					System.out.println("Tiene 27 dias");
				}

			default:
				System.out.println("Tiene 30 dias");
				break;
			}
		}
	}
}
