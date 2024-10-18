package Ejer6_10;

public class Ejer10_V2 {
	/**
	 * Como podemos ver, en este caso se trata de mostrar las letras del abecedario
	 * (sin la Ñ) en mayúsculas y en orden inverso. A continuación en cada fila
	 * mostrar una letra menos hasta llegar a mostrar solamente la A.
	 */

	public static void main(String[] args) {

		for (char fila = 'z'; fila >= 'a'; fila--) {
			for (char valor = fila; valor >= 'a'; valor--) {
				System.out.print(valor);
			}
			System.out.println();
		}
	}
}
