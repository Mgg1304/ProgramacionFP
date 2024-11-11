package Ejer01_09;

import java.util.Scanner;
import Lib.Lib;

public class Ejer04 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Dame las dimensiones de la matriz, "
				+ "primero las filas y luego las columnas separadas por espacios: ");
		int filas = sc.nextInt();
		int columnas = sc.nextInt();

		int[][] matrix = new int[filas][columnas];
		Lib.rellenarMatriz(matrix, filas, columnas);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
