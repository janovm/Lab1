package Modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import Vista.ModelosVista;

public class SistemaSolar {

	private Estrella sol;
	private ArrayList<Planeta> planetas;

	// Estas variables las usaré como auxiliares al reescribir un planeta añadiendo
	// un satélite, las declare aqui para que el método quede mas legible
	private int auxiliarIndex;
	private Planeta auxiliarPlaneta;

	public SistemaSolar() {
		super();
		planetas = new ArrayList<>();
		Estrella sol = new Estrella();
		sol.setRadioEcuatorial(7);
		sol.setTempNucleo(15 * 10 ^ 6);
		sol.setDistanciaTierra(1.496);
	}

	public void bigBang() throws InterruptedException, IOException {
		crearPlanetasInteriores();
		barraCarga();
		crearPlanetasExteriores();
		crearSatelites();
	}

	private void crearPlanetasInteriores() {
		Planeta mercurio = new Planeta();
		mercurio.setNombre("Mercurio");
		mercurio.setRadioEcuatorial(57.9);
		mercurio.setDistanciaSol(91.7);
		mercurio.setDistanciaTierra(91.7);
		mercurio.setTempMediaDiurna(700.15);
		planetas.add(mercurio);
		Planeta venus = new Planeta();
		venus.setNombre("Venus");
		venus.setRadioEcuatorial(6.052);
		venus.setDistanciaSol(108.2);
		venus.setDistanciaTierra(41.4);
		venus.setTempMediaDiurna(243.15);
		planetas.add(venus);
		Planeta tierra = new Planeta();
		tierra.setNombre("Tierra");
		tierra.setRadioEcuatorial(6.378);
		tierra.setDistanciaSol(149.6);
		tierra.setDistanciaTierra(0);
		tierra.setTempMediaDiurna(289);
		planetas.add(tierra);
		Planeta marte = new Planeta();
		marte.setNombre("Marte");
		marte.setRadioEcuatorial(3.396);
		marte.setDistanciaSol(227.940);
		marte.setDistanciaTierra(78.4);
		marte.setTempMediaDiurna(293.15);
		planetas.add(marte);
	}

	private void crearPlanetasExteriores() {
		Planeta jupiter = new Planeta();
		jupiter.setNombre("Jupiter");
		jupiter.setRadioEcuatorial(70.85);
		jupiter.setDistanciaSol(778.3);
		jupiter.setDistanciaTierra(628.8);
		jupiter.setTempMediaDiurna(303.15);
		planetas.add(jupiter);
		Planeta saturno = new Planeta();
		saturno.setNombre("Saturno");
		saturno.setRadioEcuatorial(60);
		saturno.setDistanciaSol(1429.4);
		saturno.setDistanciaTierra(1277.4);
		saturno.setTempMediaDiurna(148.15);
		planetas.add(saturno);
		Planeta urano = new Planeta();
		urano.setNombre("Urano");
		urano.setRadioEcuatorial(25.4);
		urano.setDistanciaSol(2871);
		urano.setDistanciaTierra(2719.7);
		urano.setTempMediaDiurna(80.15);
		planetas.add(urano);
		Planeta neptuno = new Planeta();
		neptuno.setNombre("Neptuno");
		neptuno.setRadioEcuatorial(24.3);
		neptuno.setDistanciaSol(4504.3);
		neptuno.setDistanciaTierra(4347.4);
		neptuno.setTempMediaDiurna(120.15);
		planetas.add(neptuno);
	}

	private void crearSatelites() {
		Satelite luna = new Satelite();
		luna.setNombre("Luna");
		luna.setRadio(1747.4);
		sustituirPlaneta(luna, "Tierra");

		Satelite phobos = new Satelite();
		phobos.setNombre("Phobos");
		phobos.setRadio(17.5);
		sustituirPlaneta(phobos, "Marte");

		Satelite deimos = new Satelite();
		deimos.setNombre("Deimos");
		deimos.setRadio(12.5);
		sustituirPlaneta(deimos, "Marte");

		Satelite io = new Satelite();
		io.setNombre("Io");
		io.setRadio(1801);
		sustituirPlaneta(io, "Jupiter");

		Satelite europa = new Satelite();
		europa.setNombre("Europa");
		europa.setRadio(1569);
		sustituirPlaneta(europa, "Jupiter");

		Satelite ganimedes = new Satelite();
		ganimedes.setNombre("Ganimedes");
		ganimedes.setRadio(2631);
		sustituirPlaneta(ganimedes, "Jupiter");

		Satelite calisto = new Satelite();
		calisto.setNombre("Calisto");
		calisto.setRadio(2400);
		sustituirPlaneta(calisto, "Jupiter");

		Satelite titan = new Satelite();
		titan.setNombre("Titan");
		titan.setRadio(2575);
		sustituirPlaneta(titan, "Saturno");

		Satelite oberon = new Satelite();
		oberon.setNombre("Oberon");
		oberon.setRadio(582.6);
		sustituirPlaneta(oberon, "Urano");

		Satelite titania = new Satelite();
		titania.setNombre("Titania");
		titania.setRadio(788);
		sustituirPlaneta(titania, "Urano");

		Satelite umbriel = new Satelite();
		umbriel.setNombre("Umbriel");
		umbriel.setRadio(584);
		sustituirPlaneta(umbriel, "Urano");

		Satelite triton = new Satelite();
		triton.setNombre("Triton");
		triton.setRadio(1350);
		sustituirPlaneta(triton, "Neptuno");
	}

	// La finalidad de este método es que me devuelva el index en mi array del
	// planeta con el nombre que me da la actividad en el anexo
	private int getPosicionPlaneta(String nombre) {
		for (int i = 0; i < this.planetas.size(); i++) {
			if (this.planetas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return (Integer) null;
	}

	private void sustituirPlaneta(Satelite sateliteNuevo, String nombrePlaneta) {
		auxiliarIndex = getPosicionPlaneta(nombrePlaneta);
		auxiliarPlaneta = planetas.get(auxiliarIndex);
		auxiliarPlaneta.atraparAstroEnCampoGravitatorio(sateliteNuevo);
		planetas.set(auxiliarIndex, auxiliarPlaneta);
	}
	
	private void barraCarga() throws InterruptedException, IOException {
		String anim= "%"; for (int x =0 ; x < 100 ; x++){ String data = "\r" + anim.charAt(x % anim.length()) + " " + x ; 
		System.out.write(data.getBytes()); Thread.sleep(30); 
		ModelosVista.limpiarConsola();
		}
	}

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}
	
}
