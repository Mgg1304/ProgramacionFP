package Ejer2;

public class Lib_ejer2 {
	
	/**
	 * Imprime el area de un circulo
	 * @param radio: entero
	 */
	
	public static void calcularArea(int radio) {
		double x = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area es " + x);
	}
	
	/**
	 * Imprime el perimetro de un circulo
	 * @param radio: entero
	 */
	
	public static void calcularPerimetro(int radio) {
		double x = Math.PI*2*radio;
		
		System.out.println("El perimetro será " + x);
	}
	
	

}
