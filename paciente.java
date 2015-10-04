import java.util.*;

public class paciente<E > implements Comparable<E>{

	private String Caso;
	private String Prioridad;
	private String Nombre;

	public paciente(String a,String b,String c){
		
		Nombre = a;
		Caso = b;
		Prioridad = c;
		
	}
	
	
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


	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}

}