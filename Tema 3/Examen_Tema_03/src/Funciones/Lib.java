package Funciones;

import java.util.Scanner;

public class Lib {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Un punto de luz es una posición cuyo valor es multiplo de 3 e impar estando
	 * en una posición par (Ejercicio 1)
	 * 
	 * @param v: vector int
	 */
	public static void mostrarPuntosLuz(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if ((v[i] % 3 == 0) && (v[i] % 2 == 1) && (i % 2 == 0)) {
				System.out.println("[" + i + "]: " + v[i]);
			}
		}
	}

	/**
	 * Simplificamos cada fila calculando la media del productos de cada uno de los
	 * elementos de la fila i por la ctei almacenada en ek vector ctes, almacenando
	 * el resultado en vectorDerivada[i](Ejercicio 2)
	 * 
	 * @param m:    matrix int
	 * @param ctes: vector int
	 * @return vector int
	 */
	public static int[] calcularPrimeraDerivada(int[][] m, int[] ctes) {

		int[] vectorDerivada = new int[m.length];

		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m[0].length; j++) {
				sum += m[i][j] * ctes[i];
			}
			vectorDerivada[i] = sum / m[0].length;
		}

		return vectorDerivada;
	}

	/**
	 * Pide la dimension y genera un tablero en blanco de esas dimensiones
	 * (Ejercicio 3)
	 * 
	 * @return matrix int
	 */
	public static int[][] generarTablero() {
		System.out.print("Dame la dimensión del tablero: ");
		int dim = sc.nextInt();

		int[][] tablero = new int[dim][dim];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = 0;
			}
		}

		return tablero;
	}

	/**
	 * Coloca un barco en la fila fila de la columna columna rellenado las
	 * posiciones con el valor tamaño. Muestra un mensaje diciendo si se ha colocado
	 * correctamente o ha habido algun problema (Ejercicio 3)
	 * 
	 * @param tablero: matrix int
	 * @param fila:    int
	 * @param columna: int
	 * @param tamaño:  int
	 */
	public static void colocarBarcoFila(int[][] tablero, int fila, int columna, int tamaño) {

		if (columna + tamaño > tablero[0].length) {
			System.out.println("ERROR, EL BARCO SE SALE DEL TABLERO");
		} else {
			boolean barcoPresente = false;
			for (int i = 0; i < tamaño; i++) {
				if (tablero[fila][columna + i] != 0) {
					barcoPresente = true;
				}
			}

			if (barcoPresente) {
				System.out.println("ERROR, HAY UN BARCO EN LA ZONA");
			} else {
				for (int i = 0; i < tamaño; i++) {
					tablero[fila][columna + i] = tamaño;
				}
				System.out.println("BARCO COLOCADO CON EXITO EN LA FILA" + fila + " Y COLUMNA " + columna);
			}
		}
	}

	/**
	 * Coloca un baroc en la columna columna a partir de la fila fila rellenando las
	 * posiciones con el valor tam. Muestra un mensaje indicando si se ha colocado
	 * correctamente o hubo algun problema (Ejercicio 3)
	 * 
	 * @param tablero: matrix int
	 * @param fila:    int
	 * @param columna: int
	 * @param tamaño:  int
	 */
	public static void colocarBarcoColumna(int[][] tablero, int columna, int fila, int tamaño) {
		if (fila + tamaño > tablero.length) {
			System.out.println("ERROR, EL BARCO SE SALE DEL TABLERO");
		} else {
			boolean barcoPresente = false;
			for (int i = 0; i < tamaño; i++) {
				if (tablero[fila + i][columna] != 0) {
					barcoPresente = true;
				}
			}

			if (barcoPresente) {
				System.out.println("ERROR, HAY UN BARCO EN LA ZONA");
			} else {
				for (int i = 0; i < tamaño; i++) {
					tablero[fila + i][columna] = tamaño;
				}
				System.out.println("BARCO COLOCADO CON EXITO EN LA FILA" + fila + " Y COLUMNA " + columna);
			}
		}
	}

	/**
	 * Muestra por pantalla el tablero (Ejercicio 3)
	 * 
	 * @param m: matrix int
	 */
	public static void mostrarTablero(int[][] m) {
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
