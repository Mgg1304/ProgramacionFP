package Ejer14;

import Ejer13.Ejer13_lib;

public class Ejer14_lib {
	
	/**
	 * Muestra los valores primos entre 1 y 100
	 */
	public static void mostrarPrimos() {
		for (int i = 1; i < 101; i++) {
			if(Ejer13_lib.esPrimo(i)) {
				System.out.println(i);
			}
		}
	}

}
