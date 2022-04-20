package Vehiculos;

/**
 * Clase Aereos.
 * @author Mikel
 * @version 2.0
 */
public class Aereos extends Vehiculos {
	 //N� asientos del veh�culo, es un atributo final, no puede cambiar.
    private final int numeroAsientos;  
    
    /**
     * Constructor de Aereos.
     * @param matricula Matr�cula del veh�culo.
     * @param modelo Modelo del veh�culo.
     * @param numeroAsientos N�mero de asientos del veh�culo a�reo.
     */
    public Aereos(String matricula, String modelo, int numeroAsientos) {
    	//Matricula y modelo se heredan de vehiculos
        super(matricula,modelo);
        this.numeroAsientos=numeroAsientos;
    }

    /**
     * M�todo getNumeroAsientos que sirve para devolver el n�mero de asientos del veh�culo aereo.
     * @return El n� de asientos del veh�culo aereo.
     */
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    
    /**
     * M�todo imprimir que imprime los  atributos del veh�culo a�reo que se sobreescribe al metodo imprimir de vehiculos.
     */
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.print ( "El n�mero de asientos del vehiculo es: " + this.numeroAsientos );
    }
    
    /**
     * M�todo comprobarMatricula que comprueba que la matr�cula de los veh�culos a�reos est� formada por 4 letras y 6 n�meros.
     * @return Devuelve true si la matr�cula se ajusta al patr�n y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
    	boolean matri = true;
        String matricula=this.getMatricula();
        if (matricula.matches("^[A-Z]{4}[0-9]{6}$")) {
        } else {
        	matri = false;
        } 
        return matri;
    }
}