package vehiculos;

/**
 * Clase abstracta que describe los vehiculos.
 * @author José A. Rodríguez López
 * @version 1.0
 */
public abstract class Vehiculos {
    private final String matricula; //Matrícula del vehículo.
    private final String modelo;    //Modelo del vehículo.
    
    /**
     * Método constructor.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     */
    public Vehiculos(String matricula, String modelo){
        this.matricula=matricula.toUpperCase();
        this.modelo=modelo;
    }
    
    /**
     * Método que devuelve la matrícula del vehículo.
     * @return La matrícula del vehículo. 
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método que devuelve el modelo del vehículo.
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * Método abstracto que comprueba si la matrícula se ajusta al patrón según el tipo de vehículo.
     * @return Devuelve true si la matrícula se ajusta al patrón según el tipo de vehículo o false 
     * en caso contrario.
     */
    public abstract boolean comprobarMatricula();
    
    /**
     * Método que imprime un vehículo.
     */
    protected void imprimir(){
        System.out.print("Matricula: "+this.matricula+"   Modelo: "+this.modelo);
    }
}