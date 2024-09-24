package OperacionesBasicas;

import java.util.Scanner;

public class Ejer1 {
	
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		float n1, n2, n3;
		
		System.out.println("CALCULO DE MEDIA ARITMETICA");
		
		//Leo el primer numero 
		System.out.println("Dame el primer numero: ");
		n1 = sc.nextInt();
		
		//Leo el segundo numero
		System.out.println("Dame el segundo numero: ");
		n2 = sc.nextInt();
		
		//Hago la media aritmetica
		n3 = (n1 + n2)/2;
		System.out.println("La media aritmetica de " +n1+ " y de " +n2+ " es " + n3);
		
	}

}
