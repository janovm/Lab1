package Modelo;

public class Satelite {

	private String nombre;
	private double radio;

	// Lo suyo ser�a usar un ToString, pero por la redacci�n del enunciado entiendo
	// que esto es lo que pide
	public String getDatosAstro() {
		return "Nombre: " + nombre + " Radio: " + radio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}