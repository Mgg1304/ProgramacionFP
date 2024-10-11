package Ejer_20_29;

import java.util.Scanner;

public class Ejer29 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Realiza un algoritmo que introducidas las notas de N alumnos nos indicará
	 * cuantos aprobados y cuantos suspensos hay. Generaliza este ejercicio para una
	 * cantidad indefinida de notas (pararemos con una nota negativa). Amplia el
	 * ejercicio indicando no solo cuantos aprobados hay, también cuantos
	 * sobresalientes, notables, bienes, aprobados y suspensos.
	 */
	public static void main(String[] args) {

		int nota = 1, suspensos = 0, aprobados = 0, sobresalientes = 0, notables = 0, bienes = 0;

		while (nota > 0) {

			System.out.print("Dame la siguiente nota: ");
			nota = sc.nextInt();

			if ((nota < 5) && (nota > 0)) {
				suspensos++;
			} else if (nota > 5) {
				aprobados++;

				if ((nota >= 5) && (nota <= 6)) {
					bienes++;
				} else if ((nota >= 7) && (nota <= 8)) {
					notables++;
				} else if ((nota >= 9) && (nota <= 10)) {
					sobresalientes++;
				}
			}
		}

		System.out.println("Suspensos: " + suspensos + ". Aprobados: " + aprobados + ". Bienes: " + bienes
				+ ". Notables: " + notables + ". Sobresalientes: " + sobresalientes + ".");
	}

}
