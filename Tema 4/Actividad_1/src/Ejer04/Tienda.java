package Ejer04;

public class Tienda {
	
	private String nombre, propietario;
	private int id;
	private Computador [] computadores;
	
	public Tienda(String nombre, String propietario, int id, int ordenadores) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.id = id;
		this.computadores = new Computador[ordenadores];
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Computador[] getComputadores() {
		return computadores;
	}

	public void setComputadores(Computador[] computadores) {
		this.computadores = computadores;
	}

	public void anyadirComputador(Computador compu) {
		for (int i = 0; i < computadores.length; i++) {
			if(computadores[i] == null) {
				computadores[i] = compu;
				break;
			}
			if(i == 4) {
				System.out.println("No se pueden tener más ordenadores");
			}
		}
	}
	
	public void eliminarComputador(String marca) {
		for (int i = 0; i < computadores.length; i++) {
			if(computadores[i].getMarca().equals(marca)) {
				computadores[i] = null;
				break;
			}
		}
	}
	
	public void buscarComputador(String marca) {
		for (int i = 0; i < computadores.length; i++) {
			if(computadores[i].getMarca().equals(marca)) {
				computadores[i].toString();
				break;
			}
		}
	}
	
	public void imprimirOrdenadores() {
		for (int i = 0; i < computadores.length; i++) {
			if(computadores[i] != null) {
				System.out.println(computadores[i].toString());
			}
			
		}
	}
	
}
