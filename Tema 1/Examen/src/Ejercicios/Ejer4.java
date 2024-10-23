package Ejercicios;

import java.util.Scanner;

public class Ejer4 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dia, mes, anyo, total;

		System.out.print("Dame el numero del dia: ");
		dia = sc.nextInt();

		System.out.print("Dame el numero del mes: ");
		mes = sc.nextInt();

		System.out.print("Dame el numero del año: ");
		anyo = sc.nextInt();

		total = dia + mes + anyo;

		int total2 = 0;
		for (int i = 0; i < 4; i++) {
			int resto = total % 10;
			total = total / 10;
			total2 += resto;

		}

		int numMagic = 0;

		if (total2 > 10) {

			int resto = total2 % 10;
			numMagic = resto + (total2 / 10);
		} else {
			numMagic = total2;
		}

		System.out.println("El numero magico es " + numMagic);

	}

}
