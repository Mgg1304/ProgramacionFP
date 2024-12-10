package Tarea;

public class Lib {

	/**
	 * Comprueba si un avión cae en una zona de turbulencia
	 * 
	 * @param fila:    int
	 * @param columna: int
	 * @param m:       matrix int
	 */
	public static void comprobarVuelo(int fila, int columna, int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					int x = m[i][j]-1;
					j++;
					for (int k = 0; k < x && j < m[0].length; k++, j++) {
						if((fila == i)&&(columna == j)) {
							System.out.println("WARNING: (" + (5-fila) + ", " + (columna+1) + ")");
						}
					}
				}
			}
		}
		
	}

	/**
	 * Solamente se mostrarán los vuelos con su grado de turbulencias con los
	 * indices
	 * 
	 * @param m: matrix int
	 */
	public static void mostrarMatriz(int[][] m) {
		System.out.println("MOSTRAR MATRIZ");
		for (int i = 0; i < m.length; i++) {
			System.out.print("|");
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					System.out.print(m[i][j] + "\t");
				} else {
					System.out.print("0\t");
				}
				System.out.print("|");
			}
			System.out.println();
			System.out.println("------------------");
		}
	}

	/**
	 * Muestra las zonas que quedan afectadas por las turbulencias producidas por
	 * cada aeronave, de la misma forma que en las imagenes. Las posiciones marcadas
	 * por la turbulencia, se pueden indicar con una x
	 * 
	 * @param m: matrix int
	 */
	public static void mostarMapaDeTurbulencias(int[][] m) {
		System.out.println("MOSTRAR MAPA DE TURBULENCIAS");
		for (int i = 0; i < m.length; i++) {
			System.out.print("|");
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					int x = m[i][j];
					for (int k = 0; k < x; k++) {
						System.out.print("-1\t");
						if (k < x - 1) {
							System.out.print("|");
							j++;
						}
					}
				} else {
					System.out.print("0\t");
				}
				System.out.print("|");
			}
			System.out.println();
			System.out.println("------------------");
		}
	}

	/**
	 * Muestra las coordenadas de cada aeronave que se encuentra en la zona de
	 * turbulencia
	 * 
	 * @param m: matrix int
	 */
	public static void mostrarAvisos(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] != 0) {
					comprobarVuelo(i, j, m);
				}
			}
		}
	}
}
