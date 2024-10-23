package Ejer_01_09;

import java.util.Scanner;

public class Ejer7 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Vamos a diseñar una calculadora que se enciende y hasta que no tecleamos -1
	 * no se apaga. Esta calculadora funciona de la siguiente manera:
	 * 
	 * • Recogemos los datos A y B
	 * 
	 * • Si operación es 1 calcula la raíz cuadrada de la suma de A y B
	 * 
	 * • Si operación es 2 calcula A / B. Vigilamos que B no sea 0...
	 * 
	 * • Si la operación es 3 calculamos la siguiente fórmula: ( A * B ) /2.5
	 */
	public static void main(String[] args) {

		int operación = 0, A, B;
		
		while(operación != -1) {
			
			System.out.println("Cual es el valor de A: ");
			A = sc.nextInt();
			
			System.out.println("Cual es el valor de B: ");
			B = sc.nextInt();
			
			System.out.println("¿Que operaciones desea realizar?");
			System.out.println("1 Raiz cuadrada de la suma de A y B");
			System.out.println("2 A/B");
			System.out.println("3 (A*B)/2.5");
			operación = sc.nextInt();
			
			if(operación == 1) {
				System.out.println(Math.sqrt(A+B));
			}else if (operación == 2) {
				if(B == 0) {
					System.out.println("No se puede hacer esta operación");
				}else {
					System.out.println((double)A/B);
				}
			}else if (operación == 3) {
				System.out.println((A*B)/2.5);
			}
		}
	}
}
