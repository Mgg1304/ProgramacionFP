package Ejer;

import java.util.Scanner;

public class Ejer4 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Escribir un programa en Java para adivinar un número entre 1 y 20 que
	 * previamente se ha definido como una constante. El programa irá pidiendo
	 * números al usuario y, siempre que dicho número no coincida con el número
	 * secreto, le indicará si el número introducido es mayor o menor que el número
	 * secreto que tiene que adivinar. Al final, el programa indicará la cantidad de
	 * intentos que se han necesitado para adivinar el número. Si el número de
	 * intentos es menor que 5 se mostrará “Enhorabuena!”. Si es un valor entre 5 y
	 * 10 se mostrará el mensaje “No está mal”. Si el número de intentos es mayor
	 * que 10 se mostrará el mensaje “Debe practicar más”. Para calcular números
	 * aleatorios Math.ramdom()*CantidadNumeros+inicio
	 */
	public static void main(String[] args) {
		
		int numSecre = (int) (Math.random()*20+1);
		int num, intentos = 0;
		boolean encontrado = false;
		
		for (int i = 0; (i < 10)&&(!encontrado); i++) {
			
			System.out.print("Dame el siguiente numero a probar: ");
			num = sc.nextInt();
			
			if(num == numSecre) {
				encontrado = true;
				intentos++;
				System.out.println("Has encontrado el numero");
			}else if (num > numSecre) {
				System.out.println("El numero que estas buscando es menor que " + num);
				intentos++;
			} else if(num < numSecre) {
				System.out.println("El numero que estas buscando es mayor que " + num);
				intentos++;
			}
		}
		
		if(intentos < 5) {
			System.out.println("Enorabuena!!");
		} else if((intentos > 5)&&(intentos < 10)) {
			System.out.println("No esta mal");
		} else {
			System.out.println("Debes practicar más");
		}
		
		System.out.println("El numero era " + numSecre);
		
		
	}

}
