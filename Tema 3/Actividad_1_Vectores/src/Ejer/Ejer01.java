package Ejer;

import java.util.Scanner;
import Lib.Lib;

public class Ejer01 {

	public static Scanner sc = new Scanner(System.in);

	/*
	 * Pide 10 numeros y los guarda en un vector. Llama a la función mostrarVector
	 * para mostrar los valores necesarios
	 */
	public static void main(String[] args) {

		int[] v = new int[10];

		for (int i = 0; i < v.length; i++) {
			System.out.print("Dame el siguiente numero: ");
			v[i] = sc.nextInt();
		}

		Lib.mostrarVector(v);
	}

}
