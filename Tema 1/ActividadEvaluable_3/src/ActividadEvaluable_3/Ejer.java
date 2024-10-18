package ActividadEvaluable_3;

import java.util.Scanner;

public class Ejer {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Dame un numero mayor que 0: ");
		int num = sc.nextInt(), numInver = 0;

		while (num <= 0) {
			System.out.println("El numero introducido no es valido. Debe de ser mayor que cero.");
			System.out.print("Deme el nuevo numero: ");
			num = sc.nextInt();
		}

		while (num > 10) {

			int resto = num % 10;
			num = num / 10;

			numInver = numInver * 10 + resto;
		}

		numInver = numInver * 10 + num;

		System.out.println("El numero invertido es " + numInver);
	}

}
