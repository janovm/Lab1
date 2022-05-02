package Controlador;

import java.io.IOException;
import java.util.Scanner;

import Modelo.SistemaSolar;
import Vista.ModelosVista;

public class MainController {

	private static Scanner teclado = new Scanner(System.in);
	private static ModelosVista vista = new ModelosVista();

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		int opcion = 0;
		vista.iniciarCreacion();
		if (teclado.nextInt() == 1) {
			teclado.nextLine();
			SistemaSolar sistema = new SistemaSolar();
			sistema.bigBang();
			TestSistemaSolar test= new TestSistemaSolar(sistema);
			do {
				ModelosVista.limpiarConsola();
				vista.crearMenu();
				opcion = teclado.nextInt();
				teclado.nextLine();
				switch (opcion) {
				case 1: {
					test.sistemaMasGrande();
					break;
				}
				case 2: {
					test.planetaConMasSatelites();
					break;
				}
				case 3: {
					test.nombresDePlanetas();
					break;
				}
				case 4: {
					test.satelitesDeJupiter();
					break;
				}
				case 5: {
					test.planetaMasFrio();
					break;
				}
				default:
					if (opcion!=0) {
						System.out.println("Introduzca un valor válido");
					}
				}
				esperarAntesDeBorrar();
			} while (opcion != 0);
		} else {
			System.exit(0);
		}
	}
	
	private static void esperarAntesDeBorrar() {
		try {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
