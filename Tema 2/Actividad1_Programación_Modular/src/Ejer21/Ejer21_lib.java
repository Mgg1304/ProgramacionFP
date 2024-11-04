package Ejer21;

public class Ejer21_lib {

	/**
	 * Recibe un numero decimal y devuelve ese numero en binario.
	 * 
	 * @param decimal: int
	 * @return int
	 */
	public static int deciABin(int decimal) {

		int bin = 0, potencia = 1;
		while (decimal >= 1) {

			int x = decimal % 2;

			bin = x * potencia + bin;

			decimal = decimal / 2;
			potencia = potencia * 10;

		}
		return bin;
	}

	/**
	 * Comvierte un numero en binario a decimal
	 * 
	 * @param binario: int
	 * @return int
	 */
	public static int binADeci(int binario) {

		int deci = 0, potencia = 1;

		while (binario > 0) {
			
			int x = binario % 10;
			
			deci += 
		}

		return deci;
	}

}
