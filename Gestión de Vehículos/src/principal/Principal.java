package principal;

import flujosDatos.EntradaTeclado;
import vehiculos.ListadoVehiculos;

/**
 * Clase que contiene el mÃ©todo main de inicio de la aplicaciÃ³n.
 * 
 * @author Mikel Bermejo Jorge
 * @author JosÃ© A. RodrÃ­guez LÃ³pez.
 * @author Daniel LÃ³pez Tardajos.
 * @version 1.0
 */
public class Principal {
	public static final EntradaTeclado flujoTeclado = new EntradaTeclado(); // Se crea objeto del flujo de entrada por
																			// teclado.

	/**
	 * MÃ©todo de entrada a la aplicaciÃ³n.
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
	 * MÃ©todo que muestra el menÃº de la aplicaciÃ³n.
	 *
	 * @return Devuelve la opciÃ³n elegida del menÃº.
	 */
	public static int mostrarMenu() {
		System.out.println("*************************************");
		System.out.println("*        GESTIÃ“N DE VEHÃ�CULOS       *");
		System.out.println("*************************************");
		System.out.println("1. Insertar vehÃ­culo.");
		System.out.println("2. Buscar vehÃ­culo.");
		System.out.println("3. Eliminar un vehÃ­culo.");
		System.out.println("4. Listar todos los vehÃ­culos.");
		System.out.println("5. Salir.");
		return flujoTeclado.leerEntero("Elegir opciÃ³n: ");
	}

	/**
	 * MÃ©todo que gestiona el menÃº.
	 *
	 * @param opcion           OpciÃ³n seleccionada.
	 * @param listadoVehiculos Objeto de la clase ListadoVehiculos.
	 */
	public static void gestionarMenu(int opcion, ListadoVehiculos listadoVehiculos) {
		System.out.println("");
		switch (opcion) {
		case 1 -> { // Insertar vehÃ­culo.

		}
		case 2 -> { // Buscar vehÃ­culo.

		}
		case 3 -> { // Eliminar un vehÃ­culo.

		}
		case 4 -> { // Listar todos los vehÃ­culos.

		}
		case 5 -> { // Salir.
			System.out.println("Fin de programa.");
		}
		default -> { // Opciones no contempladas.
			System.out.println("La opciÃ³n introducida no es vÃ¡lida.");
		}
		}
		System.out.println("");
	}
}