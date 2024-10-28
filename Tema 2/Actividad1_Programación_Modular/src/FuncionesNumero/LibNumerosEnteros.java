package FuncionesNumero;

public class LibNumerosEnteros {

	/**
	 * Calcula la suma de las cifras de un numero
	 * 
	 * @param num: entero
	 * @return int
	 */
	public static int sumaCifrasNumero(int num) {

		if (num == 0) {
			return 0;
		} else if (num < 0) {
			System.out.println("ERROR numero negativo");
			return -1;
		} else {
			int suma = 0;
			while (num > 10) {
				suma += (num % 10);
				num = num / 10;
			}
			return suma;
		}
	}

	/**
	 * Comprueba si un numero es primo
	 * 
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean esPrimo(int num) {

		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si un numero es capicua
	 * 
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean esCapicua(int num) {

		int numInver = 0, valorInicial = num;

		while (valorInicial > 10) {
			int x = valorInicial % 10;
			numInver = numInver * 10 + x;
			valorInicial = valorInicial / 10;
		}

		numInver = numInver * 10 + valorInicial;

		if (numInver == num) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Comprueba si un numero tiene sus cifras en orden creciente
	 * 
	 * @param num: entero
	 * @return boolean
	 */
	public static boolean cifrasOrdenCreciente(int num) {
		
		int num1, num2;
		
		num2 = num%10;
		num = num/10;
		
		num1 = num%10;
		num = num/10;
		
		while(num > 10) {
			if(num1 < num2) {
				return false;
			}
			num2 = num1;
			
			num1 = num%10;
			num = num/10;
		}
		
		if(num1 < num2) {
			return false;
		}
		return true;
	}

}
