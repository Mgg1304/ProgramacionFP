package Ejercicios;

public class Ejer1 {

	//Ejercicio 1 de PDF
	
	public static void main(String[] args) {
		//A y B son de tipo entero
		int a, b;
		
		//C y D son de tipo real
 		float c;
 		double d;
 		
 		//E y F son de tipo caracter
		char e, f;
		
		//G es de tipo logico (V/F)
		boolean g;
		
		a = 20;
		System.out.println("a: " + a);
		b = 12;
		System.out.println("b: " + b);
		f = 'c';
		System.out.println("f: " + f);
		b = 5500;
		System.out.println("b: " + b);
		c = 0;
		System.out.println("c: " + c);
		d = c;
		System.out.println("d: " + d);
		e = f;
		System.out.println("e: " + e);
		e = 'F';
		System.out.println("e: " + e);
		
		//No se puede asignar un valor real a un entero
		//a = 12.56;
		g = true;
		System.out.println("g: " + g);
		g = false;
		System.out.println("g: " + g);
		
		//No se puede asignar un valor booleano a un char
		//f = g;
		
	}

}
