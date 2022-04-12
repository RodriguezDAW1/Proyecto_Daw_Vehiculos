package principal;

import flujosDatos.EntradaTeclado;
import vehiculos.ListadoVehiculos;

/**
 * Clase que contiene el método main de inicio de la aplicación.
 * 
 * @author José A. Rodríguez López.
 * @version 1.0
 */
public class Principal {
	public static final EntradaTeclado flujoTeclado = new EntradaTeclado();	//Se crea objeto del flujo de entrada por teclado. 

	/**
	 * Método de entrada a la aplicación.
	 *
	 * @param args No utiliza argumentos de entrada.
	 */
	public static void main(String[] args) {
		ListadoVehiculos listadoVehiculos = new ListadoVehiculos();
		int opcion;

		do {
			opcion = mostrarMenu();
			gestionarMenu(opcion, listadoVehiculos);
		} while (opcion != 5);
		flujoTeclado.cerrarFlujo();
	}

	/**
	 * Método que muestra el menú de la aplicación.
	 *
	 * @return Devuelve la opción elegida del menú.
	 */
	public static int mostrarMenu() {
		System.out.println("*************************************");
		System.out.println("*        GESTIÓN DE VEHÍCULOS       *");
		System.out.println("*************************************");
		System.out.println("1. Insertar vehículo.");
		System.out.println("2. Buscar vehículo.");
		System.out.println("3. Eliminar un vehículo.");
		System.out.println("4. Listar todos los vehículos.");
		System.out.println("5. Salir.");
		return flujoTeclado.leerEntero("Elegir opción: ");
	}

	/**
	 * Método que gestiona el menú
	 *
	 * @param opcion           Opción seleccionada.
	 * @param listadoVehiculos Objeto de la clase ListadoVehiculos.
	 */
	public static void gestionarMenu(int opcion, ListadoVehiculos listadoVehiculos) {
		System.out.println("");
		switch (opcion) {
		case 1 -> { // Insertar vehículo.

		}
		case 2 -> { // Buscar vehículo.

		}
		case 3 -> { // Eliminar un vehículo.

		}
		case 4 -> { // Listar todos los vehículos.

		}
		case 5 -> { // Salir.
			System.out.println("Fin de programa.");
		}
		default -> { // Opciones no contempladas.
			System.out.println("La opción introducida no es válida.");
		}
		}
		System.out.println("");
	}
	
}