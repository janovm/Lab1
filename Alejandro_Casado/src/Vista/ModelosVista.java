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
		System.out.println("-         1. �Cu�l es el planeta m�s grande del Sistema Solar?                      -");
		System.out.println("-         2. �Cu�l es el planeta con mayor numero de sat�lites?                     -");
		System.out.println("-         3. �Cuales son los nombres de los planetas del sistema?                   -");
		System.out.println("-         4. �C�mo se llaman y que tama�o tienen los sat�lites de j�piter?          -");
		System.out.println("-         5. �Cu�l es la temperatura del planeta m�s fr�o del sistema?              -");
		System.out.println("-------------------------------------------------------------------------------------");
	}

	public static void limpiarConsola() {for (int i = 0; i < 50; ++i) System.out.println();}
}
