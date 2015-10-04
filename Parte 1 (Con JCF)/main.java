/*
 * Delbert Custodio, 14246
 * Jose Angel Ochoa, 14320
 * 
 * 
 * Este main implementa el JCF para la Priority Queue
 * 
 * */



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Delbert Custodio, 14246; Angel Ochoa, 14320
 *
 */
public class main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		int nopa = 0;
		VectorHeap V  = new VectorHeap();
		@SuppressWarnings("rawtypes")
		Vector<paciente> Pacientes = new Vector<paciente>();
		
		try{
			FileInputStream Stream = new FileInputStream("pacientes.txt");
			DataInputStream Stream2 = new DataInputStream(Stream);
			BufferedReader Stream3 = new BufferedReader(new InputStreamReader(Stream2));
			String Linea;
			String[] partes = new String[3];
			int i;
			int cantP =0;
			

			//Lectura del archivo txt y la lista de pacientes
			
			System.out.println("Lista de pacientes:");
			while ( ( Linea = Stream3.readLine() )!=null){
				int principio=0;
	            int nop=0;
	            i =0;
	            for(int n = 0; n <Linea.length(); n++){
                    if(Character.toString(Linea.charAt(n)).equals(",") && i<3){
                        partes[i] = Linea.substring(principio, n);
                        principio = n+1;
                        nop=nop+1;
                        i = i+1;
                    } 
                 } 
	            i=0;
	            partes[2]= Linea.substring(principio+1, Linea.length());
	            Pacientes.add(new paciente<String>(partes[0],partes[1],partes[2]));
	            cantP++;
	            System.out.println(partes[0]+","+partes[1]+","+partes[2]);
			}
			Stream2.close();
			
			
			
			//Impresion del orden de atencion
			System.out.println("\n Lista en orden de atencion:");
			
			String OrdenP="";
			VectorHeap V2 = new VectorHeap(Pacientes);
			for (i=0;i<cantP;i++){
				paciente pacientes = (paciente) V2.remove();
				OrdenP = OrdenP+pacientes.getNombrePaciente()+" "+","+pacientes.getCaso()+" "+","+pacientes.getPrioridad()+"\n";    
			}
			
			System.out.println(OrdenP);	
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Hubo error, reinicie el programa");
		}
	}
}