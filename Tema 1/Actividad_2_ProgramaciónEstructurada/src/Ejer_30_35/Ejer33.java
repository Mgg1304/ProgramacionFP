package Ejer_30_35;

import java.util.Scanner;

public class Ejer33 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Genera una combinación al azar para la lotería primitiva. Los números de la
	 * lotería son 6, comprendidos del 1 al 49. En esta versión no importa si se
	 * repite algún número.
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {

			int num = (int) (Math.random() * 100);

			while (num > 50) {
				num = (int) (Math.random() * 100);
			}

			System.out.println(num);
		}
	}

}
