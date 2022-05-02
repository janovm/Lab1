package Modelo;

public class Estrella {

	private String nombre;
	private double radioEcuatorial;
	private double tempNucleo;
	private double distanciaTierra;

	public String getNombre() {
		return nombre;
	}

	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public double getTempNucleo() {
		return tempNucleo;
	}

	public void setTempNucleo(double tempNucleo) {
		this.tempNucleo = tempNucleo;
	}

	public double getDistanciaTierra() {
		return distanciaTierra;
	}

	public void setDistanciaTierra(double distanciaTierra) {
		this.distanciaTierra = distanciaTierra;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
