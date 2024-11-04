package Ejer17;

public class Ejer17_lib {

	/**
	 * Devuelve las soluciones de una ecuación de segundo grado. Si no tiene
	 * solución, devuelve un mensaje diciendo que no tiene solución.
	 * 
	 * @param a: int
	 * @param b: int
	 * @param c: int
	 */
	public static void resolEcuacion(int a, int b, int c) {

		int x = b * b - 4 * a * c;

		if (x < 0) {
			System.out.println("No tiene soluciones");
		} else if (x == 0) {
			System.out.println("Tiene una solución. Solución: " + (-b));
		} else {
			System.out.print("Tiene dos soluciones. ");
			System.out.print("Solución uno: " + (-b + x));
			System.out.print("Solución dos: " + (-b - x));
		}
	}
}
