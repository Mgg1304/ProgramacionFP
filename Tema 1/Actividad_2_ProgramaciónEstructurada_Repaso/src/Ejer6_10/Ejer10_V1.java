package Ejer6_10;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer10_V1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Como podemos ver, en este caso se trata de mostrar las letras del abecedario
	 * (sin la Ñ) en mayúsculas y en orden inverso. A continuación en cada fila
	 * mostrar una letra menos hasta llegar a mostrar solamente la A.
	 */
	public static void main(String[] args) {

		String x = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

		for (int i = 0; i < 26; i++) {
			for (int j = i; j < 26; j++) {
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}
	}

}
