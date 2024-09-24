package ifElse;

import java.util.Scanner;

public class Ejer8 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 8: Escribe un programa que pida dos numeros y te devuelva si el mayor es multiplo del menor
	 * */
	public static void main(String[] args) {
		int num1, num2, id, mayor = 0, menor = 0;
		
		//Pido el primer numero
		System.out.println("Dame el primer numero: ");
		num1 = sc.nextInt();
		
		//Pido el segundo numero
		System.out.println("Dame el segundo numero:");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			id = num2 % num1;
			mayor = num2;
			menor = num1;
		}else {
			id = num1 % num2;
			mayor = num1;
			menor = num2;
		}
		
		if (id == 0) {
			System.out.println(mayor + " no es multiplo de " + menor);
		}else {
			System.out.println(mayor + " es multiplo de " + menor);
		}
		
	}
}
