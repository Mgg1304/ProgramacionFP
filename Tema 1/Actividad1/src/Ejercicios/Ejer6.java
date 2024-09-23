package Ejercicios;

public class Ejer6 {
	
	public static void main(String[] args) {
		
//		Se tienen 3 variables A, B y C. escribe las instrucciones necesarias
//		para intercambiar sus valores, san cuales sean, de manera que:
//			• B tome el valor de A original
//			• C tome el valor de B original
//			• A tome el valor de C original
		
		int a, b, c, temp;
		
		a = 1; b = 2; c = 3; 
		
		temp = b;
		b = a;
		a = c;
		c = temp;
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		
	}
}
