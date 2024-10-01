package ActividadEvaluable_1;

import java.util.Scanner;

public class Ejercicio {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseñar un algoritmo que calcule la media de una secuencia de numeros
	 * estrictamente positivos que seaan multiplos de 5. La secuencia finaliza
	 * cuando se introduzca un cero. Si se introduce un numero negativo, este no
	 * formara parte de la secuencia a procesar.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num, numTotal = 0, contador = 0;
		double media;

		// Pides el primer numero de la secuencia
		System.out.println("Dame el primer numero de la secuencia: ");
		num = sc.nextInt();

		while (num != 0) {
			// Evaluas si el numero es multiplo de cinco y mayor de cero.
			// Si es multiplo de cinco y mayor de cero, se añadira el valor del numero al
			// total y el contador aumentara de valor
			if ((num % 5 == 0) && (num > 0)) {
				numTotal += num;
				contador++;
			}

			// Pides el siguiente numero de la secuencia
			System.out.println("Dame el siguiente numero de la secuencia: ");
			num = sc.nextInt();
		}

		if (contador == 0) {
			System.out.println("No has metido ningun multiplo de 5");
		} else {
			media = numTotal / contador;
			System.out.println("La media es: " + media);
		}

	}

}
