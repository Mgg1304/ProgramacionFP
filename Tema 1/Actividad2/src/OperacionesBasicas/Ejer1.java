package OperacionesBasicas;

import java.util.Scanner;

public class Ejer1 {
	
	public static Scanner sc = new Scanner (System.in);
	
	/*
	 * Ejercicio 1: Escribir un programa que pida dos numeros y haga la media aritmetica 
	 */
	
	public static void main(String[] args) {
		
		
		float n1, n2, n3;
		
		System.out.println("CALCULO DE MEDIA ARITMETICA");
		
		//Leo el primer numero 
		System.out.println("Dame el primer numero: ");
		n1 = sc.nextFloat();
		
		//Leo el segundo numero
		System.out.println("Dame el segundo numero: ");
		n2 = sc.nextFloat();
		
		//Hago la media aritmetica
		n3 = (n1 + n2)/2;
		System.out.println("La media aritmetica de " +n1+ " y de " +n2+ " es " + n3);
		
	}

}
