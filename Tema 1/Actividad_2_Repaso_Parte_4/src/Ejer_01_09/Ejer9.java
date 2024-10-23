package Ejer_01_09;

import java.util.Scanner;

public class Ejer9 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de
	 * tres dados en base a la cantidad de seis obtenidos (estos números deben ser
	 * generados aleatoriamente), de acuerdo a lo siguiente: a) Tres seis : Oro, b)
	 * Dos seis : Plata, c) Un seis : Bronce, d) ningún seis :Perdiste
	 */
	
	public static void main(String[] args) {
		
		int puntuaje = 0;
		
		for (int i = 0; i < 3; i++) {
			
			if((int)(Math.random()*6 + 1) == 6) {
				puntuaje++;
			}
		}
		
		if(puntuaje == 3) {
			System.out.println("Oro");
		}else if (puntuaje == 2) {
			System.out.println("Plata");
		} else if (puntuaje == 1) {
			System.out.println("Bronce");
		} else {
			System.out.println("Perdiste");
		}
	}
}
