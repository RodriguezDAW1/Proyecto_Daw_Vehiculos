package vehiculos;

/**
 * Clase Acuaticos.
 * 
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
	private final int eslora; // Eslora del Vehiculo acuaticos

	/**
	 * Constructor
	 * 
	 * @param matricula Matricula del veh�culo.
	 * @param modelo    Modelo del veh�culo.
	 * @param eslora    Eslora del veh�culo Acu�tico.
	 */
	public Acuaticos(String matricula, String modelo, int eslora) {
		super(matricula, modelo);
		this.eslora = eslora;
	}

	/**
	 * Método que devuelve la eslora del veh�culo acu�tico.
	 * 
	 * @return La eslora del veh�culo acuatico.
	 */
	public int getEslora() {
		return eslora;
	}

	/**
	 * Metodo que imprime un veh�culo acu�tico.
	 */
	@Override
	protected void imprimir() {
		super.imprimir();
		System.out.print("   Eslora: " + this.eslora + "m.");
	}

	/**
	 * Metodo que comprueba que la matr�cula de los veh�culos acu�ticos est� formada
	 * por entre 3 y 10 letras.
	 * 
	 * @return Devuelve true si la matr�cula se ajusta al patr�n y false en caso
	 *         contrario.
	 */
	@Override
	public boolean comprobarMatricula() {
		// Transforma la matr�cula a may�sculas.
		String matricula = this.getMatricula();
		return matricula.matches("^[A-Z]{3,10}$");
	}
}