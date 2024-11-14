package Lib;

import java.util.Scanner;

public class Lib {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Itera la matriz que se le introduce para rellenarla con los valores
	 * necesarios
	 * 
	 * @param m: matrix int
	 */
	public static void leerMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("[" + i + "]: ");
				m[i][j] = sc.nextInt();
			}
			System.out.println();
		}
	}

	/**
	 * Imprime la información de la matriz que se le pasa ordenada por filas
	 * 
	 * @param m: matrix int
	 */
	public static void mostrarMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Imprime por pantalla la suma de los valores de cada fila
	 * 
	 * @param m
	 */
	public static void sumaFilas(int[][] m) {
		int[] sumaFilas = new int[m.length];
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				sumaFilas[i] += m[i][j];
			}
		}
		System.out.println("Suma por columnas:");
		for (int i = 0; i < m.length; i++) {
			System.out.println("Fila " + i + ": " + sumaFilas[i]);
		}
	}

	/**
	 * Imprime por pantalla la suma de las columnas de la matriz que se le pasa. La
	 * matriz debe de ser cuadrada, es decir, tener la misma altura que anchura
	 * 
	 * @param m: matriz int
	 */
	public static void sumarColumnas(int[][] m) {
		int filas = m.length;
		int columnas = m[0].length;

		int[] sumaColumnas = new int[columnas];

		for (int j = 0; j < columnas; j++) {
			for (int i = 0; i < filas; i++) {
				sumaColumnas[j] += m[i][j];
			}
		}

		System.out.println("Suma por columnas:");
		for (int j = 0; j < columnas; j++) {
			System.out.println("Columna " + j + ": " + sumaColumnas[j]);
		}
	}

	/**
	 * Retorna una matrix que intercambia las filas por las columnas y viceversa de
	 * la que se le pasa
	 * 
	 * @param mVieja: matrix int
	 * @return matrix int
	 */
	public static int[][] intercambiar(int[][] mVieja) {
		int[][] mNueva = new int[mVieja.length][mVieja.length];

		for (int i = 0; i < mVieja.length; i++) {
			for (int j = 0; j < mVieja[i].length; j++) {
				mNueva[i][j] = mVieja[j][i];
			}
		}

		return mNueva;
	}

	/**
	 * Comprueba si una función es selectiva. Una función es selectiva si es
	 * cuadrada, es decir, tiene mismo numero de filas y columnas y si todos los
	 * elementos de la diagonal tienen valor 1
	 * 
	 * @param m: matrix int
	 * @return boolean
	 */
	public static boolean esSelectiva(int[][] m) {
		if (m.length != m[0].length)
			return false;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] != 1)
					return false;
			}
		}
		return true;
	}
	
	public static boolean tienePuntoSilla(int[][] m) {
		boolean max = true, min = true;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
			}
		}
	}
	
	
}
