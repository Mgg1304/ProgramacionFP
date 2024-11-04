package Ejer07;

public class Ejer7 {
	
	public static void main(String[] args) {
		
		double farenheit = Ejer7_lib.celsiusToFarenheit(40);
		System.out.println("40 grados celsius son " + farenheit + " grados farenheit");
		
		double celsius = Ejer7_lib.farenheirToCelsius(104);
		System.out.println("104 grados farenheir son " + celsius + " grados celsius");
	}

}
