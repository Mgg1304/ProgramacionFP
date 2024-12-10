package Ejer03;

import Funciones.Lib;

public class Pruebas03 {
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 3");
		int [][] tablero = Lib.generarTablero();
		
		Lib.colocarBarcoFila(tablero, 1, 2, 3);
		Lib.colocarBarcoFila(tablero, 2, 1, 2);
		Lib.colocarBarcoFila(tablero, 0, 0, 4);
		Lib.colocarBarcoFila(tablero, 1, 1, 3);
		Lib.colocarBarcoFila(tablero, 2, 2, 3);
		
		Lib.colocarBarcoColumna(tablero, 3, 2, 3);
		Lib.colocarBarcoColumna(tablero, 4, 3, 2);
		Lib.colocarBarcoColumna(tablero, 1, 2, 2);
		Lib.colocarBarcoColumna(tablero, 0, 3, 3);
		
		Lib.mostrarTablero(tablero);
	}
}
