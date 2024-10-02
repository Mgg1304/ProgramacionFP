package Ejer_1_9;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Calcular la superficie y el perimetro de un rectangulo cuyos lados pediremos
	 * por teclado
	 */
	public static void main(String[] args) {

		float base, altura, perimetro, superficie;

		System.out.print("Dame la base: ");
		base = sc.nextFloat();

		System.out.print("Dame la altura: ");
		altura = sc.nextFloat();

		perimetro = 2 * altura + 2 * base;
		superficie = base*altura;
		
		System.out.println("Base: " + base + ". Altura: " + altura + ". Perimetro: " + perimetro + ". Superficie: " + superficie + ".");
	}

}
