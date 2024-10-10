package Ejer_20_29;

import java.util.Scanner;

public class Ejer25 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Calcula la media para una cantidad indefinida de números. El programa parará
	 * de pedir números cuando se le introduzca un número negativo, en ese momento
	 * nos dará la media de los números introducidos hasta ese momento y la cantidad
	 * de los mismos ( si incluir al negativo que usamos para acabar)
	 */
	public static void main(String[] args) {

		int num = 1, sumNum = 0, contador = 0;
		
		System.out.print("Dame el siguiente numero: ");
		num = sc.nextInt();
		if (num>0) {
			do {
				sumNum += num;
				contador++;
				System.out.print("Dame el siguiente numero: ");
				num = sc.nextInt();
				
				
			}while(num>0);
			
		 double media = sumNum/contador;
		 
		 System.out.println("Fin de la suma. Media de los numeros positivos: " + media);
		}else {
			System.out.println("Numero invalido");
		}
		
		
	}

}
