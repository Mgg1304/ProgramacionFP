package Ejer3;

import java.util.Scanner;

public class Ejer3 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Actividad 3 Implementar una función que reciba como parámetro un número y
	 * retorne un valor lógico indicando si es positivo o negativo. El programa
	 * principal leer el numero por teclado y llama a la función. Muestra un mensaje
	 * en función del valor de retorno.
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Dame el numero: ");
		int num = sc.nextInt();
		
		Boolean positivo = Lib_ejer3.comprobarSigno(num);
		
		if(positivo) {
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es negativo");
		}
	}

	

}
