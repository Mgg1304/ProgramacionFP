package Examen_Tema_2;

public class Pruebas {

	public static void main(String[] args) {

		// esPrimo
		System.out.println("esPrimo(17) " + Funciones.esPrimo(17));
		System.out.println("esPrimo(20) " + Funciones.esPrimo(20));

		// siguientePrimo
		System.out.println("siguientePrimo(17) " + Funciones.siguientePrimo(17));
		System.out.println("siguientePrimo(20) " + Funciones.siguientePrimo(20));

		// digitos
		System.out.println("digitos(1234) " + Funciones.digitos(1234));
		
		//voltea
		System.out.println("voltea(1234) " + Funciones.voltea(1234));
		
		//digitoN
		System.out.println("digitoN(1234, 1 )" + Funciones.digitoN(1234, 1));
		System.out.println("digitoN(1234, 0) " + Funciones.digitoN(1234, 0));
		System.out.println("digitoN(1234, 6) " + Funciones.digitoN(1234, 6));
		
		//posicionDigito
		System.out.println("posicionDigito(12345, 2) " + Funciones.posicionDeDigito(12345, 2));
		System.out.println("posicionDigito(12345, 2) " + Funciones.posicionDeDigito(12345, 6));
		
		//quitaPorDetras
		System.out.println("quitarPorDetras(12345) " + Funciones.quitaPorDetras(12345));
		
		//quitaPorDelante
		System.out.println("quitaPorDelante(12345) " + Funciones.quitaPorDelante(12345));
		
		//pegaPorDetras
		System.out.println("pegaPorDetras(12345, 9) " + Funciones.pegaPorDetras(12345, 9));
		
		//pegaPorDelante
		System.out.println("pegaPorDelante(12345, 9) " + Funciones.pegaPorDelante(12345, 9));
	}
}
