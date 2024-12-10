package Ejer04;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Computador x1 = new Computador("Dell", "Windows", 128, 500);
		Computador x2 = new Computador("HP", "Windows", 128, 500);
		Computador x3 = new Computador("Lenovo", "Windows", 128, 500);
		Tienda tienda = new Tienda("Mr Computer", "Pepito perez", 5, 3);
		tienda.anyadirComputador(x1);
		tienda.anyadirComputador(x2);
		tienda.anyadirComputador(x3);
		
		tienda.imprimirOrdenadores();
		tienda.buscarComputador("Lenovo");
		tienda.eliminarComputador("HP");
		tienda.imprimirOrdenadores();
	}
	
}
