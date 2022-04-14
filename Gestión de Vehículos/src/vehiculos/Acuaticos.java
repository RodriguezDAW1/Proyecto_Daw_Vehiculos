package vehiculos;

/**
 * Clase Acuaticos.
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
    private final int eslora;   //Eslora del Vehiculo acuaticos.
    
    /**
     * onstructor.
     * @param matricula Matricula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param eslora Eslora del vehículo Acuatico.
     */
    public Acuaticos(String matricula, String modelo, int eslora){
        super(matricula,modelo);
        this.eslora=eslora;
    }

    /**
     * Metodo que devuelve la eslora del Acuatico acuatico.
     * @return La eslora del vehiculo acuatico.
     */
    public int getEslora() {
        return eslora;
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
     * Metodo que comprueba que la matri­cula de los vehi­culos acuaticos esta¡ formada por entre 3 y 
     * 10 letras.
     * @return Devuelve true si la matri­cula se ajusta al patron y false en caso contrario.
     */
    @Override
    public boolean comprobarMatricula() {
        //Transforma la matri­cula a mayusculas.
        String matricula=this.getMatricula();
        return matricula.matches("^[A-Z]{3,10}$");
    }
}