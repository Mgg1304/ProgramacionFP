package Ejer01_09;

import java.util.Scanner;
import Lib.Lib;

public class Ejer06 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Dime el numero de elementos del vector: ");
		int[] x = new int[sc.nextInt()];

		Lib.leerVector(x);
		
		Lib.ordenar(x);
		
		System.out.println("Mediana: " + x[x.length/2]);
	}
}
