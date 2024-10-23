package Ejercicios;

import java.util.Scanner;

public class Ejer1 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double num1, num2, num3;

		System.out.print("Dame el primer numero: ");
		num1 = sc.nextDouble();

		System.out.print("Dame el segundo numero: ");
		num2 = sc.nextDouble();

		System.out.print("Dame el tercer numero: ");
		num3 = sc.nextDouble();

		if ((num1 == num2) && (num2 == num3)) {
			System.out.println("Los numeros son iguales");
		} else if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
			System.out.println("Hay dos numeros iguales");
		} else {
			System.out.println("Los tres numeros son diferentes");
		}
	}

}
