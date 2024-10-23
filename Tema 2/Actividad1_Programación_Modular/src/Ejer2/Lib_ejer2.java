package Ejer2;

public class Lib_ejer2 {
	
	public static void calcularArea(int radio) {
		double x = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area es " + x);
	}
	
	public static void calcularPerimetro(int radio) {
		double x = Math.PI*2*radio;
		
		System.out.println("El perimetro será " + x);
	}

}
