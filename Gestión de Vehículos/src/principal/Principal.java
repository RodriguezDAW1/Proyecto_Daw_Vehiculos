package principal;

import java.util.Scanner;

/**
 * Clase que contiene el método main de inicio de la aplicación.
 * 
 * @author José A. Rodríguez López.
 * @version 1.0
 */
public class Principal {

	/**
     * Método de entrada a la aplicación.
     *
     * @param args No utiliza argumentos de entrada.
     */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);		
		int opcion;
		
		do {
			System.out.println("*************************************");
			System.out.println("*        GESTIÓN DE VEHÍCULOS       *");
			System.out.println("*************************************");
			System.out.println("1. Insertar vehículo.");
			System.out.println("2. Buscar vehículo.");
			System.out.println("3. Eliminar un vehículo.");
			System.out.println("4. Listar todos los vehículos.");
			System.out.println("5. Salir.");
			System.out.println("5. Salir.");
			System.out.println("Elegir opción: ");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:	//Insertar un vehículo.
				break;
			case 2:	//Buscar un vehículo.
				break;
			case 3:	//Eliminar un vehículo.
				break;
			case 4:	//Listar todos los vehículos.
				break;
			case 5:	//Salir.
				System.out.println("Fin de programa.");
				break;
			default: //Resto opciones.
				System.out.println("La opción introducida no es válida.");
			}
		}while(opcion!=5);
		teclado.close();
	}
}