package Ejer8;

public class Ejer8_lid {

	/**
	 * Comprueba si tres numeros estan ordenadas
	 * 
	 * @param num1: int
	 * @param num2: int
	 * @param num3: int
	 * @return boolean
	 */

	public static boolean tresNumOrdenados(int num1, int num2, int num3) {

		if ((num1 < num2) && (num2 < num3)) {
			return true;
		} else {
			return false;
		}
	}

}
