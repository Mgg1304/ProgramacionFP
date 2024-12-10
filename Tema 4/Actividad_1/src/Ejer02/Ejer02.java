package Ejer02;

import java.util.Scanner;

public class Ejer02 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Dame los valores para el nombre, edad, sexo, peso y altura separados por espacios");
		String nombre = sc.next();
		int edad = sc.nextInt();
		char sexo = sc.next().charAt(0);
		double peso = sc.nextDouble(), altura = sc.nextDouble();
		
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();
		
		System.out.println("PESO IDEAL");
		System.out.println("Persona 1" + persona1.calcularIMC());
		System.out.println("Persona 2" + persona2.calcularIMC());
		System.out.println("Persona 3" + persona3.calcularIMC());
		
		System.out.println("MAYORIA DE EDAD");
		System.out.println("Persona 1" + persona1.esMayorDeEdad());
		System.out.println("Persona 2" + persona2.esMayorDeEdad());
		System.out.println("Persona 3" + persona3.esMayorDeEdad());
		
		System.out.println("INFORMACIÓN");
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}
}
