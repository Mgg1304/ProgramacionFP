package Actividad;

public class Funciones {

	/**
	 * Genera un digito aleatorio
	 * 
	 * @return int
	 */
	public static int generarDigitoAleatorio() {

		return (int) (Math.random() * 10);

	}

	/**
	 * Genera una letra minuscula
	 * 
	 * @return char
	 */
	public static char generarMinusculaAleatorio() {

		int incr = (int) (Math.random() * 26);
		char car = (char) ('a' + incr);

		return car;

	}

	/**
	 * Genera una letra mayuscula
	 * 
	 * @return char
	 */
	public static char generarMayusculaAleatorio() {

		int incr = (int) (Math.random() * 26);
		char car = (char) ('A' + incr);
		return car;
	}

	/**
	 * Genera una contraseña que contine entre 6 y 9 caracteres. Contiene digitos,
	 * mayusculas y minusculas
	 * 
	 * @return String
	 */
	public static String generaPassword() {

		String pass = "";

		int lon = (int) (Math.random() * 4) + 6;

		for (int i = 0; i < lon; i++) {
			int ran = (int) (Math.random() * 3);

			if (ran == 0) {
				char x = generarMinusculaAleatorio();
				pass += x;
			} else if (ran == 1) {
				char x = generarMayusculaAleatorio();
				pass += x;
			} else if (ran == 2) {
				int x = generarDigitoAleatorio();
				pass += x;
			}
		}
		return pass;
	}

	/**
	 * Comrpueba si la contraseña es fuerte. Una contraseña fuerte contiene una
	 * mayuscula, una miniscula y un digito
	 * 
	 * @return boolean
	 */
	public static boolean esFuerte(String pass) {
		
		int contadorMin = 0;
		int contadorMax = 0;
		int contadorDig = 0;
		
		for (int i = 0; i < pass.length(); i++) {
			char y = pass.charAt(i);
			
			
			
			if((y>='0')&&(y<='9')) {
				contadorDig++;
			} else if((y >= 'a')&&(y<='z')) {
				contadorMin++;
			} else if((y >= 'A')&&( y <='Z')) {
				contadorMax++;
			}			
			
		}
		
		if((contadorDig != 0)&&(contadorMin != 0)&((contadorMax != 0))) {
			return true;
		} else {
			return false;
		}
	}

}
