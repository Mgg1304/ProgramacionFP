package Ejer_10_19;

import java.util.Scanner;

public class Ejer17 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Realiza un algoritmo que resuelva una ecuación de segundo grado. El programa
	 * pedirá por teclado los 3 coeficientes y mostrará las posibles soluciones: no
	 * tiene solución, una única solución ( y su valor) o dos soluciones ( y sus
	 * valores)
	 */
	public static void main(String[] args) {

		double a, b, c;

		System.out.print("Dame el valor del numero de la x al cuadrado: ");
		a = sc.nextDouble();

		System.out.print("Dame el valor del numero de la x: ");
		b = sc.nextDouble();

		System.out.print("Dame el valor del termino independiente: ");
		c = sc.nextDouble();

		double discriminante = (Math.pow(b, 2) - (4 * a * b));

		if (discriminante >= 0) {

			if (discriminante == 0) {
				double x = ((-b) - (4 * a * c)) / (2 * a);

				System.out.println("La solución es " + x);
			} else {
				double x = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

				double y = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

				System.out.println("Las soluciones son " + x + " y " + y);
			}
		} else {
			System.out.println("La ecuación no tiene solución");
		}
	}
}
