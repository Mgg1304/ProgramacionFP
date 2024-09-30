package bucleFor;

import java.util.Scanner;

public class Ejer21 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 21: Escribe un programa que pida dos numeros enteros y escriba la
	 * suma de los numeros contenidos entre ellos
	 */
	public static void main(String[] args) {

		int priNum, secNum, sum = 0;

		// Pido el primer numero
		System.out.println("Escribe un numero entero positivo: ");
		priNum = sc.nextInt();

		if (priNum <= 0) {
			System.out.println("Pedi un numero entero mayor que cero");
		} else {
			// Pido el segundo numero
			System.out.println("Dame el segundo");
			secNum = sc.nextInt();

			if (secNum < priNum) {
				System.out.println("Pedi un numero entero mayor que " + priNum);
			} else {
				for (int i = priNum; i <= secNum; i++) {
					sum +=i;
				}
				System.out.println("La suma desde " + priNum + " hasta " + secNum + " es: " + sum);
			}
		}
	}
}
