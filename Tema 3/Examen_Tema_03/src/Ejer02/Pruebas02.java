package Ejer02;

import Funciones.Lib;

public class Pruebas02 {

	
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 2");
		int[][] m = { { 5, 7, 5, 4, 2 }, { 5, 3, 9, 6, 5 }, { 1, 4, 7, 7, 6 }, { 8, 6, 2, 9, 4 } };
		int[] v = { 6, 2, 6, 2 };

		int [] v2 = Lib.calcularPrimeraDerivada(m, v);
		
		for (int i = 0; i < v2.length; i++) {
			System.out.println(v2[i]);
		}

	}
		

}
