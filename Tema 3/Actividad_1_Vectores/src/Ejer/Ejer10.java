package Ejer;

import Lib.Lib;

public class Ejer10 {

	public static void main(String[] args) {

		int[] v = new int[10];

		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 10 + 1);
		}

		Lib.mostrarVectorHorizontal(v);
		System.out.println(Lib.buscarValor(v, 7));
	}

}
