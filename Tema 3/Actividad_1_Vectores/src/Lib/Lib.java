package Lib;

import java.util.Scanner;

public class Lib {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Muestra todos los elementos de un vector
	 * 
	 * @param x: vector int
	 */
	public static void mostrarVector(int v[]) {

		for (int i = 0; i < v.length; i++) {
			System.out.println("[" + i + "]: " + v[i]);
		}
	}

	/**
	 * Recibe el vector y lo rellena con los valores enteros necesarios
	 * 
	 * @param v: vector int
	 */
	public static void leerVector(int v[]) {

		for (int i = 0; i < v.length; i++) {
			System.out.print("v[" + i + "]: ");
			v[i] = sc.nextInt();
		}
	}

	/**
	 * Muestra los elementos de un vector en orden contrario
	 * 
	 * @param v: vector int
	 */
	public static void mostrarVectorInver(int v[]) {

		for (int i = v.length - 1; i > -1; i--) {
			System.out.println("[" + i + "]: " + v[i]);
		}
	}

	/**
	 * Suma los valores de los elementos del vector que se le pasa
	 * 
	 * @param v: int
	 * @return int
	 */
	public static int sum(int v[]) {

		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}

		return sum;
	}

	/**
	 * Calcula el valor maximo de un vector
	 * 
	 * @param v: vector int
	 * @return int
	 */
	public static int max(int v[]) {

		int max = v[0];

		for (int i = 1; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
		}

		return max;
	}

	/**
	 * Calcula la suma de los valores pares de un vector
	 * 
	 * @param v: vector int
	 * @return int
	 */
	public static int sumaNumerosPares(int v[]) {
		int sum = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				sum += v[i];
			}
		}
		return sum;
	}

	/**
	 * Calcula la suma de los valores impares de un vector
	 * 
	 * @param v: vector int
	 * @return int
	 */
	public static int sumaNumerosImpares(int v[]) {
		int sum = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 1) {
				sum += v[i];
			}
		}
		return sum;
	}

	/**
	 * Rellena la matriz de valores aleatorios entre 1 y 10
	 * 
	 * @param matrix:   matriz int
	 * @param filas:    int
	 * @param columnas: int
	 */
	public static void rellenarMatriz(int[][] matrix, int filas, int columnas) {

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrix[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
	}

	/**
	 * Genera la varianza que es la suma del cuadrado de cada elemento del vector
	 * dividido entre el numero de elementos del vector
	 * 
	 * @param x: vector int
	 * @return int
	 */
	public static int varianzaVector(int[] x) {

		int sum = 0;

		for (int i = 0; i < x.length; i++) {
			sum += Math.pow(x[i], 2);
		}

		sum = sum / x.length;
		return sum;
	}

	/**
	 * Ordena un vector de menor a mayor siguiendo el esquema Bubble Sort
	 * 
	 * @param x: vector int
	 */
	public static void ordenar(int[] x) {

		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Busca un valor real dentro de un vector y si lo encuentra devuelve la
	 * posición
	 * 
	 * @param v:     vector float
	 * @param value: float
	 * @return int
	 */
	public static int búsqueda(int v[], int value) {

		for (int i = 0; i < v.length; i++) {
			if (value == v[i]) {
				return i;
			}
		}
		return -1;
	}
}
