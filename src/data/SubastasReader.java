package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import model.Role;
import model.Subasta;
import model.User;

public class SubastasReader {
	    private static String filename = "subastas.csv";
	    private static String[] headers;
	    public static HashMap<String, Subasta> subastas = new HashMap<>();

	    public Integer loadsubastas(String path) throws FileNotFoundException, IOException{
	        BufferedReader br = new BufferedReader(new FileReader(path+filename));
			String line = br.readLine(); // Salto de primera linea
	        headers = line.split(",");
			line = br.readLine();
			while (line != null) 
			{
				String[] partes = line.split(","); 
				String pieza = partes[0].strip();
	            String valorInicial = partes[1].strip();
	            String valorMinimo = partes[2].strip();
	            Integer oferta = Integer.parseInt(partes[3].strip());
	            Boolean abierta = Boolean.parseBoolean(partes[4].strip());

	            Subasta subasta = new Subasta(pieza,valorInicial,valorMinimo,oferta,abierta);
	            
	            subastas.put(pieza, subasta);

	            line = br.readLine();
	                
			}
			br.close();
			
			return subastas.size();
	    }
	    
	    
	    public Boolean sync(String path) throws FileNotFoundException, IOException{
	        FileWriter editor = new FileWriter(path + filename);
	        editor.write(headers + "\n");
	        // ArrayList<String> data = new ArrayList<>();
	        for (Subasta subasta : subastas.values()) {
	            String row = subasta.getPieza() + "," + subasta.getValorInicial() + "," + subasta.getValorMinimo() + ","
	                    + subasta.getOferta()+ "," + subasta.getAbierta();
	            // data.add(row + "\n");
	            editor.append(row + "\n");
	        }
	        editor.flush();
	        editor.close();
	        return false;
	    }
}
