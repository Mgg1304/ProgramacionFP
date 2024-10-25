package FuncionesNumero;

public class Pruebas {
	
	public static void main(String[] args) {
		
		//pruebas sumaCifras
		
		int resul1 = LibNumerosEnteros.sumaCifrasNumero(1234);
		System.out.println("La suma de las cifras de 1234 es " + resul1);
		
		int resul2 = LibNumerosEnteros.sumaCifrasNumero(0);
		System.out.println("La suma de las cifras de 0 es " + resul2);
		
		int resul3 = LibNumerosEnteros.sumaCifrasNumero(-12);
		System.out.println("La suma de las cifras de 0 es " + resul3);
		
		//pruebas esPrimo
		
		boolean resul4 = LibNumerosEnteros.esPrimo(13);
		System.out.println("Primo(13) " + resul4);
		
		boolean resul5 = LibNumerosEnteros.esPrimo(15);
		System.out.println("Primo(15) " + resul5);
		
		boolean resul6 = LibNumerosEnteros.esPrimo(-7);
		System.out.println("Primo(-7) " + resul6);
	}

}
