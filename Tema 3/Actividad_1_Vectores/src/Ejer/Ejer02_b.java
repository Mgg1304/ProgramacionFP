package Ejer;

import Lib.Lib;

public class Ejer02_b {
	
	
	public static void main(String[] args) {
		
		int v[] = new int[10];
		//void leerVector(int v[])
		Lib.leerVector(v);
		//int suma(int v[])
		System.out.println(Lib.sum(v));
		//int max(int v[])
		System.out.println(Lib.max(v));
		//int sumaNumerosPares(int v[])
		System.out.println(Lib.sumaNumerosPares(v));
		//int sumaPosicionesImpares(int v[])
		System.out.println(Lib.sumaNumerosImpares(v));
	}

}
