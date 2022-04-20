package ejerciciosPOO2.ejercicio6;

/**
 * Clase Aereos.
 * @author Adrian Ubaldo
 */
public class Aereos extends Vehiculos {
    private final int numeroAsientos;   //Número de asientos del vehículo aéreo.
    
    /**
     * Método constructor.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param numeroAsientos Número de asientos del vehículo aéreo.
     */
    public Aereos(String matricula, String modelo, int numeroAsientos){
        super(matricula,modelo);
        this.numeroAsientos=numeroAsientos;
    }

    /**
     * Método que devuelve el número de asientos del vehículo aereo.
     * @return El número de asientos del vehículo aereo.
     */
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    
    /**
     * Método que imprime un vehículo aéreo.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Número de asientos: "+this.numeroAsientos);
    }
    
    /**
     * Método que comprueba que la matrícula de los vehículos aéreos está formada por 4 letras y 6 
     * números.
     * @return Devuelve true si la matrícula se ajusta al patrón y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
        //Transforma la matrícula a mayúsculas.
        String matricula=this.getMatricula();
        return matricula.matches("^[A-Z]{4}[0-9]{6}$");
    }
}