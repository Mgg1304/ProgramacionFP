package Ejercicios;

import java.util.Scanner;

public class Ejer3 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num, raiz = 1;

		System.out.print("Dame el numero del que encontrar la raiz: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("Error, no se puede calcular el valor de la raiz de un numero negativo");
		} else {
			while (num >= raiz * raiz) {
				raiz++;
			}

			System.out.println("La raiz sera " + --raiz);
		}

	}

}
