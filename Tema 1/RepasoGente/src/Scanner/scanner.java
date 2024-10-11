package Scanner;

import java.util.Scanner;

public class scanner {

	/**
	 * El scanner sirve para poder introducir información a un programa atraves de
	 * la consola leyendo la información escrita con el teclado Lo que hacemos es
	 * crear una instancia de una clase, por lo que se le puede dar el nombre que
	 * queramos. Yo suelo usar el nombre "sc", pero tambien se pueden usar cualquier
	 * otro nombre, como por ejemplo "teclado". El scanner puede leer cualquier tipo
	 * de dato, pero le tienes que decir que tipo de dato es
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/**
		 * Si queremos introducir una palabra, necesitaremos introduccir el nombre que
		 * le hayamos dado al scanner seguido de la instrucción ".next()". Esto se
		 * conoce como un metodo, pero ya se veran más adelante. Debido a lo separadores
		 * propiamente definidos del scanner, lo que queramos, tenemos que escribirlo
		 * todo en la misma palabra
		 * 
		 * Usar ejemplo "Hola" o cualquier palabra que se quiera
		 */

//		System.out.println("Dame una palabra para guardar: ");
//		String x = sc.next();
//
//		System.out.println(x);

		/**
		 * Si introduces mas de una palabra, separada en este caso por espacios, se
		 * guardara en el scanner hasta que se usen todos los elementos que se han
		 * guardado.
		 * 
		 * Si queremos introducir mas de una palabra, tenemos que guardarla en mas de
		 * una variable
		 * 
		 * Usar ejemplo tu nombre y apellido o dos palabras que quieras
		 */

//		System.out.println("Dame dos palabras separadas por un espacio: ");
//		
//		String x = sc.next();
//		String y = sc.next();
//		
//		System.out.println(y);
//		System.out.println(x);

		/**
		 * Si queremos guardar un numero entero, necesitamos introduccir el nombre que
		 * le hayamos dado al scanner seguido de la instrucción ".nextInt()"
		 */

//		System.out.println("Dame el numero entero: ");
//		int x = sc.nextInt();
//		
//		System.out.println(x);

		/**
		 * Si queremos guardar un numero con decimales, se pueden usar tanto float como
		 * double, aunque dependiendo de las operaciones que queramos realizar, debido a
		 * la precisión, sera necesario usar double. En el caso de que lo queramos
		 * guardar como float, deberemos introduccir el nombre que le hayamos dado al
		 * scanner seguido de la instrucción ".nextFloat()". Si queremos usar double,
		 * tenemos que usar la instrucción ".nextDouble()". En esencia son el mismo
		 * tipo, solo que double permite mas.
		 * 
		 * Para evitar errores, al introducir un numero, para poner los decimales, tiene
		 * que introducir una coma. Ejemplo "4,6" y "9,1"
		 */

//		System.out.println("Dame el numero a guardar en float: ");
//		Float x = sc.nextFloat();
//
//		System.out.println("Dame el numero a guardar en double: ");
//		double y = sc.nextDouble();
//
//		System.out.println(x);
//		System.out.println(y);

	}

}
