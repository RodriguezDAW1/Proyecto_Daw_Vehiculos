package vehiculos.terrestres;

import vehiculos.Terrestres;

/**
 * Clase Coches.
 * @author José A. Rodríguez López
 */
public class Coches extends Terrestres {
    private boolean aireAcondicionado;  //¿Tiene aire acondicionado el coche?

    /**
     * Método constructor.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param numeroRuedas Número de ruedas del vehículo terrestre.
     * @param aireAcondicionado ¿Tiene aire acondicionado el coche?
     */
    public Coches(String matricula, String modelo, int numeroRuedas, boolean aireAcondicionado){
        super(matricula,modelo,numeroRuedas);
        this.aireAcondicionado=aireAcondicionado;
    }

    /**
     * Método que devuelve si tiene o no aire acondicionado el coche.
     * @return ¿Tiene aire acondicionado el coche?
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Método que establece si tiene o no aire acondicionado el coche.
     * @param aireAcondicionado ¿Tiene aire acondicionado el coche?
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Método que imprime un coche.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Aire acondicionado: "+(this.aireAcondicionado?"Si":"No"));
    }
}
