package flujosDatos;

import java.util.Scanner;

/**
 * Clase para gestionar y validar la entrada de datos por teclado.
 * @author José A. Rodríguez López
 */
public class EntradaTeclado {
	private static Scanner teclado;	//Objeto de la clase Scanner.
	
	/**
	 * Constructor de la clase EntradaTeclado.
	 */
	public EntradaTeclado() {
		teclado=new Scanner(System.in, "ISO-8859-1");
	}
    
	/**
     * Método que solicita un número entero y verifica que el dato es válido.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve el número entero introducido como respuesta.
     */
    public int leerEntero(String mensaje) {
        boolean valido;
        int num = 0;

        do {
            try {
                System.out.print(mensaje);
                num = Integer.parseInt(teclado.nextLine());
                //Validar entero
                valido = validaEntero(num, mensaje);
            } catch (NumberFormatException e) {
                System.out.println("El dato introducido no se puede convertir a un número entero.");
                valido = false;
            }
        } while (!valido);
        return num;
    }

    /**
     * Método que comprueba que el número entero sea válido.
     *
     * @param num Número entero a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si la el número es válido y false en caso contrario.
     */
    public boolean validaEntero(int num, String mensaje) {
        boolean valido = true;
        //Tipo de entero a verificar.
        //if (mensaje.equals("")) {
        //}
        return valido;
    }

    /**
     * Método que solicita un número real y verifica que el dato es válido.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve el número real introducido como respuesta.
     */
    public double leerReal(String mensaje) {
        boolean valido;
        double num = 0;

        do {
            try {
                System.out.print(mensaje);
                num = Double.parseDouble(teclado.nextLine());
                //Validar real.
                valido = validaReal(num, mensaje);
            } catch (NumberFormatException e) {
                System.out.println("El dato introducido no se puede convertir a un número real.");
                valido = false;
            }
        } while (!valido);
        return num;
    }

    /**
     * Método que comprueba que un número real sea válido dependiendo del tipo de dato.
     *
     * @param num Número real a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si el dato es válido y false en caso contrario.
     */
    public boolean validaReal(double num, String mensaje) {
        boolean valido = true;
        //Tipo de real a verificar.
        //if (mensaje.equals("")) {
        //}
        return valido;
    }

    /**
     * Método para leer una cadena de caracteres.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve la cadena leída.
     */
    public String leerCadena(String mensaje) {
        String cad;
        do {
            System.out.print(mensaje);
            cad = teclado.nextLine().trim();
        } while (!validaCadena(cad, mensaje));
        return cad;
    }

    /**
     * Método que comprueba que una cadena de caracteres sea válida dependiendo del tipo de dato.
     *
     * @param cad Cadena de caracteres a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si la cadena es válida y false en caso contrario.
     */
    public boolean validaCadena(String cad, String mensaje) {
        boolean valido = true;
        //Si la cadena está vacía o solamente contiene espacios.
        if (cad.isBlank()) {
            System.out.println("La cadena está vacia o solo contiene espacios.");
            valido=false;
        } else {
            //Resto de validaciones.
            //Tipo de cadena a verificar.
            //if (mensaje.equals("")) {
            //}
        }
        return valido;
    }
    
    /**
     * Método que cierra el flujo del Scanner.
     */
    public void cerrarFlujo() {
    	teclado.close();
    }
}