package Ejer20;

public class Ejer20_lib {

	/**
	 * Recibe tres numeros enteros e imprime por pantalla cual es el mayor, cual el
	 * mediano y cual el menor.
	 * 
	 * @param num1: int
	 * @param num2: int
	 * @param num3: int
	 */
	public static void ordenar(int num1, int num2, int num3) {

		if ((num1 > num2) && (num1 > num3)) {
			System.out.print("Mayor: " + num1);
			if (num2 > num3) {
				System.out.println(" Mediano: " + num2 + " Menor: " + num3);
			} else {
				System.out.println(" Mediano: " + num3 + " Menor: " + num2);
			}

		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.print("Mayor: " + num2);

			if (num1 > num3) {
				System.out.println(" Mediano: " + num1 + " Menor: " + num3);
			} else {
				System.out.println(" Mediano: " + num3 + " Menor: " + num1);
			}

		} else {
			System.out.print("Mayor: " + num3);

			if (num1 > num2) {
				System.out.println(" Mediano: " + num1 + " Menor: " + num2);
			} else {
				System.out.println(" Mediano: " + num2 + " Menor: " + num1);
			}

		}
	}

}
