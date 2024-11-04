package Ejer11;

public class Ejer11_lib {

	/**
	 * Calcula el factorial de un numero introducido
	 * 
	 * @param num: int
	 * @return int
	 */
	public static int factorial(int num) {

		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
