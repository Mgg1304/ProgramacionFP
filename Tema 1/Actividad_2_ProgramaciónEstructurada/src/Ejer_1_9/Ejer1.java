package Ejer_1_9;

import java.util.Scanner;

public class Ejer1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcular la superficie y el perimetro de un cuadrado cuyo lado pediremos por
	 * teclado
	 */

	public static void main(String[] args) {

		float lado, superficie, perimetro;

		System.out.print("Dame el lado: ");
		lado = sc.nextFloat();

		superficie = lado * lado;
		perimetro = lado * 4;

		System.out.println("Lado: " + lado + ". Superficie: " + superficie + ". Perimetro: " + perimetro + ".");
	}

}
