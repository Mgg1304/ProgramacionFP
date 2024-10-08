package Ejer_10_19;

import java.util.Scanner;

public class Ejer16 {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Dada una hora por teclado (horas, minutos y segundos) realizar un algoritmo
	 * que muestre la hora después de incrementar un segundo.
	 */
	public static void main(String[] args) {

		int horas, minutos, segundos;

		System.out.print("Dame las horas: ");
		horas = sc.nextInt();

		System.out.print("Dame los minutos: ");
		minutos = sc.nextInt();

		System.out.print("Dame los segundos: ");
		segundos = sc.nextInt();

		segundos++;

		while (segundos >= 60) {
			minutos++;
			segundos -= 60;
		}
		while (minutos >= 60) {
			horas++;
			minutos -= 60;
		}

		System.out.println("El tiempo una vez aumtentado un segundo es " + horas + " horas, " + minutos + " minutos y "
				+ segundos + " segundos.");
	}
}
