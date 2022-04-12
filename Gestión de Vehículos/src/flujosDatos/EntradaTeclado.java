package flujosDatos;

import java.util.Scanner;

/**
 * Clase para gestionar y validar la entrada de datos por teclado.
 * @author Jos� A. Rodr�guez L�pez
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
     * M�todo que solicita un n�mero entero y verifica que el dato es v�lido.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve el n�mero entero introducido como respuesta.
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
                System.out.println("El dato introducido no se puede convertir a un n�mero entero.");
                valido = false;
            }
        } while (!valido);
        return num;
    }

    /**
     * M�todo que comprueba que el n�mero entero sea v�lido.
     *
     * @param num N�mero entero a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si la el n�mero es v�lido y false en caso contrario.
     */
    public boolean validaEntero(int num, String mensaje) {
        boolean valido = true;
        //Tipo de entero a verificar.
        //if (mensaje.equals("")) {
        //}
        return valido;
    }

    /**
     * M�todo que solicita un n�mero real y verifica que el dato es v�lido.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve el n�mero real introducido como respuesta.
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
                System.out.println("El dato introducido no se puede convertir a un n�mero real.");
                valido = false;
            }
        } while (!valido);
        return num;
    }

    /**
     * M�todo que comprueba que un n�mero real sea v�lido dependiendo del tipo de dato.
     *
     * @param num N�mero real a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si el dato es v�lido y false en caso contrario.
     */
    public boolean validaReal(double num, String mensaje) {
        boolean valido = true;
        //Tipo de real a verificar.
        //if (mensaje.equals("")) {
        //}
        return valido;
    }

    /**
     * M�todo para leer una cadena de caracteres.
     *
     * @param mensaje Cadena de texto a mostrar al solicitar el dato.
     * @return Devuelve la cadena le�da.
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
     * M�todo que comprueba que una cadena de caracteres sea v�lida dependiendo del tipo de dato.
     *
     * @param cad Cadena de caracteres a validar.
     * @param mensaje Cadena que representa el tipo de dato a validar.
     * @return Devuelve true si la cadena es v�lida y false en caso contrario.
     */
    public boolean validaCadena(String cad, String mensaje) {
        boolean valido = true;
        //Si la cadena est� vac�a o solamente contiene espacios.
        if (cad.isBlank()) {
            System.out.println("La cadena est� vacia o solo contiene espacios.");
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
     * M�todo que cierra el flujo del Scanner.
     */
    public void cerrarFlujo() {
    	teclado.close();
    }
}