package Vehiculos;

/**
 * Clase Aereos.
 * @author Mikel
 * @version 2.0
 */
public class Aereos extends Vehiculos {
	 //Nº asientos del vehículo, es un atributo final, no puede cambiar.
    private final int numeroAsientos;  
    
    /**
     * Constructor de Aereos.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param numeroAsientos Número de asientos del vehículo aéreo.
     */
    public Aereos(String matricula, String modelo, int numeroAsientos) {
    	//Matricula y modelo se heredan de vehiculos
        super(matricula,modelo);
        this.numeroAsientos=numeroAsientos;
    }

    /**
     * Método getNumeroAsientos que sirve para devolver el número de asientos del vehículo aereo.
     * @return El nº de asientos del vehículo aereo.
     */
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    
    /**
     * Método imprimir que imprime los  atributos del vehículo aéreo que se sobreescribe al metodo imprimir de vehiculos.
     */
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.print ( "El número de asientos del vehiculo es: " + this.numeroAsientos );
    }
    
    /**
     * Método comprobarMatricula que comprueba que la matrícula de los vehículos aéreos está formada por 4 letras y 6 números.
     * @return Devuelve true si la matrícula se ajusta al patrón y false en caso contrario.
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