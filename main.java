import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
	
	
	public static void main(String[] args){
		
		Queue<paciente> V = new PriorityQueue();
		int nopa = 0;
		
		try{
			
			FileInputStream Stream = new FileInputStream("pacientes.txt");
			DataInputStream Stream2 = new DataInputStream(Stream);
			BufferedReader Stream3 = new BufferedReader(new InputStreamReader(Stream2));
			String Linea;
			
			int i=0;
			int principio =0;
			int nop =0;
			String[] partes = new String[3];
			
			while ((Linea = Stream3.readLine())!=null){
				
				principio = 0;
				nop = 0;
				i=0;
				
				for(int n = 0; n <  Linea.length(); n++){
					if (Character.toString(Linea.charAt(n)).equals(",") && i <3)
					{
						partes[i] = Linea.substring(principio,n);
						principio = n+1;
						nop = nop +1;
						i = i+1;	
					}	
				}
				i =0;
				partes[2] = Linea.substring(principio+1,Linea.length());
				V.add(new paciente<String>(partes[0],partes[1],partes[2]));
				nopa = nopa +1;
			}
			Stream2.close();
			
			 paciente<String>  ficha;  
				for(int i1=0; i1<nopa; i1++){
					ficha = V.poll();
					System.out.println(ficha.getNombre()+","+ficha.getCaso()+", "+ficha.getPrioridad());
				}	
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	
}