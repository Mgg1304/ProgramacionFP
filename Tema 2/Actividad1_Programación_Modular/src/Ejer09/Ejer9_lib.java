package Ejer09;

public class Ejer9_lib {

	/**
	 * Devuelve cuantas cifras tiene un numero
	 * 
	 * @param num: int
	 * @return int
	 */
	public static int numCifras(int num) {

		int cifras = 1;
		while (num > 10) {
			num = num / 10;
			cifras++;
		}

		return cifras;
	}

}
