package vehiculos;

/**
 * Clase Acuaticos.
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
    private final int eslora;   //Eslora del vehículo acuáticos.
    
    /**
     * Constructor.
     * @param matri Matricula del vehículo.
     * @param mod Modelo del vehículo.
     * @param eslora Eslora del vehículo acuático.
     */
    public Acuaticos(String matri, String mod, int eslora){
        super(matri,mod);
        this.eslora=0;
    }

     
    /**
     * Método que devuelve la eslora del vehículo acuatico.
     * @return La eslora del vehiculo acuatico.
     */
    public int getEslora() {
        return eslora;
    }
    
    /**
     * Método que imprime un vehiculo acuático.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Eslora: "+this.eslora+"m.");
    }
    
    /**
     * Método que comprueba que la matricula de los vehículos acuáticos está formada por entre 3 y 
     * 10 letras.
     * @return Devuelve true si la matrícula se ajusta al patrón y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
        //Transforma la matrícula a mayúsculas.
        String matricula=this.getMatricula();
        return matricula.matches("^[A-Z]{3,10}$");
    }
}