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
	 * 
	 * @param v
	 */
	public static void mostrarVectorHorizontal(int v[]) {
		System.out.print("[" + 0 + "]: " + v[0]);
		for (int i = 1; i < v.length; i++) {
			System.out.print(", [" + i + "]: " + v[i]);
		}
		System.out.println();
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
	 * @param v:     vector int
	 * @param value: int
	 * @return int
	 */
	public static int búsqueda(int[] x, int value) {

		for (int i = 0; i < x.length; i++) {
			if (value == x[i]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Coje los valores del vector y los ordena de forma que queden primero los
	 * numeros pares y despues los impares
	 * 
	 * @param x: vector int
	 */
	public static void ordenarParImpar(int[] x) {

		int[] vPar = new int[x.length];
		int[] vImpar = new int[x.length];
		int posPar = 0, posImpar = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				vPar[posPar] = x[i];
				posPar++;
			} else {
				vImpar[posImpar] = x[i];
				posImpar++;
			}
		}

		int[] vPar2 = new int[posPar];
		for (int i = 0; i < vPar2.length; i++) {
			vPar2[i] = vPar[i];
		}

		int[] vImpar2 = new int[posImpar];
		for (int i = 0; i < vImpar2.length; i++) {
			vImpar2[i] = vImpar[i];

		}
		ordenar(vPar2);
		ordenarDescendente(vImpar2);

		for (int i = 0; i < x.length; i++) {
			if (i < posPar) {
				x[i] = vPar2[i];
			} else {
				x[i] = vImpar2[i - posImpar + 1];
			}
		}

	}

	/**
	 * Ordena los elementos de mayor a menor
	 * 
	 * @param x: vector int
	 */
	public static void ordenarDescendente(int[] x) {

		for (int i = 0; i < x.length - 1; i++) {
			for (int j = 0; j < x.length - i - 1; j++) {
				if (x[j] < x[j + 1]) {
					int temp = x[j];
					x[j] = x[j + 1];
					x[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Comprueba que el generador de numeros aleatorios de java genere numeros
	 * aleatorios con una distribución uniforme
	 */
	public static void comprobarAleatoriedad() {

		int[] v = new int[100];

		for (int i = 0; i < 100; i++) {
			v[i] = (int) (Math.random() * 10 + 1);
		}

		double media = sum(v) / v.length;

	}

	/**
	 * Comprueba si un vector tiene pico. Para que tenga pico, el valor de la
	 * posición anterior y la siguiente deben de ser menores a la posición que se
	 * comrpueba.
	 * 
	 * @param v: vector int
	 * @return boolean
	 */
	public static boolean tienePico(int[] v) {

		for (int i = 1; i < v.length - 1; i++) {
			if ((v[i - 1] < v[i]) && (v[i + 1] < v[i])) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Comprueba si un vector tiene pico. Para que tenga pico, el valor de la
	 * posición anterior y la siguiente deben de ser mayores a la posición que se
	 * comrpueba.
	 * 
	 * @param v: vector int
	 * @return boolean
	 */
	public static boolean tieneValle(int[] v) {
		for (int i = 1; i < v.length - 1; i++) {
			if ((v[i - 1] > v[i]) && (v[i + 1] > v[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static int buscarValor(int[] v, int valor) {
		int contador = 0;
		
		for (int i = 0; i < v.length; i++) {
			if(valor == v[i]) {
				contador++;
			}
		}
		
		return contador;
	}

}
