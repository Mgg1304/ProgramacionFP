package Ejer;

import java.util.Scanner;

public class Ejer5 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escribir un programa en Java que determine si un número es mágico. Se dice
	 * que un número es mágico si las cifras que ocupan posiciones pares son ares y
	 * las que ocupan posiciones impares son impares.
	 */

	public static void main(String[] args) {

		int resto, num, pos = 1;
		boolean numMagic = true;

		System.out.print("Dame el numero: ");
		num = sc.nextInt();

		while (num > 0 && numMagic) {
			resto = num % 10;
			num = num / 10;

			if (pos % 2 == 0) {
				if (resto % 2 != 0) {
					numMagic = false;
				}
			} else {
				if (resto % 2 == 0) {
					numMagic = false;
				}
			}
			pos++;
		}
		System.out.println(numMagic);
	}

}
