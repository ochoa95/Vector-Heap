public class paciente2<E> implements Comparable<E>{
	
	/**  */
	private String nombre;
	
	/**  */
	private String caso;
	
	/**  */
	private String prioridad;

	/**
	 * 
	 */
	public paciente2(String Paciente, String Caso, String Prioridad) {
		super();
		this.nombre = Paciente;
		this.caso = Caso;
		this.prioridad = Prioridad;
	}


	public int compareTo(E Paciente) {
		// TODO Auto-generated method stub
		return this.prioridad.compareTo(((paciente2) Paciente).getPrioridad());
	}

	/**
	 * 
	 */
	public String getNombrePaciente() {
		return nombre;
	}

	/**
	 * 
	 */
	public void setNombrePaciente(String Paciente) {
		this.nombre = Paciente;
	}

	/**
	 * 
	 */
	public String getCaso() {
		return caso;
	}

	/**
	 * 
	 */
	public void setEnfermedad(String enfermedad) {
		this.caso = enfermedad;
	}

	/**
	 * 
	 */
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * 
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	
}