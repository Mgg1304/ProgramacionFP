package Ejer04;

public class Computador {
	
	private String marca, SO;
	private double memoria, precio;
	
	public Computador(String marca, String SO, double memoria, double precio) {
		this.marca = marca;
		this.SO = SO;
		this.memoria = memoria;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSO() {
		return SO;
	}

	public void setSO(String sO) {
		SO = sO;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", SO=" + SO + ", memoria=" + memoria + ", precio=" + precio + "]";
	}
	
	
}
