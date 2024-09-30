package bucleFor;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer15 {
	public static Scanner sc = new Scanner(System.in);

	/*
	 * Ejercicio 15: Escribe un programa que pida dos numeros y diga cuales son
	 * pares y cuales impares del primero al segundo
	 */

	public static void main(String[] args) {

		int priNum, secNum;

		// Pido el primer numero
		System.out.println("Dame el primer numero: ");
		priNum = sc.nextInt();

		// Pido el segundo numero, que tiene que ser mayor o igual al primero
		System.out.println("Dame el segundo numero: ");
		secNum = sc.nextInt();

		if (secNum < priNum) {
			System.out.println("Pedi un numero mayor que " + priNum + " no menor");
		} else {
			for (int i = priNum; i <= secNum; i++) {
				if (i % 2 == 0) {
					System.out.println(i + " es par");
				} else {
					System.out.println(i + " es inpar");
				}
			}
		}
	}
}
