package Extra;

import java.util.Scanner;

public class Extra {

	public static Scanner sc = new Scanner(System.in);

	/**
	 * Dada la fecha actual y otra fecha, decir cuantos años han pasado desde
	 * entonces
	 */
	public static void main(String[] args) {

		int anyoActual = 2024, mesActual = 10, diaActual = 8;
		int diaNacimiento, mesNacimento, anyoNacimiento, edad;

		System.out.print("Dia de nacimiento: ");
		diaNacimiento = sc.nextInt();

		System.out.print("Mes de nacimiento: ");
		mesNacimento = sc.nextInt();

		System.out.print("Año de nacimiento: ");
		anyoNacimiento = sc.nextInt();

		edad = anyoActual - anyoNacimiento;

		if ((mesNacimento > mesActual)) {
			edad--;
		} else if ((mesNacimento == mesActual) && (diaNacimiento > diaActual)) {
			edad--;
		}

		System.out.println("Tienes " + edad + " años");
	}
}
