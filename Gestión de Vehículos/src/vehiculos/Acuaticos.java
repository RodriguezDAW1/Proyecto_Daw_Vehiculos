package vehiculos;

/**
 * Clase Acuaticos.
 * 
 * @author Salama Hassani
 */
public class Acuaticos extends Vehiculos {
	private final int esloa; // Eslora del vehículo acuático.

	/**
	 * Constructor
	 * 
	 * @param matricula Matrícula del vehículo.
	 * @param modelo    Modelo del vehículo.
	 * @param eslora    Eslora del vehículo acuático.
	 */
	public Acuaticos(String matricula, String modelo, int esloraAcuatico) {
		super(matricula, modelo);
		this.esloa = esloraAcuatico;
	}

	/**
	 * Método que devuelve la eslora del vehículo acuático.
	 * 
	 * @return La eslora del vehículo acuático.
	 */
	public int getEslora() {
		return esloa;
	}

	/**
	 * Metodo que imprime un vehículo acuático.
	 */
	@Override
	protected void imprimir() {
		super.imprimir();
		System.out.print("   Eslora: " + this.esloa + "metros.");
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
		// Transforma la matrícula a mayúsculas.
		String matricula = this.getMatricula();
		return matricula.matches("^[A-Z]{3,10}$");
	}
}