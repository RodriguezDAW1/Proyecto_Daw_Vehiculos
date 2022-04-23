package vehiculos;

/**
 * Clase Acuaticos.
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
    private final int eslora;   //Eslora del Vehiculo acuaticos.
    
    /**
     * Constructor.
     * @param matricula Matricula del vehiculo.
     * @param modelo Modelo del vehiculo.
     * @param eslora Eslora del vehiculo Acuatico.
     */
    public Acuaticos(String matricula, String modelo, int eslora){
        super(matricula,modelo);
        this.eslora=0;
    }

     
    /**
     * Metodo que imprime un vehiculo acuaticoo.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Eslora: "+this.eslora+"m.");
    }
    
    /**
     * Metodo que comprueba que la matri�cula de los vehi�culos acuaticos esta� formada por entre 3 y 
     * 10 letras.
     * @return Devuelve true si la matri�cula se ajusta al patron y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
        //Transforma la matri�cula a mayusculas.
        String matricula=this.getMatricula();
        return matricula.matches("^[A-Z]{3,10}$");
    }
}