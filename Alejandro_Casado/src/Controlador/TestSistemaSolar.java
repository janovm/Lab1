package Controlador;

import java.util.Iterator;

import Modelo.Planeta;
import Modelo.SistemaSolar;

public class TestSistemaSolar {

	SistemaSolar sistema;
	
	public TestSistemaSolar(SistemaSolar sistema) {
		super();
		this.sistema = sistema;
	}

	public void sistemaMasGrande() {
		double auxiliarMax = sistema.getPlanetas().get(0).getRadioEcuatorial();
		String nombrePlanetaMasGrande = sistema.getPlanetas().get(0).getNombre();
		for (int i = 0; i < sistema.getPlanetas().size(); i++) {
			if ( sistema.getPlanetas().get(i).getRadioEcuatorial()>auxiliarMax) {
				auxiliarMax= sistema.getPlanetas().get(i).getRadioEcuatorial();
				nombrePlanetaMasGrande = sistema.getPlanetas().get(i).getNombre();
			}
		}
		System.out.println("El planeta más grande es "+nombrePlanetaMasGrande);
	}

	public void planetaConMasSatelites() {
		double auxiliarMax = sistema.getPlanetas().get(0).getSatelites().size();
		String nombrePlanetaMasSatelites = sistema.getPlanetas().get(0).getNombre();
		for (int i = 0; i < sistema.getPlanetas().size(); i++) {
			if ( sistema.getPlanetas().get(i).getSatelites().size()>auxiliarMax) {
				auxiliarMax= sistema.getPlanetas().get(i).getSatelites().size();
				nombrePlanetaMasSatelites = sistema.getPlanetas().get(i).getNombre();
			}
		}
		System.out.println("El planeta con más satélites es "+nombrePlanetaMasSatelites);
	}

	public void nombresDePlanetas() {
		for (int i = 0; i < sistema.getPlanetas().size(); i++) {
			System.out.println((i+1)+ ". "+sistema.getPlanetas().get(i).getNombre());
		}
	}

	public void satelitesDeJupiter() {
		Planeta jupiter = getPlaneta("Jupiter");
		for (int i = 0; i < jupiter.getSatelites().size(); i++) {
			System.out.println(jupiter.getSatelites().get(i).getDatosAstro());
		}
	}

	public void planetaMasFrio() {
		double auxiliarMin = sistema.getPlanetas().get(0).getTempMediaDiurna();
		String nombrePlanetaMasFrio = sistema.getPlanetas().get(0).getNombre();
		for (int i = 0; i < sistema.getPlanetas().size(); i++) {
			if ( sistema.getPlanetas().get(i).getTempMediaDiurna()<auxiliarMin) {
				auxiliarMin= sistema.getPlanetas().get(i).getTempMediaDiurna();
				nombrePlanetaMasFrio = sistema.getPlanetas().get(i).getNombre();
			}
		}
		System.out.println("El planeta con más frío es "+nombrePlanetaMasFrio);
	}
	
	private Planeta getPlaneta(String nombre) {
		for (int i = 0; i < this.sistema.getPlanetas().size(); i++) {
			if (this.sistema.getPlanetas().get(i).getNombre().equalsIgnoreCase(nombre)) {
				return sistema.getPlanetas().get(i);
			}
		}
		return null;
	}
}
