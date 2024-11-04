package Ejer12;

import Ejer11.Ejer11_lib;

public class Ejer12_lib {

	/**
	 * Genera el numero conbinatorio de n y k. n tiene que ser mayor que k.
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public static int numCombiantorio(int n, int k) {
		return (Ejer11_lib.factorial(n)) / ((Ejer11_lib.factorial(k)) * (Ejer11_lib.factorial(n - k)));
	}

}
