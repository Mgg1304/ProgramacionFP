package Ejer_10_19;

import java.util.Scanner;

public class Ejer18 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Determinar el precio de un billete de tren, conociendo la distancia a
	 * recorrer y sabiendo que si el número de días de estancia es superior a 7 y la
	 * distancia superior a 800km el billete tiene una reducción del 30%. El precio
	 * del km es de 2,5€
	 */
	public static void main(String[] args) {

		int kilometros, dias;
		double precio;

		System.out.print("Dame la distancia a calcular: ");
		kilometros = sc.nextInt();

		System.out.print("Dame la duración del viaje: ");
		dias = sc.nextInt();

		precio = kilometros * 2.5;

		if ((kilometros > 800) && (dias > 7)) {
			precio = precio * 0.7;
		}

		System.out.println("El precio sera: " + precio);
	}
}
