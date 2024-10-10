package ActividadEvaluable_2;

import java.util.Scanner;

public class Ejercicio {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dia, mes, año;

		System.out.print("Dame el dia: ");
		dia = sc.nextInt();

		System.out.print("Dame el mes: ");
		mes = sc.nextInt();

		System.out.print("Dame el año: ");
		año = sc.nextInt();

		dia++;

		if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10)) {
			if (dia > 31) {
				dia -= 3;
				mes++;
			}
		} else if (mes == 2) {
			if ((año % 4 == 0) && (dia > 28)) {
				dia -= 28;
				mes++;
			} else if (dia > 27) {
				dia -= 27;
				mes++;
			}
		} else if (mes == 12) {
			if (dia > 31) {
				dia -= 31;
				mes = 1;
				año++;
			}
		} else {
			if (dia > 30) {
				dia -= 30;
				mes++;
			}
		}

		System.out.println("Una vez aumentado un dia la fecha será: " + dia + "-" + mes + "-" + año);
	}

}
