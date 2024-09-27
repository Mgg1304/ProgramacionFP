package Bucles;

public class Ejemplo1 {
	
	/*
	 * Calcula los numeros del 1 al 20 y muestra los pares
	 */
	
	public static void main(String[] args) {
		
		int num = 0;
		
		while (num <= 20) {
			if (num%2 == 0) {
				System.out.println( num + " es par");
			}
			
			num ++;
		}
		
	}

}
