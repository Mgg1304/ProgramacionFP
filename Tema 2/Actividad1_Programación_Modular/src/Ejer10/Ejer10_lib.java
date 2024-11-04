package Ejer10;

public class Ejer10_lib {

	/**
	 * Devuelve el sueldo en función de cuantas horas se hayan trabajado. Si se ha
	 * trabajado en un domingo, se paga más
	 * 
	 * @param hDiurnas:   int
	 * @param hNocturnas: int
	 * @param domingo:    boolean
	 * @return int
	 */
	public static int sueldo(int hDiurnas, int hNocturnas, boolean domingo) {

		if (domingo) {
			return (hDiurnas * 20) + (hNocturnas * 35);
		} else {
			return (hDiurnas * 30) + (hNocturnas * 50);
		}
	}

}
