/*
 * Clase que se encarga de guardar la ficha de los pacientes
 * 
 * */

/**
 * Clase que se encarga de gaurdar las fichas de los pacientes
 *
 * @param <E>
 */
public class paciente<E> implements Comparable<E>{
	
	private String nombre;
	private String caso;
	private String prioridad;

	/**
	 * 
	 */
	public paciente(String Paciente, String Caso, String Prioridad) {
		super();
		this.nombre = Paciente;
		this.caso = Caso;
		this.prioridad = Prioridad;
	}

	public int compareTo(E Paciente) {
		return this.prioridad.compareTo(((paciente) Paciente).getPrioridad());
	}

	/**
	 * Devuelve el nombre.
	 *
	 * @return nombre
	 */
	public String getNombrePaciente() {
		return nombre;
	}

	/**
	 * 
	 *Setters y Getters de aqui para abajo
	 * @param 
	 */
	public void setNombrePaciente(String Paciente) {
		this.nombre = Paciente;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getCaso() {
		return caso;
	}

	/**
	 * .
	 *
	 * @param 
	 */
	public void setCaso(String Caso) {
		this.caso = Caso;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * 
	 *
	 * @param 
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	
}