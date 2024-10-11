package Ejer_20_29;

import java.util.Scanner;

public class Ejer26 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Mostrar el mensaje “¿Desea terminar (s/n)?” el programa terminará cuando el
	 * usuario pulse ‘S’ o ‘s’, en otro caso el programa continuará indefinidamente.
	 */
	public static void main(String[] args) {

		char x = 'n';

		while ((x != 's') && (x != 'S')) {

			System.out.print("¿Desea terminar (s/n)? ");
			String y = sc.next();

			x = y.charAt(0);
		}

		System.out.println("Fin");
	}

}
