package Ejer18;

public class Ejer18_lib {

	/**
	 * Imprime por pantalla que el menor numero de monedas se debe de dar para una
	 * cantidad especifica
	 * 
	 * @param vuelta: float
	 */

	public static void monedas(float vuelta) {

		vuelta += 0.001;

		while (vuelta > 2) {
			System.out.println("Moneda de dos euros");
			vuelta -= 2;
		}
		while (vuelta > 1) {
			System.out.println("Moneda de euro");
			vuelta -= 1;
		}
		while (vuelta > 0.5) {
			System.out.println("Moneda de 50 centimos");
			vuelta -= 0.5;
		}
		while (vuelta > 0.20) {
			System.out.println("Moneda de 20 centimos");
			vuelta -= 0.2;
		}
		while (vuelta > 0.1) {
			System.out.println("Moneda de 10 centimos");
			vuelta -= 0.1;
		}
		while (vuelta > 0.05) {
			System.out.println("Moneda de 5 centimos");
			vuelta -= 0.05;
		}
		while (vuelta > 0.02) {
			System.out.println("Moneda de 2 centimos");
			vuelta -= 0.02;
		}
		while (vuelta > 0.01) {
			System.out.println("Moneda de centimo");
			vuelta -= 0.01;
		}

	}

}
