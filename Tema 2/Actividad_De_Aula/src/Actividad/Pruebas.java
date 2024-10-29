package Actividad;

public class Pruebas {
	
	public static void main(String[] args) {
		
		String pass = Funciones.generaPassword();
		System.out.println(pass);
		
		System.out.println(Funciones.esFuerte(pass));
		
		
	}

}
