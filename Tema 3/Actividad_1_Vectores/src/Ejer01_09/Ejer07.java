package Ejer01_09;

import java.util.Scanner;

import Lib.Lib;

public class Ejer07 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Dame el tamaño del vector que quieres generar: ");
		int [] x = new int [sc.nextInt()];
		
		Lib.leerVector(x);
		
		System.out.print(Lib.búsqueda(x, 0));
	}
}
