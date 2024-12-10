package Ejer01;

public class Ejer01 {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("Miguel", 0);
		cuenta.ingresar(50);
		
		System.out.println(cuenta.toString());
	}
}
