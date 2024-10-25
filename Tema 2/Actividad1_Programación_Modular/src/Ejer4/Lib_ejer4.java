package Ejer4;

public class Lib_ejer4 {

	/**
	 * Imprime la suma de dos valores
	 * 
	 * @param a: entero
	 * @param b: entero
	 */
	public static void sumar(int a, int b) {
		System.out.println("El valor de la suma es " + (a + b));
	}

	/**
	 * Imprime la resta de dos valores
	 * 
	 * @param a: entero
	 * @param b: entero
	 */
	public static void restar(int a, int b) {
		System.out.println("El valor de la resta es " + (a - b));
	}

	/**
	 * Imprime la multiplicación de dos numeros
	 * 
	 * @param a: entero
	 * @param b: entero
	 */
	public static void multiplicar(int a, int b) {
		System.out.println("El valor de la multiplicación es " + (a * b));
	}
	
	/**
	 * Imprime al división de dos numeros
	 * @param a: entero
	 * @param b: entero
	 */
	public static void dividir(int a, int b) {
		System.out.println("El valor de la division es " + a / b);
	}
	
	/**
	 * Imprime la raiz entera de dos numeros
	 * @param a: entero
	 */
	public static void raizEntera(int a) {
		System.out.println("El valor de la raiz será " + ((int) Math.sqrt(a)));
	}

}
