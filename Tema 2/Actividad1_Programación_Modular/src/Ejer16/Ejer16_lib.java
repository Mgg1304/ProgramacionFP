package Ejer16;

public class Ejer16_lib {

	/**
	 * Incrementa en uno el segundo y hace las transformaciones necesarias para que
	 * la hora sea valida.
	 * 
	 * @param horas:   int
	 * @param minutos: int
	 * @param sec:     int
	 */
	public static void horaIncrementarSec(int horas, int minutos, int sec) {

		sec++;

		while (sec > 60) {
			minutos++;
			sec -= 60;
		}
		while (minutos > 60) {
			horas++;
			minutos -= 60;
		}

		System.out.print("Una vez incrementado en un segundo, la hora es " + horas + ":" + minutos + ":" + sec);
	}

}
