package Ejer;

import java.util.Scanner;

public class Ejer2 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escriba un programa en Java que solicite 10 números enteros positivos al
	 * usuario y calcule y muestre los siguientes valores: • La suma de todos los
	 * números leídos. • La media de los números. • El mayor número introducido. •
	 * El menor número introducido.
	 */
	public static void main(String[] args) {

		int sum = 0, numNum, max = 0, min = 0;

		System.out.print("Dame el numero de elementos que va a haber: ");
		numNum = sc.nextInt();

		for (int i = 0; i < numNum; i++) {
			System.out.print("Dame el siguiente numero: ");
			int num = sc.nextInt();
			
			if(i == 0) {
				min = num;
				max = num;
			}
			
			sum += num;
			
			if(num>max) {
				max = num;
			} else if (num<min) {
				min = num;
			}
		}
		
		System.out.println("Suma: " + sum + ". Media: " + (double)(sum/numNum) + ". Max: " + max + ". Min: " + min + ".");
	}
}
