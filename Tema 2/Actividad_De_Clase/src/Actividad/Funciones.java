package Actividad;

import java.util.Scanner;

public class Funciones {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula el numero de digitos de un numero
	 * 
	 * @param num: int
	 * @return int
	 */
	public static int numeroDeDigitos(int num) {
		int cifras = 0;
		while (num > 10) {
			num = num / 10;
			cifras++;
		}

		cifras++;

		return cifras;
	}

	/**
	 * Calcula el inverso del numero
	 * 
	 * @param num: int
	 * @return int
	 */
	public static int numeroInverso(int num) {
		int numInver = 0;

		while (num > 10) {
			int x = num % 10;
			numInver = numInver * 10 + x;
			num = num / 10;
		}

		int x = num % 10;
		numInver = numInver * 10 + x;
		num = num / 10;

		return numInver;
	}

	/**
	 * Comrpueba si el numero dado contiene un digito especifico
	 * 
	 * @param num
	 * @param digito
	 * @return
	 */
	public static boolean contieneDigito(int num, int digito) {
		int x;
		while (num > 0) {
			x = num % 10;
			num = num / 10;
			if (x == digito) {
				return true;
			}
		}
		x = num % 10;
		if (x == digito) {
			return true;
		}
		return false;
	}

	/**
	 * Ofrece dos opciones de que se quiere hacer
	 * 
	 * @return int
	 */
	public static int menu() {

		System.out.println("Seleccione la opción que quiera hacer");
		System.out.println("1.-Numeros cuñados");
		System.out.println("2.-Números familia");
		int opcion = sc.nextInt();

		return opcion;
	}

	/**
	 * Comprueba si dos numeros son cuñados. Para ser cuñados tiene que tener el
	 * mismo numero de cifras y uno tiene que ser inverso del otro
	 * 
	 * @param num1: int
	 * @param num2: int
	 * @return boolean
	 */
	public static boolean sonCuñados(int num1, int num2) {
		if (numeroDeDigitos(num1) != numeroDeDigitos(num2))
			return false;
		if (numeroInverso(num1) == num2)
			return true;
		else
			return false;
	}

	/**
	 * Comrpueba si dos numeros son familia. Para ser familia, tienen que compartir
	 * un digito
	 * 
	 * @param num1: int
	 * @param num2: int 
	 * @return boolean
	 */
	public static boolean sonFamilia(int num1, int num2) {
		while (num2 > 10) {
			int x = num2 % 10;
			num2 = num2 / 10;

			if (contieneDigito(num1, x))
				return true;
		}
		
		int x = num2 % 10;
		num2 = num2 / 10;

		if (contieneDigito(num1, x))
			return true;
		
		return false;
	}
}
