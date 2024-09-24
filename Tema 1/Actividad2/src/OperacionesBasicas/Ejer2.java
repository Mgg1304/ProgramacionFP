package OperacionesBasicas;

import java.util.Scanner;

public class Ejer2 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercicio 2: Introducir numero de segundos y devolver numero de minutos y segundos 
	 */
	
	public static void main(String[] args) {
		
		int temp, min, sec;
		
		//Pedimos los minutos iniciales
		System.out.println("Dame el numero de segundos: ");
		temp = sc.nextInt();
		
		//Sacamos cuantos minutos hay en el tiempo dado
		min = temp / 60;
		
		//Hacemos el resto de los segundos no contados en los minutos
		sec = temp - min*60;
		
		System.out.println(temp + " segundos son " + min + " minutos y " + sec + " segundos.");
		
	}
}
