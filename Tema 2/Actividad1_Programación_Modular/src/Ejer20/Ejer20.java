package Ejer20;

import java.util.Scanner;

public class Ejer20 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Introduce tres numeros separador por espacios: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		Ejer20_lib.ordenar(num1, num2, num3);
	}

}
