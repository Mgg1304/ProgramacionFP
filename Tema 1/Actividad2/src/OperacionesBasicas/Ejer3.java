package OperacionesBasicas;

import java.util.Scanner;

public class Ejer3 {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Ejercico 3: Convierte de segundos a horas, minutos y segundos.
	 * */
	
	public static void main(String[] args) {
		
		int temp, hora, min, sec;
		
		//Pido los segundos
		System.out.println("Dame el numero de segundos: ");
		temp = sc.nextInt();
		
		if (temp > 0) {
			//Calculo el numero de horas
			hora = temp / 3600;
			
			temp = temp - hora*3600;
			
			//Calculo el numero de minutos
			min = temp / 60;
			
			//Hacemos el resto de los segundos no contados en los minutos
			sec = temp - min*60;
			
			System.out.println(temp + " segundos son " + hora + " horas, " + min + " minutos y " + sec + " segundos.");
			 
		}else {
			System.out.println("El tiempo no puede ser negativo");
		}
		
		
		
	}
}
