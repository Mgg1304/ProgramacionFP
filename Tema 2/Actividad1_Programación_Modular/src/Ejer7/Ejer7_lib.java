package Ejer7;

public class Ejer7_lib {
	
	public static double celsiusToFarenheit(double celsius) {
		
		double farenheir = (celsius*9/5) + 32;
		return farenheir;
	}
	
	public static double farenheirToCelsius(double farenheir) {
		
		double celsius = (farenheir - 32)*5/9;
		return celsius;
	}

}
