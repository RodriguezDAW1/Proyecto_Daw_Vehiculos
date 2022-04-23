package vehiculos;
/**
 * Clase Terrestres.
 * @author José A. Rodríguez López
 */
public class Terrestres extends Vehiculos {
    private final int numeroRuedas;    //Número de ruedas del vehículo terrestre.

    /**
     * Método constructor.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param numeroRuedas Número de ruedas del vehículo terrestre.
     */
    public Terrestres(String matricula, String modelo, int numeroRuedas){
        super(matricula,modelo);
        this.numeroRuedas=numeroRuedas;
    }

    /**
     * Método que devuelve el numero de ruedas del vehículo terrestre.
     * @return El numero de ruedas del vehículo terrestre.
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * Método que imprime un vehículo terretre.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Número de ruedas "+this.numeroRuedas);
    }

    /**
     * Método que comprueba que la matrícula de los vehículos terrestres está formada por 4 números
     * y 3 letras.
     * @return Devuelve true si la matrícula se ajusta al patrón y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
        //Transforma la matrícula a mayúsculas.
        String matricula=this.getMatricula();
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }
}