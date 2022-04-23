package vehiculos;

/**
 * Clase Acuaticos.
 * 
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
	private final int eslora; // Eslora del vehículo acuático.

	/**
	 * Constructor
	 * 
	 * @param matri Matrícula del vehículo.
	 * @param modelo    Modelo del vehículo.
	 * @param eslora    Eslora del vehículo acuático.
	 */
	public Acuaticos(String matri, String modelo, int eslora) {
		super(matri, modelo);
		this.eslora = eslora;
	}

	/**
	 * Método que devuelve la eslora del vehículo acuático.
	 * 
	 * @return La eslora del vehículo acuático.
	 */
	public int getEslora() {
		return eslora;
	}

	/**
	 * Metodo que imprime un vehículo acuático.
	 */
	@Override
	protected void imprimir() {
		super.imprimir();
		System.out.print("   Eslora: " + this.eslora + "metros.");
	}

	/**
	 * Metodo que comprueba que la matrícula de los vehículos acuáticos está formada
	 * por entre 3 y 10 letras.
	 * 
	 * @return Devuelve true si la matrícula se ajusta al patrón y false en caso
	 *         contrario.
	 */
	@Override
	public boolean comprobarMatricula() {
		// Transforma la matr�cula a may�sculas.
		String matricula = this.getMatricula();
		return matricula.matches("^[A-Z]{3,10}$");
	}
}
