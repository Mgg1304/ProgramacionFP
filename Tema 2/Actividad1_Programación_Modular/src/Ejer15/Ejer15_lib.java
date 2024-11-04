package Ejer15;

public class Ejer15_lib {

	/**
	 * Saca el cociente y resto de una división mediante restas sucesivas.
	 * 
	 * @param num:         int
	 * @param denominador: int
	 */
	public static void divRestas(int num, int denominador) {

		int cociente = 0;
		while (num > denominador) {
			num -= denominador;
			cociente++;
		}

		System.out.println("El cociente es " + cociente + " y el resto es " + num);
	}

}
