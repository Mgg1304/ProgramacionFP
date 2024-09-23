package Ejercicios;

public class Ejer3 {

	public static void main(String[] args) {
		
		//X es real
		double x;
		
		//X = 2.0
		x = 2;
		
		//X = (X*X)*2
		x = (x*x)*2;
		
		//X = raiz(X + raiz(x) + 5);
		x = Math.sqrt(x + Math.sqrt(x) + 5);
		
		System.out.println("x: " + x);

	}

}
