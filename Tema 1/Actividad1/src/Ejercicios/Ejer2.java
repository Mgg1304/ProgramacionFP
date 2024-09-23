package Ejercicios;

public class Ejer2 {

	public static void main(String[] args) {
		
		//A, B y C son enteros
		int a, b, c;
		
		// A vale 3 y B vale 4
		a = 3;
		b = 4;
		
		//C=A + 2*B
		c = a + 2*b;
		
		//C=C + B
		c = c + b;
		
		//B = C - A;
		b = c - a;
		
		System.out.printf("a: " + a + " b: " + b + " c: " + c);

	}

}
