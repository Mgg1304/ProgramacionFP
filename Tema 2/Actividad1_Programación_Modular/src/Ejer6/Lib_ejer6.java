package Ejer6;

public class Lib_ejer6 {
	
	/**
	 * Comprueba si unn numero real tiene decimales
	 * @param num
	 * @return
	 */
	public static boolean comprobarDecimales(Double num) {

		num = num*10;
		
		int x = (int) (num%10);
		
		if(x == 0) {
			return false;
		}else {
			return true;
		}
	}

}
