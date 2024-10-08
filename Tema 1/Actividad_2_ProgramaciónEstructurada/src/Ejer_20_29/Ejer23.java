package Ejer_20_29;

import java.util.Scanner;

public class Ejer23 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula el factorial de un numero entero. El factorial es el resultado de
	 * multiplicar ese número por todos los números menores que él.
	 */
	public static void main(String[] args) {

		int num, total = 1;

		System.out.print("Dame el numero del que calcular el factorial: ");
		num = sc.nextInt();

		while (num > 1) {

			total = total * num;
			num--;
		}

		System.out.println("El factorial del numero es " + total);
	}

}
