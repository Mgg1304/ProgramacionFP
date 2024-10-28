package Actividad;

import java.util.Scanner;

public class Pruebas {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Deme dos numeros separados por un espacio: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		int opcion = Funciones.menu();
		
		if(opcion == 1) {
			if(Funciones.sonCuñados(num1, num2)) System.out.println("Son cuñados");
			else System.out.println("No son cuñados");
		}else {
			if(Funciones.sonFamilia(num1, num2)) System.out.println("Son familia");
			else System.out.println("No son familia");
		}
	}
}
