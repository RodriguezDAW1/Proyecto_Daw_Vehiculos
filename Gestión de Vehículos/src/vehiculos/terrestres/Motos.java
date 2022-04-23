package vehiculos.terrestres;

import vehiculos.Terrestres;

/**
 * Clase Motos.
 * @author José A. Rodríguez López
 */
public class Motos extends Terrestres {
    private String color;   //Color de la moto.

    /**
     * Método constructor.
     * @param matricula Matrícula del vehículo.
     * @param modelo Modelo del vehículo.
     * @param numeroRuedas Número de ruedas del vehículo terrestre.
     * @param color Color de la moto.
     */
    public Motos(String matricula, String modelo, int numeroRuedas, String color){
        super(matricula,modelo,numeroRuedas);
        this.color=color;
    }

    /**
     * Método que devuelve el color del coche.
     * @return El color color del coche.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que establece el color del coche.
     * @param color El color del coche.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que imprime una moto.
     */
    @Override
    protected void imprimir(){
        super.imprimir();
        System.out.print("   Color: "+this.color);
    }
}