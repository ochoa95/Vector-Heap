import java.util.*;

public class paciente<E> implements Comparable<E>{

	

	public paciente(String a,String b,String c){
		
		Nombre = a;
		Caso = b;
		Prioridad = c;
		
	}
	
	private String Nombre;
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getCaso() {
		return Caso;
	}


	public void setCaso(String caso) {
		Caso = caso;
	}


	public String getPrioridad() {
		return Prioridad;
	}


	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}


	private String Caso;
	private String Prioridad;
	
	@Override
	public int compareTo(E arg0) {
		
		return 0;
	}

}