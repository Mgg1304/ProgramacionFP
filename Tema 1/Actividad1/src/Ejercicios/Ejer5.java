package Ejercicios;

public class Ejer5 {

	public static void main(String[] args) {
		
		//Se tienen las variables A, B. Escribir las instrucciones necesarias para
		//intercambiar sus valores sean cuales sean.

		
		int a, b, temp;
		
		a = 1; b = 2;
		
		System.out.println("a: " + a + " b: " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a + " b: " + b);
	}

}
