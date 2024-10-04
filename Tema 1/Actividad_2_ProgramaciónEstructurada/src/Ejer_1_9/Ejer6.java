package Ejer_1_9;

import java.util.Scanner;

public class Ejer6 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula la raíz cuadrada de un numero que pediremos por teclado, teniendo la
	 * precaución de que el número no sea negativo; en este caso se debe informar de
	 * que la operación no es posible.
	 */
	public static void main(String[] args) {
		
		double num;
		double sol;
		
		System.out.println("Dame un numero: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("El numero es negativo, no se puede hacer la raiz");
		}else {
			sol = Math.sqrt(num);
			
			System.out.println("La raiz cuadrada es " + sol);
		}
	}
}
