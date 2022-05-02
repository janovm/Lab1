package Modelo;

import java.util.ArrayList;

public class Planeta {

	private String nombre;
	private double radioEcuatorial;
	private double tempMediaDiurna;
	private double distanciaSol;
	private double distanciaTierra;
	private ArrayList<Satelite> satelites;

	public Planeta() {
		super();
		satelites = new ArrayList<>();
	}

	public void atraparAstroEnCampoGravitatorio(Satelite astro) {
		satelites.add(astro);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public double getTempMediaDiurna() {
		return tempMediaDiurna;
	}

	public void setTempMediaDiurna(double tempMediaDiurna) {
		this.tempMediaDiurna = tempMediaDiurna;
	}

	public double getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(double distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public double getDistanciaTierra() {
		return distanciaTierra;
	}

	public void setDistanciaTierra(double distanciaTierra) {
		this.distanciaTierra = distanciaTierra;
	}

	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}

	public void setSatelites(ArrayList<Satelite> satelites) {
		this.satelites = satelites;
	}

}
