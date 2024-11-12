package Ejer;

import java.util.Scanner;
import Lib.Lib;

public class Ejer04 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Dime el numero de elementos del vector: ");
		int[] x = new int[sc.nextInt()];

		Lib.leerVector(x);

		System.out.println(Lib.varianzaVector(x));
	}

}
