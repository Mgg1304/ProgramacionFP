package Ejer4;

import java.util.Scanner;

public class Ejer4 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 4 Implementar un código modular con una función que calcule la raíz
	 * cuadrada de un numero que recibe como parámetro, teniendo la precaución de no
	 * llamar a la función si el numero es negativo, en cuyo caso se muestra un
	 * mensaje de error.
	 */

	public static void main(String[] args) {

		System.out.print("Dame el valor de a: ");
		int a = sc.nextInt();

		System.out.print("Dame el valor de b: ");
		int b = sc.nextInt();

		Lib_ejer4.sumar(a, b);
		Lib_ejer4.restar(a, b);
		Lib_ejer4.multiplicar(a, b);
		Lib_ejer4.dividir(a, b);
		Lib_ejer4.raizEntera(a);
		Lib_ejer4.raizEntera(b);
	}

}
