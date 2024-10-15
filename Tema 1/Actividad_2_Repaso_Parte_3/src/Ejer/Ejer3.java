package Ejer;

import java.util.Scanner;

public class Ejer3 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escriba un programa en Java que solicite números al usuario hasta que se
	 * hayan introducido 10 números o la suma de todos los números leídos sea mayor
	 * que 100. A continuación mostrar un mensaje indicando qué condición se ha
	 * cumplido (es decir, si se han introducido 10 números o si su suma es mayor
	 * que 100).
	 */
	public static void main(String[] args) {

		int num, sumaAcumulada = 0, totalNum = 0;

		while ((totalNum < 10) && (sumaAcumulada < 100)) {
			
			System.out.println("Dame otro numero:");
			num = sc.nextInt();
			
			totalNum++;
			sumaAcumulada += num;
		}
		
		if(totalNum == 10) {
			System.out.println("Se alcanzo el limite de numeros.");
		} else {
			System.out.println("Se alcanzo el limite de la suma.");
		}
	}

}
