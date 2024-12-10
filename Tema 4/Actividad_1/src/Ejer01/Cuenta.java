package Ejer01;

public class Cuenta {

	String titular;
	double cantidad;

	public Cuenta(String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(double dinero) {
		if (dinero > 0) {
			setCantidad(getCantidad() + dinero);
		}
	}

	public void retirar(double dinero) {
		if (getCantidad() - dinero < 0) {
			setCantidad(0);
		}
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
}
