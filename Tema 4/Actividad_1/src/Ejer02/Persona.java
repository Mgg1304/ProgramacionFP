package Ejer02;

public class Persona {
	private String nombre = "", DNI;
	private int edad = 0;
	private char sexo = 'H';
	private double peso = 0, altura = 0;

	public Persona() {
		generaDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		generaDNI();
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
		generaDNI();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC() {

		double IMC = getPeso() / (Math.pow(getAltura(), 2));

		if (IMC < 20) {
			return -1;

		} else if ((IMC >= 20) && (IMC <= 25)) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean esMayorDeEdad() {
		if (getEdad() > 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public void comprobarSexo(char sexo) {
		if(sexo == 'M') {
			setSexo(sexo);
		}
	}
	
	

	private void generaDNI() {
		int DNI = (int)(Math.random()*100000000);
		
		char letra = generarLetra(DNI);
		String DNILetra = Integer.toString(DNI) + letra; 
		this.DNI = DNILetra;
	}

	private char generarLetra(int DNI) {
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        int indice = DNI % 23;
        
        return letras.charAt(indice);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
