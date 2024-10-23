package Ejer_10_19;

import java.util.Scanner;

public class Ejer10 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Al ingresar el número de día y el número de mes, devolver la estación de año
	 * de acuerdo a la siguiente tabla
	 * 
	 * Verano -> 21 de diciembre/20 de marzo Otoño -> 21 de marzo/21 de junio
	 * Invierno -> 22 de junio/22 de septiembre Primavera -> 23 de septiembre/20 de
	 * diciembre
	 */

	public static void main(String[] args) {

		System.out.print("Introduzca el dia del mes: ");
		int dia = sc.nextInt();

		System.out.println("Introduzco el numero del mes: ");
		int mes = sc.nextInt();

		if ((mes == 12) || (mes <= 3)) {
			if ((dia > 21) && (mes == 12)) {
				System.out.println("Estas en verano");
			} else if ((dia < 21) && mes <= 3) {
				System.out.println("Estas en verano");
			}
		} else if ((mes >= 3) && (mes <= 6)) {
			if ((dia > 21) && (mes >= 3)) {
				System.out.println("Estas en otoño");
			} else if ((dia <= 21) && (mes <= 6)) {
				System.out.println("Estas en otoño");
			}
		} else if ((mes >= 6) && (mes <= 9)) {
			if ((dia >= 22) && (mes >= 6)) {
				System.out.println("Estas en invierno");
			} else if ((dia <= 22) && (mes <= 9)) {
				System.out.println("Estas en invierno");
			}
		} else if ((mes >= 9) && (mes <= 12)) {
			if ((dia >= 23) && (mes >= 9)) {
				System.out.println("Estas en primavera");
			} else if ((dia <= 20) && (mes <= 12)) {
				System.out.println("Estas en primavera");
			}
		}
	}

}
