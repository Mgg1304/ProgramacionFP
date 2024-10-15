package SentenciasIf;

import java.util.Scanner;

public class Teoria1 {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * La intrucción IF busca ejecutar una serie de instrucciones si se cumple una
	 * condición establecidad.
	 */

	public static void main(String[] args) {

		/**
		 * En este caso, x valdra 0 y la y valdra 1, pero solo se imprimira el numero
		 * que cumpla la condición establecida. Si se quiere comprobar si una variable
		 * es igual a un numero determindo usaremos la operación "==". Si se quiere
		 * comprobar si una variable es diferente a un numero determiando usaremos la
		 * operación "!=".
		 */

//		int x = 0, y = 1;
//
//		if (x == 0) {
//			System.out.println("X es igual a 0");
//		}
//		if (y != 0) {
//			System.out.println("Y es diferente de 0");
//		}

		/**
		 * Cuando se hace una comprobación, se optiene un valor booleano ya sea
		 * verdadero o falso. A la hora de comprobar en el if, se puede comprobar más de
		 * una condición, dando como resultado verdadero o falso. Si se quiere comprobar
		 * que ocurran ambas cosas, se usara el operador "&&". Si se quiere comprobar
		 * que ocurra al menos una, se usara el operador "||".
		 */

//		int x = 0, y = 1;
//
//		if ((x == 0) && (y == 1)) {
//			System.out.println("X es igual a cero e y es igual a uno");
//		}
//		if ((x == 0) && (y == 0)) {
//			System.out.println("Esto no se imprimira, x es igual a cero, pero y no");
//		}
//		if ((x == 0) || y == 0) {
//			System.out.println(
//					"Una de las cosas es verdad y como es una operación 'o', con que una cosa sea verdad, servira");
//		}

		/**
		 * Si tenemos una variable booleana, podemos usarla para evaluar con ella. Lo
		 * que tenemos que hacer es ponerla entre los parentesis del if
		 */

//		boolean x = true, y = false;
//
//		if (x) {
//			System.out.println("X es verdad");
//		}
//
//		if (y) {
//			System.out.println("Y es falso, entonces esto no se imprimirá");
//		}

		/**
		 * Ahora practica con lo explicado antes. Tenemos un numero, imprime un texto si
		 * es igual a 3 y otro si es diferente de 3.
		 */

//		int x = 5;

		/**
		 * Si en lo que queremos probar puede haber mas de un caso y queremos que en
		 * función del caso en el que estemos ocurran cosas diferentes podemos poner una
		 * serie de if's o podemos usar las instrucciones "else" o "else if". Else se
		 * usa si solo hay otro caso, ya que, si no se cumple el if, el programa
		 * ejecutara lo que este indicado en el else sin comprobar nadad. Sin embargo,
		 * si queremos que se compruebe con alguna codución, usaremos la instrucción
		 * "else if". En cada cadena de if/else if/else, solo puede haber una intrucción
		 * if e una sola instrucción else. Ya que una es el inicio de las comprobaciones
		 * y la otra el final. Sin embargo puede haber tantos else if's como queramos
		 */
		
//		int x = 2;
//		
//		if (x== 0) {
//			System.out.println("X vale 0");
//		} else if(x == 1) {
//			System.out.println("X vale 1");
//		} else if (x == 2) {
//			System.out.println("X vale 2");
//		} else {
//			System.out.println("X no tiene ninguno de los valores anteriores");
//		}
		
		
	}
}
