package vehiculos;

/**
 * Clase abstracta que describe los vehiculos.
 * @author Jos� A. Rodr�guez L�pez
 * @version 1.0
 */
public abstract class Vehiculos {
    private final String matricula; //Matr�cula del veh�culo.
    private final String modelo;    //Modelo del veh�culo.
    
    /**
     * M�todo constructor.
     * @param matricula Matr�cula del veh�culo.
     * @param modelo Modelo del veh�culo.
     */
    public Vehiculos(String matricula, String modelo){
        this.matricula=matricula.toUpperCase();
        this.modelo=modelo;
    }
    
    /**
     * M�todo que devuelve la matr�cula del veh�culo.
     * @return La matr�cula del veh�culo. 
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * M�todo que devuelve el modelo del veh�culo.
     * @return El modelo del veh�culo.
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * M�todo abstracto que comprueba si la matr�cula se ajusta al patr�n seg�n el tipo de veh�culo.
     * @return Devuelve true si la matr�cula se ajusta al patr�n seg�n el tipo de veh�culo o false 
     * en caso contrario.
     */
    public abstract boolean comprobarMatricula();
    
    /**
     * M�todo que imprime un veh�culo.
     */
    protected void imprimir(){
        System.out.print("Matricula: "+this.matricula+"   Modelo: "+this.modelo);
    }
}