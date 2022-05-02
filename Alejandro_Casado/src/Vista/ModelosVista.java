package Vista;

public class ModelosVista {

	public void iniciarCreacion() {
		System.out.println("Si desea salir, presione cualquier otra tecla");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("-                  PRESIONE EL 1 PARA COMENZAR EL SITEMA SOLAR                      -");
		System.out.println("-------------------------------------------------------------------------------------");
	}

	public void crearMenu() {
		System.out.println("Si desea salir, presione el 0");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("-         1. ¿Cuál es el planeta más grande del Sistema Solar?                      -");
		System.out.println("-         2. ¿Cuál es el planeta con mayor numero de satélites?                     -");
		System.out.println("-         3. ¿Cuales son los nombres de los planetas del sistema?                   -");
		System.out.println("-         4. ¿Cómo se llaman y que tamaño tienen los satélites de júpiter?          -");
		System.out.println("-         5. ¿Cuál es la temperatura del planeta más frío del sistema?              -");
		System.out.println("-------------------------------------------------------------------------------------");
	}

	public static void limpiarConsola() {for (int i = 0; i < 50; ++i) System.out.println();}
}
