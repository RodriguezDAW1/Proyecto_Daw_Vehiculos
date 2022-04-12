package principal;

import flujosDatos.EntradaTeclado;
import vehiculos.ListadoVehiculos;

/**
 * Clase que contiene el m�todo main de inicio de la aplicaci�n.
 * 
 * @author Jos� A. Rodr�guez L�pez.
 * @version 1.0
 */
public class Principal {
	public static final EntradaTeclado flujoTeclado = new EntradaTeclado();	//Se crea objeto del flujo de entrada por teclado. 

	/**
	 * M�todo de entrada a la aplicaci�n.
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
	 * M�todo que muestra el men� de la aplicaci�n.
	 *
	 * @return Devuelve la opci�n elegida del men�.
	 */
	public static int mostrarMenu() {
		System.out.println("*************************************");
		System.out.println("*        GESTI�N DE VEH�CULOS       *");
		System.out.println("*************************************");
		System.out.println("1. Insertar veh�culo.");
		System.out.println("2. Buscar veh�culo.");
		System.out.println("3. Eliminar un veh�culo.");
		System.out.println("4. Listar todos los veh�culos.");
		System.out.println("5. Salir.");
		return flujoTeclado.leerEntero("Elegir opci�n: ");
	}

	/**
	 * M�todo que gestiona el men�
	 *
	 * @param opcion           Opci�n seleccionada.
	 * @param listadoVehiculos Objeto de la clase ListadoVehiculos.
	 */
	public static void gestionarMenu(int opcion, ListadoVehiculos listadoVehiculos) {
		System.out.println("");
		switch (opcion) {
		case 1 -> { // Insertar veh�culo.

		}
		case 2 -> { // Buscar veh�culo.

		}
		case 3 -> { // Eliminar un veh�culo.

		}
		case 4 -> { // Listar todos los veh�culos.

		}
		case 5 -> { // Salir.
			System.out.println("Fin de programa.");
		}
		default -> { // Opciones no contempladas.
			System.out.println("La opci�n introducida no es v�lida.");
		}
		}
		System.out.println("");
	}
	
}