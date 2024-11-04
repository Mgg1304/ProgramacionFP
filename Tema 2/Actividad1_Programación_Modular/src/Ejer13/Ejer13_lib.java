package Ejer13;

public class Ejer13_lib {

	/**
	 * Compruba si un numero es primo o no
	 * 
	 * @param num: int
	 * @return int
	 */
	public static boolean esPrimo(int num) {

		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
		}

		return true;
	}

}
