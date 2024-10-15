package Ejer;

import java.util.Scanner;

public class Ejer1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escriba un programa en Java que genere la siguiente serie: 5,10,15,20,25,30…
	 * El programa preguntará primero cuantos términos se quieren mostrar y después
	 * mostrará la serie correspondiente.
	 */
	public static void main(String[] args) {

		int num, suma = 5;

		System.out.print("Dame el numero de multiplos que quieras: ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			
			System.out.print(suma + " ");
			suma +=5;
		}
	}

}
