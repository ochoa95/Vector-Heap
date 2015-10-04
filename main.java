import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
	
	
	public static void main(String[] args){
		
		
		
		try{
			
			FileInputStream Stream = new FileInputStream("pacientes.txt");
			DataInputStream Stream2 = new DataInputStream(Stream);
			BufferedReader Stream3 = new BufferedReader(new InputStreamReader(Stream2));
			VectorHeap<String> V = new VectorHeap<String>();
			String Linea;
			int nopa = 0;
			
			int i=0;
			int principio =0;
			int nop =0;
			String[] partes = new String[3];
			
			
			System.out.println("Listado de Pacientes: \n");
			while ((Linea = Stream3.readLine())!=null){
				System.out.println(Linea+"\n");
			}
			
			
			while ((Linea = Stream3.readLine())!=null){
				
				principio = 0;
				nop = 0;
				i=0;
				
				V.add(Linea);
				nopa = nopa +1;

			}
			Stream2.close();
			
			String lista;
			for (i=0;i<nopa;i++){
				lista = V.remove();
				System.out.println(lista);
			}
			
			
			
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	
}