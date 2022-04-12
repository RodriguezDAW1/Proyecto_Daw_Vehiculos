package principal;

import java.util.Scanner;

/**
 * Clase que contiene el m�todo main de inicio de la aplicaci�n.
 * 
 * @author Jos� A. Rodr�guez L�pez.
 * @version 1.0
 */
public class Principal {

	/**
     * M�todo de entrada a la aplicaci�n.
     *
     * @param args No utiliza argumentos de entrada.
     */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);		
		int opcion;
		
		do {
			System.out.println("*************************************");
			System.out.println("*        GESTI�N DE VEH�CULOS       *");
			System.out.println("*************************************");
			System.out.println("1. Insertar veh�culo.");
			System.out.println("2. Buscar veh�culo.");
			System.out.println("3. Eliminar un veh�culo.");
			System.out.println("4. Listar todos los veh�culos.");
			System.out.println("5. Salir.");
			System.out.println("5. Salir.");
			System.out.println("Elegir opci�n: ");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:	//Insertar un veh�culo.
				break;
			case 2:	//Buscar un veh�culo.
				break;
			case 3:	//Eliminar un veh�culo.
				break;
			case 4:	//Listar todos los veh�culos.
				break;
			case 5:	//Salir.
				System.out.println("Fin de programa.");
				break;
			default: //Resto opciones.
				System.out.println("La opci�n introducida no es v�lida.");
			}
		}while(opcion!=5);
		teclado.close();
	}
}