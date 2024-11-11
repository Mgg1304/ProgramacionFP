package Examen_Tema_2;

public class Funciones {

	public static boolean esPrimo(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int siguientePrimo(int num) {

		int posiblePrimo = num + 1;
		while (true) {
			if (esPrimo(posiblePrimo)) {
				return posiblePrimo;
			}
			posiblePrimo++;
		}
	}

	public static int digitos(int num) {

		int digitos = 0;

		while (num > 10) {
			digitos++;
			num = num / 10;
		}
		return ++digitos;
	}

	public static int voltea(int num) {

		int numInver = 0;

		while (num > 10) {
			int x = num % 10;
			num = num / 10;

			numInver = numInver * 10 + x;
		}
		int x = num % 10;
		num = num / 10;

		numInver = numInver * 10 + x;

		return numInver;
	}

	public static int digitoN(int num, int pos) {

		int logNum = digitos(num);

		if (pos >= logNum)
			return -1;

		for (int i = 0; i < pos; i++) {
			num = num / 10;
		}

		return num % 10;

	}

	public static int posicionDeDigito(int num, int digito) {

		int x = -1, logNum = digitos(num);

		for (int i = 0; i < logNum; i++) {
			int y = num % 10;
			num = num / 10;

			if (y == digito) {
				x = i;
			}
		}
		return x;
	}

	public static int quitaPorDetras(int num) {

		return num / 10;
	}

	public static int quitaPorDelante(int num) {
		num = voltea(num);
		num = quitaPorDetras(num);
		return voltea(num);
	}
	
	public static int pegaPorDetras(int num, int digito) {
		return num*10 + digito;
	}
	
	public static int pegaPorDelante(int num, int digito) {
		num = voltea(num);
		num = pegaPorDetras(num, digito);
		return voltea(num);
	}
}
