package Ejer_01_09;

import java.util.Scanner;

public class Ejer6 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Tenemos la pantalla del móvil bloqueada. Partiendo de un PIN_SECRETO,
	 * intentaremos desbloquear la pantalla. Tenemos hasta 3 intentos. Simula el
	 * proceso con un programa java. En caso de acceder, lanza al usuario 'login
	 * correcto'. Sino, 'llamando al policía'.
	 */
	public static void main(String[] args) {
		
		int PIN_SECRETO = 34, x = 0, intentos = 0;
		while((x != PIN_SECRETO)&&(intentos < 3)) {
			
			System.out.print("Introduzca el pin: ");
			x = sc.nextInt();
			
			if (x == PIN_SECRETO) {
				System.out.println("Login correcto");
			} else {
				System.out.println("Pin incorrecto ");
				intentos++;
			}
			
			if(intentos == 3) {
				System.out.println("Llamando a policia");
			}
		}
	}

}
