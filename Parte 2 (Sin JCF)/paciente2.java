public class paciente<E> implements Comparable<E>{
	
	/** The nombre paciente. */
	private String nombre;
	
	/** The enfermedad. */
	private String caso;
	
	/** The prioridad. */
	private String prioridad;

	/**
	 * Instantiates a new paciente.
	 *
	 * @param nombrePaciente the nombre paciente
	 * @param enfermedad the enfermedad
	 * @param prioridad the prioridad
	 */
	public paciente(String Paciente, String Caso, String Prioridad) {
		super();
		this.nombre = Paciente;
		this.caso = Caso;
		this.prioridad = Prioridad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(E Paciente) {
		// TODO Auto-generated method stub
		return this.prioridad.compareTo(((paciente ) Paciente).getPrioridad());
	}

	/**
	 * Gets the nombre paciente.
	 *
	 * @return the nombre paciente
	 */
	public String getNombrePaciente() {
		return nombre;
	}

	/**
	 * Sets the nombre paciente.
	 *
	 * @param nombrePaciente the new nombre paciente
	 */
	public void setNombrePaciente(String Paciente) {
		this.nombre = Paciente;
	}

	/**
	 * Gets the enfermedad.
	 *
	 * @return the enfermedad
	 */
	public String getCaso() {
		return caso;
	}

	/**
	 * Sets the enfermedad.
	 *
	 * @param enfermedad the new enfermedad
	 */
	public void setEnfermedad(String enfermedad) {
		this.caso = enfermedad;
	}

	/**
	 * Gets the prioridad.
	 *
	 * @return the prioridad
	 */
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * Sets the prioridad.
	 *
	 * @param prioridad the new prioridad
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	
}