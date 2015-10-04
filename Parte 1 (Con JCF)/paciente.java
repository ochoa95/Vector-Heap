/*
 * Clase que se encarga de guardar la ficha de los pacientes
 * 
 * */

public class paciente<E> implements Comparable<E>{
	
	private String nombre;
	private String caso;
	private String prioridad;

	/**
	 * Instantiates a new paciente.
	 *
	 * @param nombre
	 * @param Caso: caso del paciente
	 * @param prioridad
	 */
	public paciente(String Paciente, String Caso, String Prioridad) {
		super();
		this.nombre = Paciente;
		this.caso = Caso;
		this.prioridad = Prioridad;
	}

	public int compareTo(E Paciente) {
		return this.prioridad.compareTo(((paciente ) Paciente).getPrioridad());
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
	 *
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
	public void setEnfermedad(String enfermedad) {
		this.caso = enfermedad;
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